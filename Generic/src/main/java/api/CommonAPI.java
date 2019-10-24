package api;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import report.ExtentManager;
import report.ExtentTestManager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver;
    public static WebDriver getLocalDriver(String platform,String browser){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        if(platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","..\\Generic\\src\\main\\resources\\chromedriver.exe");
            driver= new ChromeDriver(chromeOptions);
        }else if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","..\\Generic\\src\\main\\resources\\chromedriver");
            driver= new ChromeDriver(chromeOptions);
        }else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","..\\Generic\\src\\main\\resources\\geckodriver.exe");
            driver= new FirefoxDriver(chromeOptions);
        }else if (platform.equalsIgnoreCase("mac")&& browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","..\\Generic\\src\\main\\resources\\geckodriver");
            driver= new FirefoxDriver(chromeOptions);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        return driver;
    }
    @AfterMethod
    public void exit(){
        driver.close();
        driver.quit();
    }
    public void sleepFor(int seconds){
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static String sauceUserName="";
    public static String saucePassword="";
    public static String getSauceUrl="";

    public static WebDriver getCloudDriver(String browser,String browserVersion,String platform,
                                  String envName) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("name","cloud execution");
        desiredCapabilities.setCapability("browerName",platform);
        desiredCapabilities.setCapability("browser_Version",browserVersion);
        desiredCapabilities.setCapability("os",platform);
        desiredCapabilities.setCapability("os_version","Windows 10");
        envName.equalsIgnoreCase("sauselabs");
        desiredCapabilities.setCapability("resolution","1600x1200");
        driver=new RemoteWebDriver(new URL(getSauceUrl),desiredCapabilities);
        return driver;
    }

    @Parameters({"platform","url","browserVersion","browser","envName","cloud"})
    @BeforeMethod
   public static WebDriver setupDriver(String platform, String url, String browserVersion,
                                       String browser, String evnName,boolean cloud) throws MalformedURLException {
        if(cloud){
            driver= getCloudDriver(browser,browserVersion,platform,evnName);
        }else {
            driver=getLocalDriver(platform,browser);
        }
        driver.get(url);
        return driver;
    }
    public static void captureScreenshot(WebDriver driver,String screenshotName){
        DateFormat dateFormat = new SimpleDateFormat("MM.dd.yyyy-HH.mm.ss");
        Date date= new Date();
        String uniqueName = dateFormat.format(date);
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screnshots/" + screenshotName + uniqueName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ExtentReports extent;

    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));
        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }
        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot (driver,result.getName());
        }
    }
    private Date getTimeByMiliseconds(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
    public Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
    @AfterSuite
    public void generateReport() {
        extent.close();
    }
    public void clickOnElementByXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickOnElementById(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void typeOnElementByXpath(String locator,String value){
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }
    public void typeOnElementById(String locator,String value){
        driver.findElement(By.xpath(locator)).sendKeys();
    }
    public void clickOnElementByLinkedText(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void getText(String locator){
        driver.findElement(By.xpath(locator)).getText();
    }
    public boolean isElementDisplayed(String locator){
        return driver.findElement(By.xpath(locator)).isDisplayed();
    }
    public boolean isElementEnabled(String locator){
        return driver.findElement(By.xpath(locator)).isEnabled();
    }
    public boolean isElementSelected(String locator){
        return driver.findElement(By.xpath(locator)).isSelected();
    }
    public WebElement elementByXpath(String locator){
        return driver.findElement(By.xpath(locator));
    }
    public WebElement elementByLinkedText(String locator){
        return driver.findElement(By.linkText(locator));
    }
    public void clickOnElementByClassName(String locator){
        driver.findElement(By.className(locator));
    }

}

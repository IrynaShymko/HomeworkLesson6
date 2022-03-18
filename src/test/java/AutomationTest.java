import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Execution(ExecutionMode.CONCURRENT)
public class AutomationTest {
    private WebDriver driver;

    @BeforeAll
    static void beforeAll() {
        WebDriverManager.chromedriver().setup();
        System.out.println("@BeforeAll executed");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("@AfterAll executed");
    }

    @BeforeEach
    void setUp() {
        driver=new ChromeDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Tag("regression")
    @Tag("siiPortal")
    @DisplayName("Testing site title - siiPortal")
    @ParameterizedTest
    @CsvSource({"https://siiportal.sii.pl/, Sign in to your account" })
    void seleniumTest1(String siteUrl, String expectedTitle) {
        driver.get(siteUrl);
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat("Title of site " + siteUrl+ " is not correct",actualTitle, equalTo(expectedTitle));
    }

    @Tag("regression")
    @Tag("onet")
    @DisplayName("Testing site title - onet")
    @ParameterizedTest
    @CsvSource({"https://onet.pl, Onet – Jesteś na bieżąco"})
    void seleniumTest2(String siteUrl, String expectedTitle) {
        driver.get(siteUrl);
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat("Title of site " + siteUrl+ " is not correct",actualTitle, equalTo(expectedTitle));

    }
    @Tag("regression")
    @Tag("kotuszkowo")
    @DisplayName("Testing site title - kotuszkowo")
    @ParameterizedTest
    @CsvSource({"http://kotuszkowo.pl/, Kotuszkowo- blog o kotach"})
    void seleniumTest3(String siteUrl, String expectedTitle) {
        driver.get(siteUrl);
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat("Title of site " + siteUrl+ " is not correct",actualTitle, equalTo(expectedTitle));
    }

    @Tag("regression")
    @Tag("filmweb")
    @DisplayName("Testing site title - filmweb")
    @ParameterizedTest
    @CsvSource({"https://www.filmweb.pl/, Filmweb - filmy takie jak Ty!"})
    void seleniumTest4(String siteUrl, String expectedTitle) {
        driver.get(siteUrl);
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat("Title of site " + siteUrl+ " is not correct",actualTitle, equalTo(expectedTitle));
    }

    @Tag("regression")
    @Tag("selenium")
    @DisplayName("Testing site title - selenium.dev/documentation")
    @ParameterizedTest
    @CsvSource({"https://www.selenium.dev/documentation/en/webdriver/, WebDriver | Selenium"})
    void seleniumTest5(String siteUrl, String expectedTitle) {
        driver.get(siteUrl);
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat("Title of site " + siteUrl+ " is not correct",actualTitle, equalTo(expectedTitle));
    }
}

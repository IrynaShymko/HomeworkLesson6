//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.parallel.Execution;
//import org.junit.jupiter.api.parallel.ExecutionMode;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;
//import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;
//
//@Execution(CONCURRENT)
//public class Version2AutomationTest {
//    private WebDriver driver;
//
//    @BeforeAll
//    static void beforeAll() {
//        WebDriverManager.chromedriver().setup();
//        System.out.println("@BeforeAll executed");
//    }
//    @AfterAll
//    static void afterAll(){
//        System.out.println("@AfterAll executed");
//    }
//
//    @BeforeEach
//    void setUp() {
//        driver=new ChromeDriver();
//    }
//
//    @AfterEach
//    void tearDown() {
//        driver.quit();
//    }
//
//    @Tag("regression")
//    @Tag("siiPortal")
//    @Tag("onet")
//    @Tag("kotuszkowo")
//    @Tag("filmweb")
//    @Tag("selenium")
//    @DisplayName("Testing site title")
//    @ParameterizedTest
//    @CsvSource({"https://siiportal.sii.pl/, Sign in to your account", "https://onet.pl, Onet – Jesteś na bieżąco",
//            "http://kotuszkowo.pl/, Kotuszkowo- blog o kotach","https://www.filmweb.pl/, Filmweb - filmy takie jak Ty!",
//            "https://www.selenium.dev/documentation/en/webdriver/, WebDriver | Selenium"})
//    void seleniumTest1(String siteUrl, String expectedTitle) {
//        driver.get(siteUrl);
//        driver.manage().window().maximize();
//        String actualTitle = driver.getTitle();
//        assertThat("Title of site " + siteUrl+ " is not correct",actualTitle, equalTo(expectedTitle));
//    }
//}

import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/sc/features",
        tags = "@bp",
        extraGlue = "src/test/java/com/sc/core"
)
public class Runner {

    @BeforeClass
    static public void setup() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1260x768";
        Configuration.timeout = 10000;
        Configuration.headless = false;
    }
}

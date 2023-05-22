import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps"
       ,tags = {"@loginEsia"}
//     ,tags = {"@login20"}
//  ,tags = {"@login30"}

)

public class Runner {
    @BeforeClass
    static public void setup() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1260x768";
        Configuration.timeout = 10000;
        Configuration.headless = true;
    }
}

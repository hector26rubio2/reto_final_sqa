package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\AdidasBusqueda5productos.feature",
        glue = "stepsDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AdidasBuscador5ProductosStepsRunner {
}

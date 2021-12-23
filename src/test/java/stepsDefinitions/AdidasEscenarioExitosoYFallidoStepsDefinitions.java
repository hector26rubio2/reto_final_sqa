package stepsDefinitions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.junit.Before;
import tasks.BuscarProducto;
import uis.AdidasHomePages;
import uis.AdidasProductoPages;

import java.util.List;

public class AdidasEscenarioExitosoYFallidoStepsDefinitions {


    @When("^busque los productos$")
    public void busqueLosProductos(List<String> productos) {

       OnStage.theActorInTheSpotlight().attemptsTo(BuscarProducto.enAdidas(productos.get(0)));
    }

    @Then("^podre observar en pantalla$")
    public void podreObservarEnPantalla(List<String> productos) {

           OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(
               AdidasProductoPages.TXT_ELEMENTO_BUSQUEDA.of(productos.get(0))),
                WebElementStateMatchers.containsText(productos.get(0).toUpperCase())));


    }
}

package stepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.GoogleChromeDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.junit.Before;
import tasks.BuscarProducto;
import uis.AdidasHomePages;
import uis.AdidasProductoPages;

public class AdidasBuscador5ProductosStepsDefinitions {
   // Actor actor = new Actor("hector");
    /*@Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }*/

    @Given("^me encuentro en la pagina de Adidas$")
    public void meEncuentroEnLaPaginaDeAdidas() {
        OnStage.setTheStage(new OnlineCast());
      //  actor.can(BrowseTheWeb.with(GoogleChromeDriver.chromeHisBrowserWeb().on("https://www.adidas.co/")));
        OnStage.theActorCalled("hector").can(
                BrowseTheWeb.with(GoogleChromeDriver.chromeHisBrowserWeb().on("https://www.adidas.co/")));
    }

    @When("^busque los productos el producto '(.*)' en pantalla$")
    public void busqueLosProductosElProductoHolaEnPantalla(String producto) {
      //  actor.attemptsTo(BuscarProducto.enAdidas(producto));
       OnStage.theActorInTheSpotlight().attemptsTo(BuscarProducto.enAdidas(producto));
    }

    @Then("^podre ver en pantalla '(.*)'$")
    public void podreVerEnPantallaHola(String producto) {
       // actor.should(GivenWhenThen.seeThat(WebElementQuestion.the(
        // AdidasProductoPages.TXT_ELEMENTO_BUSQUEDA.of(producto)),
        //        WebElementStateMatchers.containsText(producto.toUpperCase())));
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(
              AdidasProductoPages.TXT_ELEMENTO_BUSQUEDA.of(producto)),
               WebElementStateMatchers.containsText(producto.toUpperCase())));
    }


}

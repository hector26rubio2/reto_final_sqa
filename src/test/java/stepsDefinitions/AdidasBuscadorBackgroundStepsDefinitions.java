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

import java.util.List;


public class AdidasBuscadorBackgroundStepsDefinitions {
/*
    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }*/
    @When("^encuentre el producto$")
    public void ecuentreElProducto(List<String> productos) {
       // actor.attemptsTo(BuscarProducto.enAdidas(productos.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProducto.enAdidas(productos.get(0)));
    }


    @Then("^podre mirar (.*) en pantalla$")
    public void podreMirarProductoEnPantalla(String producto) {
       // actor.should(GivenWhenThen.seeThat(WebElementQuestion.the(
        // AdidasProductoPages.TXT_ELEMENTO_BUSQUEDA.of(producto)),
        //        WebElementStateMatchers.containsText(producto.toUpperCase())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(
               AdidasProductoPages.TXT_ELEMENTO_BUSQUEDA.of(producto)),
                WebElementStateMatchers.containsText(producto.toUpperCase())));
    }


}

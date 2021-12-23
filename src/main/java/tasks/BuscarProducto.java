package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import uis.AdidasHomePages;

public class BuscarProducto implements Task {

    private String producto;

    public BuscarProducto(String producto) {
        this.producto = producto;
    }

    public static BuscarProducto enAdidas(String producto){
        return Instrumented.instanceOf(BuscarProducto.class).withProperties(producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(AdidasHomePages.TXT_BUSCADOR),
                Hit.the(Keys.ENTER).into(AdidasHomePages.TXT_BUSCADOR)
        );
    }
}

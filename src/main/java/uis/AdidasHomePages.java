package uis;


import net.serenitybdd.screenplay.targets.Target;

public class AdidasHomePages {

    public static final Target TXT_BUSCADOR = Target.the("").locatedBy(
            "//input[@name='q' and @placeholder='Buscar']");


}

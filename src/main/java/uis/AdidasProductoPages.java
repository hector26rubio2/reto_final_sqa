package uis;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdidasProductoPages {

    public static final Target TXT_ELEMENTO_BUSQUEDA = Target.the("").locatedBy(
            "//div[@class ='product-description___2cJO2']" +
                    "/h1[@data-auto-id='product-title'" +
                    " and @class='gl-heading gl-heading--regular gl-heading--italic name___1EbZs']" +
                    "//span[contains(text(), '{0}')]");
}

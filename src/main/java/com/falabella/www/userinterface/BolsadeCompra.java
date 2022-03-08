package com.falabella.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BolsadeCompra {
    public static final Target BOTONIRALACOMPRA = Target.the("boton para ir a comprar")
            .located(By.xpath("//*[@id='root']/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[2]/button"));

}

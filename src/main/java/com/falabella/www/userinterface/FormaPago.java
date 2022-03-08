package com.falabella.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormaPago {
    public static final Target RESUMENORDEN = Target.the("Resumen de la orden")
            .located(By.xpath("//h2[text()='Resumen de tu orden']"));
}

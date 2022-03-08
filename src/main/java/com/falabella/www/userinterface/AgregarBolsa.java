package com.falabella.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarBolsa {
    public static final Target BOTONAGREGARBOLSA = Target.the("boton para agregar producto a la bolsa")
            .located(By.xpath("//button[text()='Agregar a la Bolsa']"));
    public static final Target BOTONVERBOLSA = Target.the("boton para ver la bolsa de productos")
            .located(By.xpath("//a[text()='Ver Bolsa de Compras']"));
}

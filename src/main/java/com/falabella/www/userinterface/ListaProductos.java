package com.falabella.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListaProductos {
    public static final Target PRODUCTOSELECCIONADO = Target.the("Seleccion del producto buscado")
            .located(By.xpath("//b[text()='Reloj Hombre Fossil Neutra Fs5384']"));
}

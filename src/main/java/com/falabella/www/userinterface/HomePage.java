package com.falabella.www.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.falabella.com.co/falabella-co")
public class HomePage extends PageObject {
    public static final Target BARRABUSQUEDA = Target.the("barra de busqueda articulos")
            .located(By.id("testId-SearchBar-Input"));
    public static final Target BOTONBUSCAR = Target.the("boton buscar articulos")
            .located(By.xpath("//*[@id='testId-search-wrapper']/div/button"));
}

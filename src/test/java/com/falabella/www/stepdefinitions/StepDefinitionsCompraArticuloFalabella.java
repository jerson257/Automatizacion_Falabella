package com.falabella.www.stepdefinitions;

import com.falabella.www.task.NavegarA;
import com.falabella.www.task.BuscarProducto;
import com.falabella.www.userinterface.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class StepDefinitionsCompraArticuloFalabella {

    @Managed(driver = "chrome")
    private WebDriver web;
    private Actor actor = Actor.named("Jerson");

    private HomePage home;

    @Before
    public void setUp() {
        web.manage().window().maximize();
        actor.can(BrowseTheWeb.with(web));
    }

    @Given("se requiere buscar un producto para comprar")
    public void busquedaProductoAComprar() {
        actor.wasAbleTo(NavegarA.on(home));

    }
    @When("agregar al carrito el producto {string}")
    public void agregarProductoBolsaCompras(String producto) {
        actor.attemptsTo(BuscarProducto.buscar(producto));
    }

    @Then("Validar forma de pago del producto")
    public void validacionFormaPago() {

    }

}

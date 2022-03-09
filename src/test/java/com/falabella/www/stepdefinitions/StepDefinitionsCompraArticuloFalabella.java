package com.falabella.www.stepdefinitions;

import com.falabella.www.question.ValidarFormaPago;
import com.falabella.www.task.AgregarProductoBolsa;
import com.falabella.www.task.DespacharCompra;
import com.falabella.www.task.NavegarA;
import com.falabella.www.task.BuscarProducto;
import com.falabella.www.userinterface.FormaPago;
import com.falabella.www.userinterface.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

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
    @When("agregar al carrito el producto")
    public void agregarProductoBolsaCompras(List<Map<String, String>> listaDatos) {
        Map<String, String> mapaDespacho = listaDatos.get(0);
        actor.attemptsTo(BuscarProducto.buscar(mapaDespacho.get("producto")), AgregarProductoBolsa.agregar(), DespacharCompra.despachar(mapaDespacho.get("direccion"),mapaDespacho.get("complemento_direccion")));
    }

    @Then("Validar forma de pago del producto")
    public void validacionFormaPago(){
        actor.should(seeThat(ValidarFormaPago.validacionInicio(FormaPago.RESUMENORDEN),
                equalTo("Resumen de tu orden")));
    }

}

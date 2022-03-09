package com.falabella.www.task;

import com.falabella.www.userinterface.DespachoCompra;
import com.falabella.www.userinterface.FormaPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class DespacharCompra implements Task {

    private String direccion;
    private String complementoDireccion;

    public DespacharCompra(String direccion, String complementoDireccion) {
        this.direccion = direccion;
        this.complementoDireccion = complementoDireccion;
    }

    public static DespacharCompra despachar(String direccion,String complementoDireccion) {

        return Tasks.instrumented(DespacharCompra.class,direccion,complementoDireccion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DespachoCompra.SELECCIONARDEPARTAMENTO),
                Click.on(DespachoCompra.SELECCIONARDEPARTAMENTO),
                Click.on(DespachoCompra.DEPARTAMENTO),
                Click.on(DespachoCompra.SELECCIONARCIUDAD),
                Click.on(DespachoCompra.CIUDAD),
                Click.on(DespachoCompra.SELECCIONARBARRIO),
                Click.on(DespachoCompra.BARRIO),
                Click.on(DespachoCompra.BOTONCONTINUAR),
                Enter.theValue(direccion).into(DespachoCompra.DIRECCION),
                Enter.theValue(complementoDireccion).into(DespachoCompra.COMPLEMENTODIRECCION),
                Scroll.to(DespachoCompra.LABELBOTONINGRESARDIRECCION),
                Click.on(DespachoCompra.BOTONINGRESARDIRECCION),
                Click.on(DespachoCompra.BOTONCONTINUARAPAGO));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Scroll.to(FormaPago.RESUMENORDEN)
        );
    }
}

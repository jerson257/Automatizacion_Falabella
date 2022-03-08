package com.falabella.www.task;

import com.falabella.www.userinterface.DespachoCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class DespacharCompra implements Task {

    public static DespacharCompra despachar() {

        return Tasks.instrumented(DespacharCompra.class);
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
                Enter.theValue("calle 75 # 90 - 23").into(DespachoCompra.DIRECCION),
                Enter.theValue("apto 201").into(DespachoCompra.COMPLEMENTODIRECCION),
                Scroll.to(DespachoCompra.LABELBOTONINGRESARDIRECCION),
                Click.on(DespachoCompra.BOTONINGRESARDIRECCION),
                Click.on(DespachoCompra.BOTONCONTINUARAPAGO));
    }
}

package com.falabella.www.task;

import com.falabella.www.userinterface.AgregarBolsa;
import com.falabella.www.userinterface.BolsadeCompra;
import com.falabella.www.userinterface.ListaProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarProductoBolsa implements Task {

    public static AgregarProductoBolsa agregar() {
        return Tasks.instrumented(AgregarProductoBolsa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ListaProductos.PRODUCTOSELECCIONADO),
                Click.on(AgregarBolsa.BOTONAGREGARBOLSA),
                Click.on(AgregarBolsa.BOTONVERBOLSA),
                Click.on(BolsadeCompra.BOTONIRALACOMPRA));
    }
}

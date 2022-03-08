package com.falabella.www.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarFormaPago implements Question<String> {

    private Target target;

    public ValidarFormaPago(Target target) {
        this.target = target;
    }

    public static ValidarFormaPago validacionInicio(Target target) {
        return new ValidarFormaPago(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }
}

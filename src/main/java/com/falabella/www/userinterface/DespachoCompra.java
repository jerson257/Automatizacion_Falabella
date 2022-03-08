package com.falabella.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DespachoCompra {
    public static final Target SELECCIONARDEPARTAMENTO = Target.the("Lista de departamentos")
            .located(By.id("region"));
    public static final Target DEPARTAMENTO = Target.the("departamento")
            .located(By.xpath("//*[@id='region']/option[2]"));
    public static final Target SELECCIONARCIUDAD = Target.the("Lista de ciudades")
            .located(By.id("ciudad"));
    public static final Target CIUDAD = Target.the("ciudad")
            .located(By.xpath("//*[@id='ciudad']/option[5]"));
    public static final Target SELECCIONARBARRIO = Target.the("Lista de barrios")
            .located(By.id("comuna"));
    public static final Target BARRIO = Target.the("barrio")
            .located(By.xpath("//*[@id='comuna']/option[2]"));
    public static final Target BOTONCONTINUAR = Target.the("boton continuar")
            .located(By.xpath("//*[@id='fbra_checkoutRegionAndComuna']/div/section/section/form/div/div[4]/div/button"));
    public static final Target DIRECCION = Target.the("ingresar direccion")
            .located(By.id("address"));
    public static final Target COMPLEMENTODIRECCION = Target.the("ingresar complemento direccion")
            .located(By.id("departmentNumber"));
    public static final Target LABELBOTONINGRESARDIRECCION = Target.the("label boton ingresar direccion")
            .located(By.xpath("//span[text()='Falabella de Colombia S.A. Nit 900.017.447-8']"));
    public static final Target BOTONINGRESARDIRECCION = Target.the("boton ingresar direccion")
            .located(By.xpath("//*[@id='fbra_checkoutDeliverAndCollect']/div/div/div[1]/div/div[2]/div/div/form/section/div/div[4]/button"));
    public static final Target BOTONCONTINUARAPAGO = Target.the("boton continuar a pago")
            .located(By.xpath("//button[text()='Continuar']"));
}

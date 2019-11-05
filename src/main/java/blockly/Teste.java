package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Teste {

public static final int TIMEOUT = 300;

/**
 *
 * @param x
 * @return Var
 */
// Teste
public static Var ConcatenaEmail(Var x) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.valueOf(Var.valueOf("OII").toString() + cronapi.object.Operations.getObjectField(x, Var.valueOf("email")).toString() + Var.valueOf("IIO").toString());
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var fa_C3_A7a_algo() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeContent"), Var.valueOf("crn-text-component-597693"), Var.valueOf("bang"), cronapi.list.Operations.isEmpty(Var.valueOf("false")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeAttrValue"), Var.valueOf("crn-text-component-597693"), Var.valueOf("content"), cronapi.chart.Operations.createChartSerie(Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL));
    return Var.VAR_NULL;
   }
 }.call();
}

}


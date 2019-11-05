package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ComponenteLink {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// ComponenteLink
public static Var LinkExternonoApp() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.redirect(Var.valueOf("https://www.coopama.com.br/"));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var Link_Externo_no_Navegador_do_Dispositivo() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("https://www.coopama.com.br/"));
    return Var.VAR_NULL;
   }
 }.call();
}

}


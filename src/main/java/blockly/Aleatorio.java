package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Aleatorio {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Aleatorio
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.authentication.Operations.getUserRoles();
   }
 }.call();
}

}


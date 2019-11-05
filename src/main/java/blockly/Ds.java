package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Ds {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// ds
public static Var User() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u from User u"));
   }
 }.call();
}

}


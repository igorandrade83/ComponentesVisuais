package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Cincok {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// cincok
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;
   private Var nome = Var.VAR_NULL;

   public Var call() throws Exception {
    item = Var.valueOf(0);
    for (long count = 0; count < Var.valueOf(5000).getObjectAsLong();count++) {
            item = cronapi.math.Operations.sum(item,Var.valueOf(1));
        nome = Var.valueOf("");
        cronapi.database.Operations.insert(Var.valueOf("app.entity.cincok"),Var.valueOf("num",item),Var.valueOf("text",nome));
    } // end for
    return Var.VAR_NULL;
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

   private Var item = Var.VAR_NULL;
   private Var nome = Var.VAR_NULL;

   public Var call() throws Exception {
    return cronapi.database.Operations.query(Var.VAR_NULL,Var.VAR_NULL);
   }
 }.call();
}

}


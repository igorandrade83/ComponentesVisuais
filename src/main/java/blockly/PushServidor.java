package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class PushServidor {

public static final int TIMEOUT = 300;

/**
 *
 * @param tokenDispositivo
 * @return Var
 */
// PushServidor
public static Var Envio_da_Notificacao_para_o_dispositivo(Var tokenDispositivo) throws Exception {
 return new Callable<Var>() {

   private Var dado = Var.VAR_NULL;

   public Var call() throws Exception {
    dado = cronapi.json.Operations.createObjectJson();
    cronapi.json.Operations.setJsonOrMapField(dado, Var.valueOf("msg"), Var.valueOf("Você recebeu uma mensagem!"));
    cronapi.pushnotification.Operations.sendNotification(Var.valueOf("AAAADki-rPg:APA91bEKCFkD7mCBI790UFjzDfUJAGXALJ3UiTcYpap8KFg5mpaQIBiSfyrUjDZrx7BNPXxd0ovK0U_I2--M2AsbuIpXwGcgJrw24pYgKi916oVGa85IlxGotsVz-Q_hdJaQf25_Fmob"), tokenDispositivo, Var.valueOf("Cronapp"), Var.valueOf("Envio de notificação"), dado);
    return Var.VAR_NULL;
   }
 }.call();
}

}


package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Bloco
public static Var Data_com_fuso() throws Exception {
 return new Callable<Var>() {

   private Var data = Var.VAR_NULL;

   public Var call() throws Exception {
    data = cronapi.conversion.Operations.stringToDate(Var.valueOf("12/11/2000"), Var.valueOf("dd/MM/yyyy"), Var.valueOf(-3));
    return cronapi.dateTime.Operations.formatDateTime(data, Var.valueOf("dd/MM/yyyy"), Var.valueOf(-3));
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.chart.Operations.createChart(Var.valueOf("chart666"), Var.valueOf("line"), cronapi.list.Operations.newList(Var.valueOf("er"), Var.valueOf("rt"), Var.valueOf("yu")), Var.VAR_NULL, cronapi.chart.Operations.createChartSerie(Var.valueOf("fgh"), cronapi.list.Operations.newList(Var.valueOf(1), Var.valueOf(2), Var.valueOf(20)), Var.VAR_NULL));
    return Var.VAR_NULL;
   }
 }.call();
}

}


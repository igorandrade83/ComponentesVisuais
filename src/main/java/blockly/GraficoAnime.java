package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class GraficoAnime {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// graficoAnime
public static Var usingChart() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.chart.Operations.createChart(Var.valueOf("chart1830"), Var.valueOf("line"), cronapi.database.Operations.query(Var.VAR_NULL,Var.VAR_NULL), cronapi.chart.Operations.createChartSerie(Var.valueOf("Qtd lançadas"), cronapi.database.Operations.query(Var.VAR_NULL,Var.VAR_NULL), Var.VAR_NULL), Var.VAR_NULL);
    return Var.VAR_NULL;
   }
 }.call();
}

}


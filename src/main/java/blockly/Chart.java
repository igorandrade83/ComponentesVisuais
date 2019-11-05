package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Chart {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// graficoAnime
public static Var usingChart() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.chart.Operations.createChart(Var.valueOf("chart1830"), Var.valueOf("bar"), cronapi.database.Operations.query(Var.valueOf("app.entity.Anime"),Var.valueOf("select a.ano from Anime a  group by a.ano")), Var.valueOf("{\n    \"title\": {\n                \"display\": true,\n                \"text\": \"Animes assistidos por ano\",\n                \"fontSize\": 20,\n                \"fontColor\": \"#00F\"\n	},\n        \n    \"legend\": {\n                \"display\": true\n	},\n    \n    \"animation\": {\n                \"duration\": 1500,\n                \"easing\": \"easeOutBounce\"\n    },\n    \n    \"layout\": {\n                \"padding\": {\n                    \"left\": 120,\n                    \"right\": 120,\n                    \"top\": 60,\n                    \"bottom\": 60\n				}\n    }\n}"), cronapi.chart.Operations.createChartSerie(Var.valueOf("asd"), cronapi.database.Operations.query(Var.valueOf("app.entity.Anime"),Var.valueOf("select COUNT(a.anime) from Anime a  group by a.ano")), Var.VAR_NULL));
    return Var.VAR_NULL;
   }
 }.call();
}

}


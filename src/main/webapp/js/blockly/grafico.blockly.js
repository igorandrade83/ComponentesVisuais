window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Grafico = window.blockly.js.blockly.Grafico || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Grafico.fa_C3_A7a_algo = function() {
 var item, legenda, serie, x;
  this.cronapi.screen.changeContent("iconFora", '', 'false');
  this.cronapi.screen.changeValueOfField("", '');
}

/**
 * Bloco
 */
window.blockly.js.blockly.Grafico.Executa_Gr_C3_A1fico = function(serie, legenda) {
 var item, x;
  this.cronapi.chart.createChart("componente_grafico", 'horizontalBar', legenda, null, serie);
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Grafico.grid = function(x, x2, x1, x0) {

  console.log(this.cronapi.screen.getValueOfField("vars.grid46164"));
}

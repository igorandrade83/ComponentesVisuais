window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * Bloco
 */
window.blockly.js.blockly.Bloco.esconde = function() {
 var lg;
  this.cronapi.screen.hideIonicModal("modal82216");
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Bloco.muda = function(lg) {

  this.cronapi.screen.changeView("#/app/logged/Recipiente",[ { login : lg } ]);
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Bloco.exibe = function() {
 var lg;
  this.cronapi.screen.showIonicModal("modal82216");
}

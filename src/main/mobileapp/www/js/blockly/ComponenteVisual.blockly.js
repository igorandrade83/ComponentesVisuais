window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ComponenteVisual = window.blockly.js.blockly.ComponenteVisual || {};

/**
 * ComponenteVisual
 */
window.blockly.js.blockly.ComponenteVisual.LinkApp = function() {
 var item;
  this.cronapi.cordova.database.openInAppBrowser('https://www.coopama.com.br/');
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.ComponenteVisual.Abrir_URLT = function() {
 var item;
  this.cronapi.screen.openUrl('https://www.google.com.br', true, 500, 500);
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.ComponenteVisual.Abrir_URLF = function() {
 var item;
  this.cronapi.screen.openUrl('https://www.google.com.br', false, 0, 0);
}

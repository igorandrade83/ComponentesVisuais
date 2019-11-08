window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.PushCliente = window.blockly.js.blockly.PushCliente || {};

/**
 * Push
 */
window.blockly.js.blockly.PushCliente.Ao_receber = function() {
 var item, notificacao, token;
  this.cronapi.cordova.device.getFirebaseNotificationData(function(sender_notificacao) {
      notificacao = sender_notificacao;
    this.cronapi.screen.notify('success',this.cronapi.object.getProperty(notificacao, 'msg'));
  }.bind(this), function(sender_notificacao) {
      notificacao = sender_notificacao;
  }.bind(this));
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.PushCliente.Obter_token_do_dispositivo = function() {
 var item, notificacao, token;
  this.cronapi.cordova.device.getFirebaseToken(function(sender_token) {
      token = sender_token;
    this.cronapi.util.callServerBlocklyNoReturn('blockly.PushServidor:Envio_da_Notificacao_para_o_dispositivo', token);
  }.bind(this), function(sender_token) {
      token = sender_token;
  }.bind(this));
}

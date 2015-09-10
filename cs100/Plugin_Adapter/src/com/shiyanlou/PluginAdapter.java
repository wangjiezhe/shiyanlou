package com.shiyanlou;

public class PluginAdapter implements EnPluginInterface {
  private CnPluginInterface cnPlugin;

  public PluginAdapter(CnPluginInterface cnPlugin) {
    this.cnPlugin = cnPlugin;
  }

  @Override
  public void chargeWith3Pins() {
    cnPlugin.chargeWith2Pins();
  }

}

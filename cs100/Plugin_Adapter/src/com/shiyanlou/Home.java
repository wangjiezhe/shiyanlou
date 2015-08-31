package com.shiyanlou;

public class Home {
	private EnPluginInterface enPlugin;
	
	public Home() { }
	
	public Home(EnPluginInterface enPlugin) {
		this.enPlugin = enPlugin;
	}
	
	public void setPlugin(EnPluginInterface enPlugin) {
		this.enPlugin = enPlugin;
	}
	
	public void charge() {
		enPlugin.chargeWith3Pins();
	}
}

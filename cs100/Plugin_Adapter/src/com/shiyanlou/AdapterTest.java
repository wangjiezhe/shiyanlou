package com.shiyanlou;

public class AdapterTest {

	public static void main(String[] args) {
		CnPluginInterface cnPlugin = new CnPlugin();
		Home home = new Home();
		PluginAdapter pluginAdapter = new PluginAdapter(cnPlugin);
		home.setPlugin(pluginAdapter);
		
		home.charge();
	}

}

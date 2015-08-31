package com.shiyanlou;

import java.io.IOException;

class ManFactory extends HumanFactory {

	@Override
	public Human createHuman(String gender) throws IOException {
		return new Man();
	}

}

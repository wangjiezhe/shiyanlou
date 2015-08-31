package com.shiyanlou;

import java.io.IOException;

class FemaleFactory extends HumanFactory {

	@Override
	public Human createHuman(String gender) throws IOException {
		return new Female();
	}

}

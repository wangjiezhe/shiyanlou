package com.shiyanlou;

import java.io.IOException;

abstract class HumanFactory {
	public abstract Human createHuman(String gender) throws IOException;
}

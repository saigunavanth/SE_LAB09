package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junitTestnumbers {

	@Test
	void test() {
		junittesting junit = new junittesting();
		int ans = junit.addNumbers(11, 10);
		assertEquals (21,ans);
	}

}

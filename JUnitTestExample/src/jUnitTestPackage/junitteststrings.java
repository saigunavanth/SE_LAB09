package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junitteststrings {

	@Test
	void test() {
		junittesting junit = new junittesting();
		String ans = junit.addStrings("star", "man");
		assertEquals ("starman",ans);
	}

}

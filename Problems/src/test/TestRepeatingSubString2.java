package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.prblm.RepeatingSubstring2;

class TestRepeatingSubString2 {
	RepeatingSubstring2 rs = new RepeatingSubstring2();
	@Test
	void test() {
		ArrayList<String> str = new ArrayList<String>();
		str.add("day");
		str.add("ever");
		//String[] str = {"day", ever}";
		String str1 = "However, everyday is a new day";
		assertEquals(str,rs.RepeatingSubstring(str1,2));
	}

}

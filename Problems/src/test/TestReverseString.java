package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.prblm.RepeatingSubstring2;
import main.prblm.ReverseString;

class TestReverseString {
	ReverseString rs = new ReverseString();

	@Test
	void test() {
		String str1 = "god";
		assertEquals(str1,rs.reverse("dog"));
	}
}
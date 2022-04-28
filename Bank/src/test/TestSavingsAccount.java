package test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bankatm.SavingsAccount;
import junit.framework.Assert;

class TestSavingsAccount {
	SavingsAccount sa = new SavingsAccount();
	@Test
	void test() {
		sa.deposit(100);
		
	}

}

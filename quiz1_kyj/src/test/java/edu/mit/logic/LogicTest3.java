package edu.mit.logic;

import org.junit.Test;

//@RunWith()

public class LogicTest3 {

	@Test
public void logicT3 () {
	Mylogic2 logic2 = new Mylogic2();
	
	System.out.println("1~10까지 모두 더한 값은 "+logic2.addUp(1, 10));
	System.out.println("1~10까지 짝수만 더한 값은 "+logic2.evenAddUp(1, 10));
	
	
	}
	
	
	
}

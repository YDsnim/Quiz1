package edu.mit.logic;

import org.junit.Test;

import edu.mit.logic.Mylogic;
import lombok.extern.log4j.Log4j;
@Log4j
//@RunWith()
public class LogicTest1 {

	@Test
public void logicT1() {
	System.out.println(Mylogic.addUp(1, 10));	
	
	}
	
	//출제자의 의도는 Log4j를 활용해서 더 간단하게 작성해보는 것
	
	@Test
	public void logicT1_1(){
		log.info("결과 "+Mylogic.addUp(1, 10));
//	INFO : edu.mit.logic.LogicTest1 - 55
	
	}
	@Test
	public void logicT1_2(){
		log.info("결과 "+Mylogic.evenAddUp(1, 10));
		
/* evenaddup 진입
		2
		4
		6
		8
		10
		evenaddup 리턴
		INFO : edu.mit.logic.LogicTest1 - 30
*/
	}
	
	
	
	
}

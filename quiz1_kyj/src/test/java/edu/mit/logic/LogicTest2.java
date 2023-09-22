package edu.mit.logic;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class LogicTest2 {

	
	//출제자의 의도는 Log4j를 활용해서 더 간단하게 작성하며
	//static이 아닌경우도 자바처럼 선언하고 활용이 가능하다는점	
	//log.info를 쓰면 콘솔에 입력가능==sysout 필요x

	@Test
	public void logicT2_2() {
		Mylogic2 mylogic2 = new Mylogic2();
			
		log.info(mylogic2.addUp(1, 10));
		log.info(mylogic2.evenAddUp(1, 10));
			
			
		}
		
		
	
	
	}


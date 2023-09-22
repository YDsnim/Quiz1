package edu.mit.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.mit.dao.QuizMapper;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
	@Log4j
	
	
	public class QuizMapperTest {
	
	@Autowired
	QuizMapper mapper;
	
	
	@Test
	public void nowtime() {
		log.info("지금시간 db로부터  출력"+mapper.now());
//		테스트 성공
	}
	
}

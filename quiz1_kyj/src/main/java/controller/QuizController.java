package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;
@Controller
@Log4j


public class QuizController {

@GetMapping("/quiz/quiz1")
	public void GotoQuiz1 () {
			
		log.info("quiz컨트롤러 /quiz/quiz1 요청 받음");
//		예상결과= quiz/quiz1.jsp로 가는거지
	}
	
}

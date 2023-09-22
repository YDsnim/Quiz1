package edu.mit.service;

import org.springframework.stereotype.Service;

import edu.mit.dao.TwoVo;
import edu.mit.logic.Mylogic;
import edu.mit.logic.Mylogic3;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class QuizService {

	private Mylogic3 mylogic3;
	
	//두수를 모두 더해서 돌려주는 서비스
	
	public int allsum(TwoVo vo) {
		return mylogic3.addUp(vo.getNum1(),vo.getNum2());
	}
		
	
}

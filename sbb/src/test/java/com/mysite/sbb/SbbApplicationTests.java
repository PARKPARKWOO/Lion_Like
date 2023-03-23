package com.mysite.sbb;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private AnswerRepository answerRepository;
	@Test
	@Transactional
	void testJpa(){
		Optional<Question> oq = this.questionRepository.findById(2L);
		assertTrue(oq.isPresent());
		Question q = oq.get();

		List<Answer> a = q.getAnswerList();
		assertEquals(1, a.size());
		assertEquals("네 자동으로 생성 됩니다." , a.get(0).getContent());
 	}

	@Test
	void contextLoads() {
	}

}

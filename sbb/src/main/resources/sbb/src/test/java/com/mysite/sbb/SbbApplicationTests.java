package com.mysite.sbb;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;
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
	private QuestionService questionService;

	@Test
	void testJpa(){
		for (int i = 1; i <= 300; i++) {
			String subject = String.format("테스트 데이터 입니다 : [%03d]", i);
			String content = "내용 무";
			this.questionService.create(subject, content, null);
		}
	}

}

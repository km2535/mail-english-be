package com.mail.tech.domain.email;

import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.mail.tech.domain.content.Content;

@Component
public class EmailContentGenerator {
	private final TemplateEngine templateEngine;

	public EmailContentGenerator(TemplateEngine templateEngine) {
		this.templateEngine = templateEngine;
	}

	public String generateContent(Content content) {
		Context context = new Context();
		context.setVariable("title", content.getTitle());
		context.setVariable("contentKor", content.getContentKor());
		context.setVariable("contentEng", content.getContentEng());
		
		// 기술별로 다른 템플릿 사용
		String template = "email/index";
		return templateEngine.process(template, context);
	}
}

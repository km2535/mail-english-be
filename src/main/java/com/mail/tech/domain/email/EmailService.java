package com.mail.tech.domain.email;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.mail.tech.domain.content.Content;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmailService {
	private final JavaMailSender mailSender;
	private final EmailContentGenerator contentGenerator;

	public void sendEmail(String email, Content content) throws MessagingException {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

		helper.setTo(email);
		helper.setSubject(content.getTitle());

		String contents = contentGenerator.generateContent(content);
		helper.setText(contents, true);

		mailSender.send(mimeMessage);
	}
}

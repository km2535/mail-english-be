package com.mail.tech.domain.scheduler;

import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.mail.tech.domain.TECH;
import com.mail.tech.domain.content.Content;
import com.mail.tech.domain.content.ContentReader;
import com.mail.tech.domain.email.EmailService;
import com.mail.tech.domain.subscribe.Subscribe;
import com.mail.tech.domain.subscribe.SubscribeReader;

import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EmailScheduler {
	private final EmailService emailService;
	private final SubscribeReader subscribeReader;
	private final ContentReader contentReader;

	@Scheduled(cron = "0 0 9 * * ?") // 매일 오전 9시 실행
	public void sendDailyEmailsBackEnd() throws MessagingException {
		List<Subscribe> subscribes = subscribeReader.findByTech(TECH.BACKEND);

		Content content = contentReader.findRandom();

		for (Subscribe subscribe : subscribes) {
			emailService.sendEmail(subscribe.getEmail(), content);
		}
	}
}

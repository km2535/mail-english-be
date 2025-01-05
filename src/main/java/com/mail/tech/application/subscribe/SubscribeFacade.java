package com.mail.tech.application.subscribe;

import org.springframework.stereotype.Service;

import com.mail.tech.domain.command.AddSubscribeCommand;
import com.mail.tech.domain.info.AddSubscribeInfo;
import com.mail.tech.domain.subscribe.SubscribeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SubscribeFacade {
	private final SubscribeService subscribeService;

	public AddSubscribeInfo addSubscribe(AddSubscribeCommand command) {
		return subscribeService.addSubscribe(command);
	}
}

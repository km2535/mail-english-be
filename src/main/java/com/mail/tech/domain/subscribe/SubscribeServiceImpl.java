package com.mail.tech.domain.subscribe;

import org.springframework.stereotype.Service;

import com.mail.tech.domain.command.AddSubscribeCommand;
import com.mail.tech.domain.command.DeleteSubscribeCommand;
import com.mail.tech.domain.command.UpdateSubscribeCommand;
import com.mail.tech.domain.exception.SubscribeException;
import com.mail.tech.domain.exception.SubscribeFailException;
import com.mail.tech.domain.info.AddSubscribeInfo;
import com.mail.tech.domain.info.DeleteSubscribeInfo;
import com.mail.tech.domain.info.UpdateSubscribeInfo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class SubscribeServiceImpl implements SubscribeService {
	private final SubscribeStore subscribeStore;
	private final SubscribeReader subscribeReader;

	@Override
	public AddSubscribeInfo addSubscribe(AddSubscribeCommand command) {
		Subscribe subscribe = new Subscribe(command.email(), command.tech());
		if (subscribeReader.exist(subscribe.getEmail())) {
			throw new SubscribeException(command.email());
		}
		if (subscribeStore.save(subscribe) == 1) {
			return AddSubscribeInfo.of(subscribe);
		}
		throw new SubscribeFailException(command.email());
	}

	@Override
	public UpdateSubscribeInfo updateSubscribe(UpdateSubscribeCommand command) {
		Subscribe subscribe = new Subscribe(command.email(), command.tech());
		if (!subscribeReader.exist(subscribe.getEmail())) {
			throw new RuntimeException("구독 먼저하셔야 합니다.");
		}
		subscribeStore.update(command.email(), command.tech());
		return UpdateSubscribeInfo.of(subscribe);
	}

	@Override
	public DeleteSubscribeInfo deleteSubscribe(DeleteSubscribeCommand command) {
		Subscribe subscribe = new Subscribe(command.email());
		if (!subscribeReader.exist(command.email())) {
			throw new RuntimeException("구독 먼저하셔야 합니다.");
		}
		subscribeStore.delete(command.email());
		return DeleteSubscribeInfo.of(subscribe);
	}
}

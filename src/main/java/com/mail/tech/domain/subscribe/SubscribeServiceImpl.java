package com.mail.tech.domain.subscribe;

import org.springframework.stereotype.Service;

import com.mail.tech.domain.command.AddSubscribeCommand;
import com.mail.tech.domain.info.AddSubscribeInfo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class SubscribeServiceImpl implements SubscribeService {
	private final SubscribeStore subscribeStore;

	@Override
	public AddSubscribeInfo addSubscribe(AddSubscribeCommand command) {
		Subscribe subscribe = new Subscribe(command.email(), command.tech());
		if (subscribeStore.save(subscribe) == 1) {
			return AddSubscribeInfo.of(subscribe);
		}
		throw new RuntimeException("저장에 실패하였습니다.");
	}
}

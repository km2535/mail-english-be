package com.mail.tech.infrastructure.subscribe;

import org.springframework.stereotype.Component;

import com.mail.tech.domain.subscribe.Subscribe;
import com.mail.tech.domain.subscribe.SubscribeStore;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SubscribeStoreImpl implements SubscribeStore {
	private final SubscribeMapper subscribeMapper;

	@Override
	public int save(Subscribe subscribe) {
		return subscribeMapper.save(subscribe);
	}
}

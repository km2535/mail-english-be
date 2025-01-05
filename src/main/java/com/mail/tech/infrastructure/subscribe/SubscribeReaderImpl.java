package com.mail.tech.infrastructure.subscribe;

import org.springframework.stereotype.Component;

import com.mail.tech.domain.subscribe.SubscribeReader;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class SubscribeReaderImpl implements SubscribeReader {
	private final SubscribeMapper subscribeMapper;

	@Override
	public Boolean exist(String email) {
		return subscribeMapper.existsByEmail(email);
	}
}

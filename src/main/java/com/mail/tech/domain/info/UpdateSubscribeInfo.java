package com.mail.tech.domain.info;

import com.mail.tech.domain.TECH;
import com.mail.tech.domain.subscribe.Subscribe;

public record UpdateSubscribeInfo(
	String Email,
	TECH tech
) {
	public static UpdateSubscribeInfo of(Subscribe subscribeResult) {
		return new UpdateSubscribeInfo(
			subscribeResult.getEmail(),
			subscribeResult.getTech());
	}
}

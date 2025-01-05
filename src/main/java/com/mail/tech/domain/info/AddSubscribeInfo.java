package com.mail.tech.domain.info;

import com.mail.tech.domain.subscribe.Subscribe;

public record AddSubscribeInfo(
	String subscribeToken,
	String Email
) {
	public static AddSubscribeInfo of(Subscribe subscribeResult) {
		return new AddSubscribeInfo(subscribeResult.getSubscribeToken(), subscribeResult.getEmail());
	}
}

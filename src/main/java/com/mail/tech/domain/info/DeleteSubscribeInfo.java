package com.mail.tech.domain.info;

import com.mail.tech.domain.subscribe.Subscribe;

public record DeleteSubscribeInfo(
	String Email
) {
	public static DeleteSubscribeInfo of(Subscribe subscribeResult) {
		return new DeleteSubscribeInfo(
			subscribeResult.getEmail()
		);
	}
}

package com.mail.tech.domain.subscribe;

import com.mail.tech.domain.token.TokenGenerator;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Subscribe {
	public static final String SUBSCRIBE_PREFIX = "subscribe_";

	private Long id;
	private String subscribeToken;
	private String email;

	Subscribe(String email) {
		super();
		this.email = email;
		this.subscribeToken = TokenGenerator.randomCharacterWithPrefix(SUBSCRIBE_PREFIX);
	}
}

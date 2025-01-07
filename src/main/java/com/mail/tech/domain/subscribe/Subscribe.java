package com.mail.tech.domain.subscribe;

import java.time.LocalDateTime;

import com.mail.tech.domain.BaseEntity;
import com.mail.tech.domain.TECH;
import com.mail.tech.domain.token.TokenGenerator;

import lombok.Getter;

@Getter
public class Subscribe extends BaseEntity {
	public static final String SUBSCRIBE_PREFIX = "subscribe_";
	private final String subscribeToken;
	private final String email;
	private final TECH tech;

	Subscribe(String email, TECH tech) {
		super(LocalDateTime.now(), LocalDateTime.now());
		this.email = email;
		this.tech = tech;
		this.subscribeToken = TokenGenerator.randomCharacterWithPrefix(SUBSCRIBE_PREFIX);
	}

	Subscribe(String email, String subscribeToken, TECH tech) {
		super(LocalDateTime.now(), LocalDateTime.now());
		this.email = email;
		this.subscribeToken = subscribeToken;
		this.tech = tech;
	}

	public Subscribe(String email) {
		super(LocalDateTime.now(), LocalDateTime.now());
		this.email = email;
		this.subscribeToken = TokenGenerator.randomCharacterWithPrefix(SUBSCRIBE_PREFIX);
		this.tech = TECH.FULLSTACK;
	}
}

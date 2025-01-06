package com.mail.tech.domain.content;

import java.time.LocalDateTime;

import com.mail.tech.domain.BaseEntity;
import com.mail.tech.domain.TECH;
import com.mail.tech.domain.token.TokenGenerator;

import lombok.Getter;

@Getter
public class Content extends BaseEntity {
	public static final String CONTENT_PREFIX = "content_";
	private final String contentToken;
	private final String title;
	private final TECH tech;
	private final String contentKor;
	private final String contentEng;

	public Content(String title, String contentKor, String contentEng, TECH tech) {
		super(LocalDateTime.now(), LocalDateTime.now());
		this.contentToken = TokenGenerator.randomCharacterWithPrefix(CONTENT_PREFIX);
		this.title = title;
		this.contentKor = contentKor;
		this.contentEng = contentEng;
		this.tech = tech;
	}
}

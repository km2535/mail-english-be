package com.mail.tech.interfaces.contents.dto;

import java.time.LocalDateTime;

import com.mail.tech.domain.TECH;

public record GetContentResponse(
	String contentToken,
	String title,
	String contentKor,
	String contentEng,
	TECH tech,
	LocalDateTime createdAt,
	LocalDateTime modifiedAt
) {
}

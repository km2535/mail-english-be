package com.mail.tech.domain.info;

import java.time.LocalDateTime;

import com.mail.tech.domain.TECH;
import com.mail.tech.domain.content.Content;

public record GetContentInfo(
	String contentToken,
	String title,
	String contentKor,
	String contentEng,
	TECH tech,
	LocalDateTime createdAt,
	LocalDateTime modifiedAt
) {

	public static GetContentInfo of(Content content) {
		return new GetContentInfo(
			content.getContentToken(),
			content.getTitle(),
			content.getContentKor(),
			content.getContentEng(),
			content.getTech(),
			content.getCreatedAt(),
			content.getModifiedAt()
		);
	}
}

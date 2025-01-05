package com.mail.tech.domain;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public abstract class BaseEntity {
	private final LocalDateTime createdAt;

	private final LocalDateTime modifiedAt;

	public BaseEntity(LocalDateTime createdAt, LocalDateTime modifiedAt) {
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

}

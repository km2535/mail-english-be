package com.mail.tech.domain.exception;

import com.mail.tech.config.ErrorCode;
import com.mail.tech.config.TechException;

public class SubscribeException extends TechException {
	public SubscribeException(String email) {
		super(ErrorCode.EMAIL_ALREADY_EXIST, email + "은 이미 구독하셨습니다.");
	}
}

package com.mail.tech.domain.exception;

import com.mail.tech.config.ErrorCode;
import com.mail.tech.config.TechException;

public class SubscribeFailException extends TechException {
	public SubscribeFailException(String email) {
		super(ErrorCode.SUBSCRIBE_FAIL, email + "구독 실패.");
	}
}

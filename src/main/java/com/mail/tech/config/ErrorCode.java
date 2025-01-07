package com.mail.tech.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
	//403 Errors
	SUBSCRIBE_FAIL(403, "구독이 정상적으로 이루어지지 않았습니다."),
	//409 Errors
	RESOURCE_ALREADY_EXIST(409, "특정 리소스가 이미 존재합니다."),
	EMAIL_ALREADY_EXIST(409, "이미 가입된 이메일입니다."),

	// 500 Errors
	INTERNAL_SERVER_ERROR(500, "서버 내부 오류가 발생했습니다."),

	// 503 Errors
	SERVICE_UNAVAILABLE(503, "일시적인 서버 오류입니다.");
	private final int httpStatusCode;
	private final String description;
}

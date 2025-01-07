package com.mail.tech.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mail.tech.interfaces.common.CommonResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class TechExceptionHandler {

	@ExceptionHandler(value = TechException.class)
	public CommonResponse handleBadmintonException(
		TechException badmintonException
	) {
		ErrorCode errorCode = badmintonException.getErrorCode();
		String errorMessageForLog = badmintonException.getErrorMessage();
		log.error(wrapLogMessage(errorCode, errorMessageForLog));
		return CommonResponse.fail(errorCode, errorCode.getDescription(), errorMessageForLog);
	}

	private String wrapLogMessage(ErrorCode errorCode, String errorDetails) {
		return "**** 예외 발생: " + errorCode + " > 예외 상세: " + errorDetails;
	}
}

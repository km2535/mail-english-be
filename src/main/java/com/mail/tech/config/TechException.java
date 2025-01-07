package com.mail.tech.config;

import lombok.Getter;

@Getter
public class TechException extends RuntimeException {
	private final ErrorCode errorCode;
	private final String errorMessage;

	public TechException(ErrorCode errorCode, String errorDetails) {
		this(errorCode, errorDetails, null);
	}

	public TechException(ErrorCode errorCode, String errorDetails, Exception exception) {
		super(errorCode.getDescription() + errorDetails, exception);
		this.errorCode = errorCode;
		this.errorMessage = errorCode.getDescription() + errorDetails;
	}

	public TechException(ErrorCode errorCode) {
		this(errorCode, (Exception)null);
	}

	public TechException(ErrorCode errorCode, Exception exception) {
		super(errorCode.getDescription(), exception);
		this.errorCode = errorCode;
		this.errorMessage = errorCode.getDescription() + exception.getMessage();
	}
}

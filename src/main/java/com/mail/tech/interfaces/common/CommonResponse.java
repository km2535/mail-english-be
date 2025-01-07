package com.mail.tech.interfaces.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mail.tech.config.ErrorCode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResponse<T> {
	private Result result;

	// success 일 때 가지는 상태
	private T data;

	private ErrorCode errorCode;
	private String errorMessageForLog;
	private String errorMessageForClient;

	public static <T> CommonResponse<T> success(T data) {
		return CommonResponse.<T>builder()
			.result(Result.SUCCESS)
			.data(data)
			.build();
	}

	public static CommonResponse fail(ErrorCode errorCode, String errorMessageForClient, String errorMessageForLog) {
		return CommonResponse.builder()
			.result(Result.FAIL)
			.errorMessageForClient(errorMessageForClient)
			.errorMessageForLog(errorMessageForLog)
			.errorCode(errorCode)
			.build();
	}

	public enum Result {
		SUCCESS, FAIL
	}
}
package com.mail.tech.interfaces.subscribe.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public record DeleteSubscribeRequest(

	@Schema(example = "km2535@naver.com")
	String email
) {
}

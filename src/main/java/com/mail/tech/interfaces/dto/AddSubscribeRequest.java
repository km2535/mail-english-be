package com.mail.tech.interfaces.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public record AddSubscribeRequest(

	@Schema(example = "km2535@naver.com")
	String email
) {
}

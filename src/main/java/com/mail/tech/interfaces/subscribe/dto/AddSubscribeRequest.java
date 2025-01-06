package com.mail.tech.interfaces.subscribe.dto;

import com.mail.tech.domain.TECH;

import io.swagger.v3.oas.annotations.media.Schema;

public record AddSubscribeRequest(

	@Schema(example = "km2535@naver.com")
	String email,

	@Schema(example = "BACKEND")
	TECH tech
) {
}

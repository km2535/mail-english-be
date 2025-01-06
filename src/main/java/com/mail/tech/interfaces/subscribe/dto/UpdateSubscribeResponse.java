package com.mail.tech.interfaces.subscribe.dto;

import com.mail.tech.domain.TECH;

public record UpdateSubscribeResponse(
	String Email,
	TECH tech
) {
}

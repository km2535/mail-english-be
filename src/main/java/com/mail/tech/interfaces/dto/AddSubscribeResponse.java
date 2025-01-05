package com.mail.tech.interfaces.dto;

import com.mail.tech.domain.TECH;

public record AddSubscribeResponse(
	String subscribeToken,
	String Email,
	TECH tech
) {
}

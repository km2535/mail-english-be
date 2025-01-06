package com.mail.tech.interfaces.subscribe.dto;

import com.mail.tech.domain.TECH;

public record UpdateSubscribeRequest(
	String email,
	TECH tech
) {

}

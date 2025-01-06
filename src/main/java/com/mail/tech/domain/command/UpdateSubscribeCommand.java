package com.mail.tech.domain.command;

import com.mail.tech.domain.TECH;

public record UpdateSubscribeCommand(
	String email,
	TECH tech
) {
}

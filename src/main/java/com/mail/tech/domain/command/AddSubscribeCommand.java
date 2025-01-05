package com.mail.tech.domain.command;

import com.mail.tech.domain.TECH;

public record AddSubscribeCommand(
	String email,
	TECH tech
) {
}

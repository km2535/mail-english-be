package com.mail.tech.interfaces.dto;

public record AddSubscribeResponse(
	String subscribeToken,
	String Email
) {
}

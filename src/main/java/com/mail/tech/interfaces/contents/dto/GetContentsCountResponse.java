package com.mail.tech.interfaces.contents.dto;

public record GetContentsCountResponse(
	int backendBoardCount,
	int frontendBoardCount,
	int fullstackBoardCount,
	int infraBoardCount
) {

}

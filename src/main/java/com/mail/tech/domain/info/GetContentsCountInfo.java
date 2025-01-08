package com.mail.tech.domain.info;

public record GetContentsCountInfo(
	int backendBoardCount,
	int frontendBoardCount,
	int fullstackBoardCount,
	int infraBoardCount
) {
}

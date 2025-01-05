package com.mail.tech.domain.token;

import java.security.SecureRandom;

public class TokenGenerator {
	private static final int TOKEN_LENGTH = 20;
	private static final String ALPHA_NUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	public static String randomCharacter(int length) {
		SecureRandom random = new SecureRandom(); // SecureRandom 사용
		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(ALPHA_NUMERIC.length());
			sb.append(ALPHA_NUMERIC.charAt(index));
		}

		return sb.toString();
	}

	public static String randomCharacterWithPrefix(String prefix) {
		return prefix + randomCharacter(TOKEN_LENGTH - prefix.length());
	}
}


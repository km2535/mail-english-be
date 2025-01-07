package com.mail.tech.domain.subscribe;

import java.util.List;

import com.mail.tech.domain.TECH;

public interface SubscribeReader {
	Boolean exist(String email);

	List<Subscribe> findByTech(TECH tech);
}

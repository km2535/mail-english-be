package com.mail.tech.domain.subscribe;

import com.mail.tech.domain.TECH;

public interface SubscribeStore {
	int save(Subscribe subscribe);

	void update(String email, TECH tech);

	void delete(String email);
}

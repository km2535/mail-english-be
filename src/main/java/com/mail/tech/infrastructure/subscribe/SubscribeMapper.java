package com.mail.tech.infrastructure.subscribe;

import org.apache.ibatis.annotations.Mapper;

import com.mail.tech.domain.subscribe.Subscribe;

@Mapper
public interface SubscribeMapper {
	int save(Subscribe subscribe);

	Boolean existsByEmail(String email);
}

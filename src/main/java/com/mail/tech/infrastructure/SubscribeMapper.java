package com.mail.tech.infrastructure;

import org.apache.ibatis.annotations.Mapper;

import com.mail.tech.domain.subscribe.Subscribe;

@Mapper
public interface SubscribeMapper {
	int save(Subscribe subscribe);
}

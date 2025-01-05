package com.mail.tech.infrastructure;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import com.mail.tech.domain.subscribe.Subscribe;

@Mapper
public interface SubscribeMapper {
	@Insert("INSERT INTO subscribe (email, subscribe_token) VALUES (#{email}, #{subscribeToken})")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	int save(Subscribe subscribe);

}

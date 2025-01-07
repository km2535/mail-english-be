package com.mail.tech.infrastructure.subscribe;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mail.tech.domain.TECH;
import com.mail.tech.domain.subscribe.Subscribe;

@Mapper
public interface SubscribeMapper {
	int save(Subscribe subscribe);

	Boolean existsByEmail(String email);

	void update(String email, TECH tech);

	void delete(String email);

	List<Subscribe> findByTech(TECH tech);
}

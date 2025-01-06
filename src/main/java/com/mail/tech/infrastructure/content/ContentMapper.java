package com.mail.tech.infrastructure.content;

import org.apache.ibatis.annotations.Mapper;

import com.mail.tech.domain.content.Content;

@Mapper
public interface ContentMapper {
	Content findByContentToken(String contentToken);
}

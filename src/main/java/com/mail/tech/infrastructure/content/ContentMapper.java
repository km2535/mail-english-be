package com.mail.tech.infrastructure.content;

import org.apache.ibatis.annotations.Mapper;

import com.mail.tech.domain.content.Content;
import com.mail.tech.domain.info.GetContentsCountInfo;

@Mapper
public interface ContentMapper {
	Content findByContentToken(String contentToken);

	Content findRandom();

	GetContentsCountInfo findByContentCount();
}

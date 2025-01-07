package com.mail.tech.infrastructure.content;

import org.springframework.stereotype.Component;

import com.mail.tech.domain.content.Content;
import com.mail.tech.domain.content.ContentReader;
import com.mail.tech.domain.info.GetContentInfo;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ContentReaderImpl implements ContentReader {
	private final ContentMapper contentMapper;

	@Override
	public GetContentInfo findContent(String contentToken) {
		Content content = contentMapper.findByContentToken(contentToken);
		return GetContentInfo.of(content);
	}

	@Override
	public Content findRandom() {
		return contentMapper.findRandom();
	}
}

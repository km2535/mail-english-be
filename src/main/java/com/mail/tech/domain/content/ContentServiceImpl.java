package com.mail.tech.domain.content;

import org.springframework.stereotype.Service;

import com.mail.tech.domain.info.GetContentInfo;
import com.mail.tech.domain.info.GetContentsCountInfo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContentServiceImpl implements ContentService {
	private final ContentReader contentReader;

	@Override
	public GetContentInfo getContentInfo(String contentToken) {
		return contentReader.findContent(contentToken);
	}

	@Override
	public GetContentsCountInfo getContentsCount() {
		return contentReader.findContentsCount();
	}
}

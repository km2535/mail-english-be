package com.mail.tech.application.contents;

import org.springframework.stereotype.Service;

import com.mail.tech.domain.content.ContentService;
import com.mail.tech.domain.info.GetContentInfo;
import com.mail.tech.domain.info.GetContentsCountInfo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContentsFacade {
	private final ContentService contentService;

	public GetContentInfo findContent(String contentToken) {
		return contentService.getContentInfo(contentToken);
	}

	public GetContentsCountInfo findContentCount() {
		return contentService.getContentsCount();
	}
}

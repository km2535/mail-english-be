package com.mail.tech.domain.content;

import com.mail.tech.domain.info.GetContentInfo;
import com.mail.tech.domain.info.GetContentsCountInfo;

public interface ContentService {
	GetContentInfo getContentInfo(String contentToken);

	GetContentsCountInfo getContentsCount();
}

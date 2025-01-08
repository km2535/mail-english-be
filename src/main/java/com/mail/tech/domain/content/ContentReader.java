package com.mail.tech.domain.content;

import com.mail.tech.domain.info.GetContentInfo;
import com.mail.tech.domain.info.GetContentsCountInfo;

public interface ContentReader {

	GetContentInfo findContent(String contentToken);

	Content findRandom();

	GetContentsCountInfo findContentsCount();
}

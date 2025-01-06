package com.mail.tech.domain.content;

import com.mail.tech.domain.info.GetContentInfo;

public interface ContentReader {

	GetContentInfo findContent(String contentToken);
}

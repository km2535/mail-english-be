package com.mail.tech.domain.content;

import com.mail.tech.domain.info.GetContentInfo;

public interface ContentService {
	GetContentInfo getContentInfo(String contentToken);
}

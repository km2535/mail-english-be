package com.mail.tech.domain.subscribe;

import com.mail.tech.domain.command.AddSubscribeCommand;
import com.mail.tech.domain.info.AddSubscribeInfo;

public interface SubscribeService {
	AddSubscribeInfo addSubscribe(AddSubscribeCommand addSubscribeCommand);
}

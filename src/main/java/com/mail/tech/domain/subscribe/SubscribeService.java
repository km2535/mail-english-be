package com.mail.tech.domain.subscribe;

import com.mail.tech.domain.command.AddSubscribeCommand;
import com.mail.tech.domain.command.DeleteSubscribeCommand;
import com.mail.tech.domain.command.UpdateSubscribeCommand;
import com.mail.tech.domain.info.AddSubscribeInfo;
import com.mail.tech.domain.info.DeleteSubscribeInfo;
import com.mail.tech.domain.info.UpdateSubscribeInfo;

public interface SubscribeService {
	AddSubscribeInfo addSubscribe(AddSubscribeCommand addSubscribeCommand);

	UpdateSubscribeInfo updateSubscribe(UpdateSubscribeCommand command);

	DeleteSubscribeInfo deleteSubscribe(DeleteSubscribeCommand command);
}

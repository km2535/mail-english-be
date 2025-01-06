package com.mail.tech.interfaces.subscribe.dto;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.mail.tech.domain.command.AddSubscribeCommand;
import com.mail.tech.domain.command.DeleteSubscribeCommand;
import com.mail.tech.domain.command.UpdateSubscribeCommand;
import com.mail.tech.domain.info.AddSubscribeInfo;
import com.mail.tech.domain.info.DeleteSubscribeInfo;
import com.mail.tech.domain.info.UpdateSubscribeInfo;

@Mapper(
	componentModel = "spring",
	injectionStrategy = InjectionStrategy.CONSTRUCTOR,
	unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface SubscribeDtoMapper {

	AddSubscribeCommand of(AddSubscribeRequest request);

	AddSubscribeResponse of(AddSubscribeInfo subscribeInfo);

	UpdateSubscribeCommand of(UpdateSubscribeRequest request);

	UpdateSubscribeResponse of(UpdateSubscribeInfo subscribeInfo);

	DeleteSubscribeCommand of(DeleteSubscribeRequest request);

	DeleteSubscribeResponse of(DeleteSubscribeInfo subscribeInfo);
}

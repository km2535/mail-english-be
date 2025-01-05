package com.mail.tech.interfaces.dto;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.mail.tech.domain.command.AddSubscribeCommand;
import com.mail.tech.domain.info.AddSubscribeInfo;

@Mapper(
	componentModel = "spring",
	injectionStrategy = InjectionStrategy.CONSTRUCTOR,
	unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface SubscribeDtoMapper {

	AddSubscribeCommand of(AddSubscribeRequest request);

	AddSubscribeResponse of(AddSubscribeInfo subscribeInfo);
}

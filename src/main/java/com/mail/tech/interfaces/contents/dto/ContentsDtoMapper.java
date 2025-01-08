package com.mail.tech.interfaces.contents.dto;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.mail.tech.domain.info.GetContentInfo;
import com.mail.tech.domain.info.GetContentsCountInfo;

@Mapper(
	componentModel = "spring",
	injectionStrategy = InjectionStrategy.CONSTRUCTOR,
	unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface ContentsDtoMapper {
	GetContentResponse of(GetContentInfo getContentInfo);

	GetContentsCountResponse of(GetContentsCountInfo countInfo);
}

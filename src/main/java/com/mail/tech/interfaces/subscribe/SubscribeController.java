package com.mail.tech.interfaces.subscribe;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.tech.application.subscribe.SubscribeFacade;
import com.mail.tech.domain.command.AddSubscribeCommand;
import com.mail.tech.domain.info.AddSubscribeInfo;
import com.mail.tech.interfaces.dto.AddSubscribeRequest;
import com.mail.tech.interfaces.dto.AddSubscribeResponse;
import com.mail.tech.interfaces.dto.CommonResponse;
import com.mail.tech.interfaces.dto.SubscribeDtoMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/v1/subscribe")
public class SubscribeController {
	private final SubscribeFacade subscribeFacade;
	private final SubscribeDtoMapper subscribeDtoMapper;

	@PostMapping
	public CommonResponse<AddSubscribeResponse> addSubscribe(
		@RequestBody AddSubscribeRequest request
	) {
		AddSubscribeCommand command = subscribeDtoMapper.of(request);
		AddSubscribeInfo subscribeInfo = subscribeFacade.addSubscribe(command);
		AddSubscribeResponse subscribeResponse = subscribeDtoMapper.of(subscribeInfo);
		return CommonResponse.success(subscribeResponse);
	}
}

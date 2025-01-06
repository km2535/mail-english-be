package com.mail.tech.interfaces.subscribe;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.tech.application.subscribe.SubscribeFacade;
import com.mail.tech.domain.command.AddSubscribeCommand;
import com.mail.tech.domain.command.DeleteSubscribeCommand;
import com.mail.tech.domain.command.UpdateSubscribeCommand;
import com.mail.tech.domain.info.AddSubscribeInfo;
import com.mail.tech.domain.info.DeleteSubscribeInfo;
import com.mail.tech.domain.info.UpdateSubscribeInfo;
import com.mail.tech.interfaces.common.CommonResponse;
import com.mail.tech.interfaces.subscribe.dto.AddSubscribeRequest;
import com.mail.tech.interfaces.subscribe.dto.AddSubscribeResponse;
import com.mail.tech.interfaces.subscribe.dto.DeleteSubscribeRequest;
import com.mail.tech.interfaces.subscribe.dto.DeleteSubscribeResponse;
import com.mail.tech.interfaces.subscribe.dto.SubscribeDtoMapper;
import com.mail.tech.interfaces.subscribe.dto.UpdateSubscribeRequest;
import com.mail.tech.interfaces.subscribe.dto.UpdateSubscribeResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
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

	@PutMapping
	public CommonResponse<UpdateSubscribeResponse> updateSubscribe(
		@RequestBody UpdateSubscribeRequest request
	) {
		UpdateSubscribeCommand command = subscribeDtoMapper.of(request);
		UpdateSubscribeInfo subscribeInfo = subscribeFacade.updateSubscribe(command);
		UpdateSubscribeResponse subscribeResponse = subscribeDtoMapper.of(subscribeInfo);
		return CommonResponse.success(subscribeResponse);
	}

	//TODO : 구독 취소 로직 수정
	@DeleteMapping
	public CommonResponse<DeleteSubscribeResponse> deleteSubscribe(
		@RequestBody DeleteSubscribeRequest request
	) {
		DeleteSubscribeCommand command = subscribeDtoMapper.of(request);
		DeleteSubscribeInfo subscribeInfo = subscribeFacade.deleteSubscribe(command);
		DeleteSubscribeResponse subscribeResponse = subscribeDtoMapper.of(subscribeInfo);
		return CommonResponse.success(subscribeResponse);
	}
}

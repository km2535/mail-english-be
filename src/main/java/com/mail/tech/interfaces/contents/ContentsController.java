package com.mail.tech.interfaces.contents;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.tech.application.contents.ContentsFacade;
import com.mail.tech.domain.info.GetContentInfo;
import com.mail.tech.domain.info.GetContentsCountInfo;
import com.mail.tech.interfaces.common.CommonResponse;
import com.mail.tech.interfaces.contents.dto.ContentsDtoMapper;
import com.mail.tech.interfaces.contents.dto.GetContentResponse;
import com.mail.tech.interfaces.contents.dto.GetContentsCountResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/contents")
public class ContentsController {
	private final ContentsDtoMapper contentsDtoMapper;
	private final ContentsFacade contentsFacade;

	@GetMapping("{contentToken}")
	public CommonResponse<GetContentResponse> getContents(
		@PathVariable String contentToken
	) {
		GetContentInfo getContentInfo = contentsFacade.findContent(contentToken);
		GetContentResponse response = contentsDtoMapper.of(getContentInfo);
		return CommonResponse.success(response);
	}

	@GetMapping("/count")
	public CommonResponse<GetContentsCountResponse> getContentsCount() {
		GetContentsCountInfo countInfo = contentsFacade.findContentCount();
		GetContentsCountResponse response = contentsDtoMapper.of(countInfo);
		return CommonResponse.success(response);
	}
	//TODO: 특정 컨텐츠 리스트 조회
	//TODO: 컨텐츠 추가
	//TODO: 컨텐츠 삭제
	//TODO: 컨텐츠 수정

}

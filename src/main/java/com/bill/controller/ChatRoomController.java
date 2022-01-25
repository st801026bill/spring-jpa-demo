package com.bill.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bill.dto.request.ChatContentCreateReqDto;
import com.bill.dto.request.ChatContentDeleteReqDto;
import com.bill.dto.request.ChatContentQueryReqDto;
import com.bill.dto.request.ChatContentUpdateReqDto;
import com.bill.dto.response.ChatContentAllQueryResDto;
import com.bill.dto.response.ResponseBlankReqDto;
import com.bill.service.ChatRoomService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "ChatController", description = "聊天室管理服務")
public class ChatRoomController {
	
	@Autowired
	private ChatRoomService service;
	
	@Operation(summary = "聊天室內容查詢", description = "聊天室內容查詢")
	@PostMapping("/chat-content/query")
	public ChatContentAllQueryResDto queryChatContent(@Valid @RequestBody ChatContentQueryReqDto reqDto) {
		return service.queryContent(reqDto);
	}
	
	@Operation(summary = "聊天室內容新增", description = "聊天室內容新增")
	@PostMapping("/chat-content/create")
	public ResponseBlankReqDto createChatContent(@Valid @RequestBody ChatContentCreateReqDto reqDto) {
		service.createChatContent(reqDto);
		return new ResponseBlankReqDto();
	}
	
	@Operation(summary = "聊天室內容更新", description = "聊天室內容更新")
	@PostMapping("/chat-content/update")
	public ResponseBlankReqDto updateChatContent(@Valid @RequestBody ChatContentUpdateReqDto reqDto) {
		service.updateChatContent(reqDto);
		return new ResponseBlankReqDto();
	}
	
	@Operation(summary = "聊天室內容刪除", description = "聊天室內容刪除")
	@PostMapping("/chat-content/delete")
	public ResponseBlankReqDto deleteChatContent(@Valid @RequestBody ChatContentDeleteReqDto reqDto) {
		service.deleteChatContent(reqDto);
		return new ResponseBlankReqDto();
	}
}

package com.bill.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.dao.ChatRoomDao;
import com.bill.dto.request.ChatContentCreateReqDto;
import com.bill.dto.request.ChatContentDeleteReqDto;
import com.bill.dto.request.ChatContentUpdateReqDto;
import com.bill.dto.response.ChatContentAllQueryResDto;
import com.bill.entity.ChatContent;

@Service
public class ChatRoomService {
	
	@Autowired
	private ChatRoomDao chatRoomDao;
	
	public ChatContentAllQueryResDto queryAllContent() {

		List<ChatContent> contentList = chatRoomDao.fintAll();
		
		List<ChatContentAllQueryResDto.ChatContent> chatContentList = contentList.stream().map(content -> {
			ChatContentAllQueryResDto.ChatContent chatContent = new ChatContentAllQueryResDto.ChatContent();
			BeanUtils.copyProperties(content, chatContent);
			return chatContent;
		}).collect(Collectors.toList());
		
		return new ChatContentAllQueryResDto(chatContentList);
	}
	
	public void createChatContent(ChatContentCreateReqDto reqDto) {
		ChatContent content = reqDto.toEntity();
		chatRoomDao.save(content);
	}
	
	public void updateChatContent(ChatContentUpdateReqDto reqDto) {
		ChatContent content = reqDto.toEntity();
		chatRoomDao.save(content);
	}
	
	public void deleteChatContent(ChatContentDeleteReqDto reqDto) {
		ChatContent content = reqDto.toEntity();
		chatRoomDao.delete(content);
	}
}

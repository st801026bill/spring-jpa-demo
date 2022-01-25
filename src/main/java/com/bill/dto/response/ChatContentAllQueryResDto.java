package com.bill.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.bill.entity.ChatContent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatContentAllQueryResDto {
	
	private List<ChatContent> chatList;
	
	@Data
	public static class ChatContent {
		private Integer seqNo;
		
		private String message;
		
		private LocalDateTime createDateTime;
		
		private LocalDateTime updateDateTime;
		
		private String updateUser;
	}
}

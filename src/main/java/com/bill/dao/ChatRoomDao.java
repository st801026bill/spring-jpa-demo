package com.bill.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bill.entity.ChatContent;

@Repository
public class ChatRoomDao {
	
	@Autowired
	private ChatRoomRepository repository;
	
	public List<ChatContent> fintAll() {
		return repository.findAll(); 
	}
	
	public ChatContent save(ChatContent content) {
		return repository.save(content);
	}
	
	public void delete(ChatContent content) {
		repository.delete(content);
	}
}

package com.bill.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.bill.entity.ChatContent;

@Repository
public class ChatRoomDao {
	
	@Autowired
	private ChatRoomRepository repository;
	
	public List<ChatContent> fintAll(int page, int size) {
		Page<ChatContent> pageResult = repository.findAll(
				PageRequest.of(page, size, Sort.by("updateDateTime").descending()));
		
		return pageResult.getContent();
	}
	
	public List<ChatContent> findBySeqNo(int seqNo) {
		return repository.findBySeqNo(seqNo); 
	}
	
	public ChatContent save(ChatContent content) {
		return repository.save(content);
	}
	
	public void delete(ChatContent content) {
		repository.delete(content);
	}
}

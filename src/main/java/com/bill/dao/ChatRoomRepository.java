package com.bill.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bill.entity.ChatContent;

public interface ChatRoomRepository extends JpaRepository<ChatContent, Integer>{
	public List<ChatContent> findBySeqNo(int seqNo);
}

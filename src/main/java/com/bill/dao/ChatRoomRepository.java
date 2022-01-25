package com.bill.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bill.entity.ChatContent;

public interface ChatRoomRepository extends JpaRepository<ChatContent, Integer>{

}

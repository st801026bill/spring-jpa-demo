package com.bill.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chat_content")
public class ChatContent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seq_no", nullable = false)
	private Integer seqNo;
	
	@Column(name = "message", nullable = false)
	private String message;
	
	@Column(name = "create_date_time", nullable = false)
	private LocalDateTime createDateTime;
	
	@Column(name = "update_date_time", nullable = false)
	private LocalDateTime updateDateTime;
	
	@Column(name = "create_user", nullable = false)
	private String createUser;
	
	@Column(name = "update_user", nullable = false)
	private String updateUser;
}

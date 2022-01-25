package com.bill.dto.request;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.bill.entity.ChatContent;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ChatContentCreateReqDto {

    @NotBlank(message = "Message為必輸入欄位")
    @Schema(description = "內容", required = true, example = "Message 1")
    @Size(max = 100, message = "Message欄位長度過長")
    @JsonProperty("Message")
    private String message;
    
    @NotBlank(message = "User為必輸入欄位")
    @Schema(description = "使用者名稱", required = true, example = "Bill")
    @Size(max = 20, message = "User欄位長度過長")
    @JsonProperty("User")
    private String user;
    
    public ChatContent toEntity() {
    	ChatContent content = new ChatContent();
    	content.setMessage(this.message);
    	content.setCreateDateTime(LocalDateTime.now());
    	content.setUpdateDateTime(LocalDateTime.now());
    	content.setCreateUser(this.user);
    	content.setUpdateUser(this.user);
    	return content;
    }
}

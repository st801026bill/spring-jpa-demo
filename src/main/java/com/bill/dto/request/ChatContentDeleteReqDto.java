package com.bill.dto.request;

import javax.validation.constraints.NotBlank;

import com.bill.entity.ChatContent;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ChatContentDeleteReqDto {
	@NotBlank(message = "SeqNo為必輸入欄位")
    @Schema(description = "序號", required = true, example = "1")
    @JsonProperty("SeqNo")
    private String seqNo;
	
	public ChatContent toEntity() {
		ChatContent content = new ChatContent();
		content.setSeqNo(Integer.valueOf(this.seqNo));
		return content;
	}
}

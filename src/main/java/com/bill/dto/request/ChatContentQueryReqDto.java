package com.bill.dto.request;

import javax.validation.constraints.Min;

import com.bill.entity.ChatContent;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ChatContentQueryReqDto {
    @Schema(description = "序號", required = true, example = "1")
    @JsonProperty("SeqNo")
    private String seqNo;
    
    @Schema(description = "頁數", required = true, example = "0")
    @Min(value = 0, message = "Page不可小於0")
    @JsonProperty("Page")
    private int page;
    
    @Schema(description = "筆數", required = true, example = "1")
    @Min(value = 1, message = "Size不可小於1")
    @JsonProperty("Size")
    private int size;
	
	public ChatContent toEntity() {
		ChatContent content = new ChatContent();
		content.setSeqNo(Integer.valueOf(this.seqNo));
		return content;
	}
}

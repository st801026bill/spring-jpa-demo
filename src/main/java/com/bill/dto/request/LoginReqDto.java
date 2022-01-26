package com.bill.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class LoginReqDto {
    @NotBlank(message = "UserName為必輸入欄位")
    @Schema(description = "使用者姓名", required = true, example = "Bill")
    @Size(max = 20, message = "UserName欄位長度過長")
    @JsonProperty("UserName")
    private String userName;
}

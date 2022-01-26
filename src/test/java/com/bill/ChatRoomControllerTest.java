package com.bill;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = SpringJpaDemoApplication.class)
@ActiveProfiles("dev")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureMockMvc
public class ChatRoomControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	@Test
    @Order(1)
    void queryChatContent() throws Exception {
        String requestJson = getInput("queryChatContent");
        mockMvc.perform(post("/chat-content/query")
        		.content(requestJson)
        		.contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
        		.andExpect(status().isOk());
    }
	
	@Test
    @Order(2)
    void createChatContent() throws Exception {
        String requestJson = getInput("createChatContent");
        mockMvc.perform(post("/chat-content/create")
        		.content(requestJson)
        		.contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
        		.andExpect(status().isOk());
    }
	
	@Test
    @Order(3)
    void updateChatContent() throws Exception {
        String requestJson = getInput("updateChatContent");
        mockMvc.perform(post("/chat-content/update")
        		.content(requestJson)
        		.contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
        		.andExpect(status().isOk());
    }
	
	@Test
    @Order(4)
    void deleteChatContent() throws Exception {
        String requestJson = getInput("deleteChatContent");
        mockMvc.perform(post("/chat-content/delete")
        		.content(requestJson)
        		.contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
        		.andExpect(status().isOk());
    }
	
	private String getInput(String input) throws IOException {
        return IOUtils.toString(this.getClass().getClassLoader().getResourceAsStream(input + ".json"),
                StandardCharsets.UTF_8);
    }
}

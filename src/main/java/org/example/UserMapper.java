package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserMapper {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static User convertJSONToUser(String userJson) {
        User user = new User();

        try {
            JsonNode node = MAPPER.readTree(userJson);
            user.setEmail(node.get("email").textValue());
            user.setName(node.get("name").textValue());
            user.setUsername(node.get("username").textValue());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}

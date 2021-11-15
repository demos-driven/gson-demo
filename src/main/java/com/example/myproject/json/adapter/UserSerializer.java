package com.example.myproject.json.adapter;

import com.example.myproject.DTO.UserDTO;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class UserSerializer implements JsonSerializer<UserDTO> {

    @Override
    public JsonElement serialize(UserDTO userDTO, Type type, JsonSerializationContext jsonSerializationContext) {
        // TODO
        return null;
    }
}

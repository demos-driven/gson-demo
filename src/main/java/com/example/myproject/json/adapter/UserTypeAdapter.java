package com.example.myproject.json.adapter;

import com.example.myproject.DTO.UserAdapterDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class UserTypeAdapter extends TypeAdapter<UserAdapterDTO> {

    @Override
    public void write(JsonWriter writer, UserAdapterDTO userDTO) throws IOException {
        writer.beginObject()
                .name("name").value(userDTO.getName())
                .name("age").value(userDTO.getAge())
                .name("email").value(userDTO.getEmailAddress())
                .endObject();
    }

    @Override
    public UserAdapterDTO read(JsonReader reader) throws IOException {
        UserAdapterDTO userDTO = new UserAdapterDTO();
        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.nextName()) {
                case "name":
                    userDTO.setName(reader.nextString());
                    break;
                case "age":
                    userDTO.setAge(reader.nextInt());
                    break;
                case "email":
                case "emailAddress":
                case "email_address":
                    userDTO.setEmailAddress(reader.nextString());
                    break;
                default:
                    reader.skipValue();
            }
        }
        reader.endObject();
        return userDTO;
    }
}

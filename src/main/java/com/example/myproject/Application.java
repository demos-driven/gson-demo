package com.example.myproject;

import com.example.myproject.DTO.UserDTO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Gson gson = new Gson();

        // 1. primitive types
        Integer i = gson.fromJson("100", Integer.class);
        System.out.println(i);

        Double d = gson.fromJson("99.99", Double.class);
        System.out.println(d);

        Boolean b = gson.fromJson("true", boolean.class);
        System.out.println(b);

        System.out.println(gson.fromJson("String", String.class));

        // 2.custom class type
        UserDTO userDTO = new UserDTO()
                .withName("litong.deng")
                .withAge(18)
                .withEmailAddress("litong.deng@compass.com");

        // {"name":"litong.deng","age":18,"email_address":"litong.deng@compass.com"}
        System.out.println(gson.toJson(userDTO));

        String userJson = "{\"name\":\"litong.deng\",\"age\":18,\"emailAddress\":\"litong.deng@compass.com\"}";
        UserDTO userDTO1 = gson.fromJson(userJson, UserDTO.class);

        // {"name":"litong.deng","age":18,"emailAddress":"litong.deng@compass.com"}
        System.out.println(userDTO1);

        // 3.array
        String[] strings = new String[]{"hello", "compass", "gson"};
        // ["hello","compass","gson"]
        String arrJson = gson.toJson(strings);
        System.out.println(arrJson);

        List<String> stringList = gson.fromJson(arrJson, new TypeToken<List<String>>() {}.getType());
        System.out.println(stringList);

        UserDTO userDTO2 = new UserDTO()
                .withName("litong.deng")
                .withAge(18);
        UserDTO[] userDTOS = new UserDTO[]{userDTO, userDTO2};

        String usersJson = gson.toJson(userDTOS);
        System.out.println(usersJson);

        UserDTO[] userDTOS1 = gson.fromJson(usersJson, UserDTO[].class);
        System.out.println(Arrays.toString(userDTOS1));

        List<UserDTO> userList = gson.fromJson(usersJson, new TypeToken<List<UserDTO>>() {}.getType());
        System.out.println(userList);
    }
}


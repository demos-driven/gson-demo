package com.example.myproject.DTO;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.JSON_STYLE;

public class UserDTO {

    private String name;

    private Integer age;

    @SerializedName(value = "email_address", alternate = {"email", "emailAddress"})
    private String emailAddress;

    public UserDTO withName(String name) {
        setName(name);
        return this;
    }

    public UserDTO withAge(Integer age) {
        setAge(age);
        return this;
    }

    public UserDTO withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JSON_STYLE);
    }
}

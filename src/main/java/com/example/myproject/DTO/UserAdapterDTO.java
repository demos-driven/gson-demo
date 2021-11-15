package com.example.myproject.DTO;

import com.example.myproject.json.adapter.UserTypeAdapter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.JSON_STYLE;

@JsonAdapter(UserTypeAdapter.class)
// @JsonAdapter(UserSerializer.class)
public class UserAdapterDTO {

    @Expose
    private String name;

    @Expose
    private Integer age;

    @Expose(serialize = false)
    private String password;

    @Expose
    @SerializedName(value = "email_address", alternate = {"email", "emailAddress"})
    private String emailAddress;

    public UserAdapterDTO withName(String name) {
        setName(name);
        return this;
    }

    public UserAdapterDTO withAge(Integer age) {
        setAge(age);
        return this;
    }

    public UserAdapterDTO withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    public UserAdapterDTO withPassword(String password) {
        setPassword(password);
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JSON_STYLE);
    }
}

package com.learn.project.dto;


public class UserDto extends BaseDto {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String userName;//用户名
    private String email;//邮箱
    private String password;//密码


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", passwords='" + password + '\'' +
                '}';
    }
}

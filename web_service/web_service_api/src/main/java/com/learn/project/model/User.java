package com.learn.project.model;


public class User extends BaseModel{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String userName ;//用户名
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
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [");
        if (userName != null) {
            builder.append("userName=");
            builder.append(userName);
            builder.append(", ");
        }
        if (email != null) {
            builder.append("email=");
            builder.append(email);
            builder.append(", ");
        }
        if (password != null) {
            builder.append("password=");
            builder.append(password);
            builder.append(", ");
        }
        if (updateTime != null) {
            builder.append("updateTime=");
            builder.append(updateTime);
            builder.append(", ");
        }
        if (createTime != null) {
            builder.append("createTime=");
            builder.append(createTime);
            builder.append(", ");
        }
        builder.append("isDelete=");
        builder.append(isDelete);
        builder.append("]");
        return builder.toString();
    }
    
   
    
}

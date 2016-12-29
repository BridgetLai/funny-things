package com.learn.project.model;

import java.io.Serializable;
import java.util.Date;

public class BaseModel implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    protected Date updateTime; //修改时间
    protected Date createTime; //创建时间
    protected int isDelete;    //是否删除
    
    
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public int getIsDelete() {
        return isDelete;
    }
    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
    
    
    
    

}

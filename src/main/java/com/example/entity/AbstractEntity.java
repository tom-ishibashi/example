package com.example.entity;

import java.time.LocalDateTime;

public class AbstractEntity {

    private LocalDateTime created;
    private String createUser;
    private LocalDateTime updated;
    private String updateUser;
    /**
     * @return the created
     */
    public LocalDateTime getCreated() {
        return created;
    }
    /**
     * @param created the created to set
     */
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
    /**
     * @return the createUser
     */
    public String getCreateUser() {
        return createUser;
    }
    /**
     * @param createUser the createUser to set
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    /**
     * @return the updated
     */
    public LocalDateTime getUpdated() {
        return updated;
    }
    /**
     * @param updated the updated to set
     */
    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
    /**
     * @return the updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }
    /**
     * @param updateUser the updateUser to set
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
    
    
}

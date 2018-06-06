package com.tlgservices.guestbook.dto;

public class UserDTO {
    private long id;
    private String name;
    private long roleID;

    public UserDTO(){
    }

    public UserDTO(long id, String name, long roleID) {
        this.id = id;
        this.name = name;
        this.roleID = roleID;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getRoleID() {
        return roleID;
    }
}

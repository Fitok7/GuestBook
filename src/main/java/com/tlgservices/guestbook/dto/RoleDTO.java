package com.tlgservices.guestbook.dto;

public class RoleDTO {
    private long id;
    private String name;

    public RoleDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

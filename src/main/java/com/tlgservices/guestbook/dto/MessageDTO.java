package com.tlgservices.guestbook.dto;

public class MessageDTO {

    private long id;
    private String message;
    private long userID;

    public MessageDTO(long id, String message, long userID) {
        this.id = id;
        this.message = message;
        this.userID = userID;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public long getUserID() {
        return userID;
    }
}


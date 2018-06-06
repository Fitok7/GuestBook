package com.tlgservices.guestbook.dto;

public class MessageDTO {

    private String message;
    private long userID;

    public MessageDTO() {
    }

    public MessageDTO(String message, long userID) {
        this.message = message;
        this.userID = userID;
    }

    public String getMessage() {
        return message;
    }

    public long getUserID() {
        return userID;
    }
}


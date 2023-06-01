package com.project.integrator_engine.mongorepositories.modal;


import java.io.Serializable;

public class Message implements Serializable {

    private String messageName;
    private String messageId;

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    Message(String messageId, String messageName){

        this.messageId=messageId;
        this.messageName=messageName;

    }

    @Override
    public String toString() {
        return "Message{" +
                "messageName='" + messageName + '\'' +
                ", messageId='" + messageId + '\'' +
                '}';
    }
}

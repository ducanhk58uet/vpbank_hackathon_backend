package com.stadio.model;

import lombok.Data;

@Data
public class ResponseObject {

    private int errorCode;
    private String message;
    private Object body;

    private ResponseObject(int errorCode, String msg, Object body) {
        this.errorCode = errorCode;
        this.body = body;
        this.message = msg;
    }

    public static ResponseObject success(Object body) {
        return new ResponseObject(0, "", body);
    }

    public static ResponseObject error(String message) {
        return new ResponseObject(1, message, null);
    }
}

package com.enigma.watchstore.Dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ResponseMessage<T> {
    private int code;
    private String message;
    private T data;
    private LocalDateTime timestamp;

    public ResponseMessage() {
    }

    private ResponseMessage(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public static <T> ResponseMessage<T> success(T data) {
        return new ResponseMessage<>(HttpStatus.OK.value(), null, data);

    }

    public static ResponseMessage<Object> error(HttpStatus status) {
        return error(status.value(), status.getReasonPhrase());
    }

    public static ResponseMessage<Object> error(int code, String message) {
        return error(code, message, null);
    }

    public static <T> ResponseMessage<T> error(int code, String message, T data) {
        return new ResponseMessage<>(code, message, data);
    }
}

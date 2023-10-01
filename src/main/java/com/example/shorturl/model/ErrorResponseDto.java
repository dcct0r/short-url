package com.example.shorturl.model;

public class ErrorResponseDto {
    private String error;
    private int statusCode;

    public ErrorResponseDto() {}

    public ErrorResponseDto(int statusCode, String error) {
        this.error = error;
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "ErrorResponse: " +
                "status = '" + statusCode + '\'' +
                ", error = '" + error;
    }
}

package com.example.polyglot.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "success",
        "data",
        "errors"
})
public class ResponseDTO<T> {

    private final Boolean success;
    private final List<String> errors;
    private final T data;


    public ResponseDTO(Boolean success, List<String> errors, T data) {
        this.success = success;
        this.errors = errors;
        this.data = data;
    }

    public static <T> ResponseDTO<T> success(T data) {
        return new ResponseDTO<T>(true, null, data);
    }

    public static <T> ResponseDTO<T> fail(List<String> errors) {
        return new ResponseDTO<T>(false, errors, null);
    }

    @JsonProperty("success")
    public Boolean getSuccess() {
        return this.success;
    }

    @JsonProperty("errors")
    public List<String> getErrors() {
        return this.errors;
    }

    @JsonProperty("data")
    public T getData() {
        return this.data;
    }
}

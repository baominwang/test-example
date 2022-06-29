package com.example.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CalculateResponse implements Serializable {
    private Integer result;
}

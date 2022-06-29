package com.example.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class CalculateRequest implements Serializable {
    @NotNull
    private String operator;

    @NotNull
    private Integer operand1;

    @NotNull
    private Integer operand2;
}

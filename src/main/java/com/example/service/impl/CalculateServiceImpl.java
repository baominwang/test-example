package com.example.service.impl;

import com.example.dto.CalculateRequest;
import com.example.service.CalculateService;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    @Override
    public Integer calculate(CalculateRequest request) {
        String operator = request.getOperator();

        if (operator.equals("plus")) {
            return request.getOperand1() + request.getOperand2();
        } else if (operator.equals("subtract")) {
            return request.getOperand1() - request.getOperand2();
        } else {
            throw new RuntimeException("Invalid Operator");
        }
    }
}

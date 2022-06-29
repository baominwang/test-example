package com.example.controller;

import com.example.dto.CalculateRequest;
import com.example.dto.CalculateResponse;
import com.example.service.CalculateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class CalculateController {
    private final CalculateService calculateService;

    @PostMapping("calculate")
    @ResponseBody
    public CalculateResponse calculate(@RequestBody @Valid CalculateRequest request) {
        Integer result = calculateService.calculate(request);

        CalculateResponse response = new CalculateResponse();
        response.setResult(result);

        return response;
    }
}

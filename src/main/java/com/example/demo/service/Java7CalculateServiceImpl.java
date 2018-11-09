package com.example.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Java7")
@Service
public class Java7CalculateServiceImpl implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}

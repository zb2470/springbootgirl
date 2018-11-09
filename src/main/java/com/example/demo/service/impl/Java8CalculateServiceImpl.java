package com.example.demo.service.impl;

import com.example.demo.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Profile("Java8")
@Service
public class Java8CalculateServiceImpl implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        return Stream.of(values).reduce(0, Integer::sum);
    }
}

package ru.frolov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.frolov.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}

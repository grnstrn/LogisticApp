package com.example.logistic.controller;

import com.example.logistic.domain.Model;
import com.example.logistic.repo.ModelRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/model")
public class ModelController extends AbstractRestController<Model, ModelRepo>{

    public ModelController(ModelRepo repo) {
        super(repo);
    }
}

package com.bbit.controller;


import com.bbit.model.University;
import com.bbit.repository.UniversityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "university")
public class UniversityController {

    private  final UniversityRepository universityRepository;

    public UniversityController(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @GetMapping
    private List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    @GetMapping(value = "{id}")
    private University findOneById(@PathVariable Long id) {
        Optional<University> university = universityRepository.findById(id);

        if (university.isPresent()) {
            return  university.get();
        } else {
            return null;
        }
    }

}


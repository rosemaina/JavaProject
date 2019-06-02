package com.bbit;

import com.bbit.model.University;
import com.bbit.repository.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {

    private  final UniversityRepository universityRepository;

    public DummyData(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        University university1 = new University("Strathmore", "Olesangale");
        University university2 = new University("UON", "Nairobi");

        universityRepository.save(university1);
        universityRepository.save(university2);
    }
}

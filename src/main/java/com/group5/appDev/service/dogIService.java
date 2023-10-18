package com.group5.appDev.service;

import com.group5.appDev.model.dogData;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface dogIService {
    List<dogData> getAllDogs();
    Optional<dogData> getDog(long id);
    void addDog(MultipartFile file, String name, String breed, int age, String sex, String size, String Description);

    dogData updateDog(Long dogId, MultipartFile file, String name, String breed, int age, String sex, String size, String Description);

    dogData deleteDog(long id);
}

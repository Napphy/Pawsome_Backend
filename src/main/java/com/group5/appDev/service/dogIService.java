package com.group5.appDev.service;

import com.group5.appDev.model.dogData;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;
import java.util.List;

public interface dogIService {
    List<dogData> getAllDogs();
    dogData getDog(long id);

  //  dogData addDog(MultipartFile file, String name, String breed, int age, String sex, String size, String Description, Date bday);

//    dogData updateDog(Long dogId, MultipartFile file, String name, String breed, int age, String sex, String size, String Description, Date bday);

    dogData updateDog(long id, dogData dogDetails);

    dogData deleteDog(long id);
    dogData addDog(dogData dog);
}

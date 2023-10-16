package com.group5.appDev.service;

import com.group5.appDev.model.dogData;
import com.group5.appDev.repository.dogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Service
public class dogService implements dogIService {
    @Autowired
    private dogRepository repository;

    @Override
    public List<dogData> getAllDogs() {
        return (List<dogData>) repository.findAll();
    }

    @Override
    public Optional<dogData> getDog(long id) {
        return repository.findById(id);
    }
    @Override
    public void addDog(MultipartFile file,
                       String name,
                       String breed,
                       int age) {
        dogData dog = new dogData();

        try {

            dog.setDogImage(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        dog.setDogName(name);
        dog.setDogBreed(breed);
        dog.setDogAge(age);

        repository.save(dog);
    }
    @Override
    public dogData updateDog(Long dogId, MultipartFile file, String name, String breed, int age) {
        Optional<dogData> optional = repository.findById(dogId);
        if (optional.isPresent()) {
            dogData dog = optional.get();

            try {
                if (file != null && !file.isEmpty()) {
                    dog.setDogImage(Base64.getEncoder().encodeToString(file.getBytes()));
                }

                if (name != null) {
                    dog.setDogName(name);
                }

                if (breed != null) {
                    dog.setDogBreed(breed);
                }

                if (age > 0) {
                    dog.setDogAge(age);
                }

                repository.save(dog);
                return dog;
            } catch (IOException e) {
                e.printStackTrace();
                return null; // Handle the error appropriately
            }
        }
        return null; // Handle the case where the dog with the given ID is not found
    }

    @Override
    public dogData deleteDog(long id) {
        Optional<dogData> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return optional.get();
        }
        return null; // Or handle the case where the dog with the given ID is not found
    }
}



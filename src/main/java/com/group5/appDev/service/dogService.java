package com.group5.appDev.service;

import com.group5.appDev.model.dogData;
import com.group5.appDev.repository.dogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public dogData getDog(long id) {
        Optional optional= repository.findById(id);

        if(optional.isEmpty())
            return null;
        else
            return (dogData) optional.get();
    }

    @Override
    public dogData addDog(dogData dog) {
        return repository.save(dog);
    }

//    @Override
//    public dogData updateDog(Long dogId,
//                             MultipartFile file,
//                             String name,
//                             String breed,
//                             int age,
//                             String sex,
//                             String size,
//                             String description,
//                             Date bday) {
//        Optional<dogData> optional = repository.findById(dogId);
//        if (optional.isPresent()) {
//            dogData dog = optional.get();
//
//            try {
//                if (file != null && !file.isEmpty()) {
//                    dog.setDogImage(Base64.getEncoder().encodeToString(file.getBytes()));
//                }
//
//                if (name != null) {
//                    dog.setDogName(name);
//                }
//
//                if (breed != null) {
//                    dog.setDogBreed(breed);
//                }
//
//                if (age > 0) {
//                    dog.setDogAge(age);
//                }
//
//                if (sex != null) {
//                    dog.setDogSex(sex);
//                }
//
//                if (size != null) {
//                    dog.setDogSize(size);
//                }
//
//                if (description != null) {
//                    dog.setDogDescription(description);
//                }
//
//                if (bday != null) {
//                    dog.setDogBDay(bday);
//                }
//
//                repository.save(dog);
//                return dog;
//            } catch (IOException e) {
//                e.printStackTrace();
//                return null; // Handle the error appropriately
//            }
//        }
//        return null; // Handle the case where the dog with the given ID is not found
//    }


    @Override
    public dogData updateDog(long id, dogData dogDetails) {
        Optional<dogData> dog = repository.findById(id);

        if (dog.isEmpty()) {
            return null; // You may want to handle this case differently, e.g., throw an exception or return an error response.
        }

        dogData existingDog = dog.get();
        existingDog.setDogName(dogDetails.getDogName());
        existingDog.setDogBreed(dogDetails.getDogBreed());
        existingDog.setDogAge(dogDetails.getDogAge());
        existingDog.setDogSex(dogDetails.getDogSex());
        existingDog.setDogSize(dogDetails.getDogSize());
        existingDog.setDogImage(dogDetails.getDogImage());
        existingDog.setDogDescription(dogDetails.getDogDescription());
        existingDog.setDogBDay(dogDetails.getDogBDay());

        repository.save(existingDog);

        return existingDog;
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



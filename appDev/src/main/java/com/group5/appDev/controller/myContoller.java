package com.group5.appDev.controller;

import com.group5.appDev.model.dogData;
import com.group5.appDev.service.dogIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class myContoller {
    @Autowired
    private dogIService dogService;

    @GetMapping("/dogs")
    public String getDogs(Model model){
        List<dogData> dogs = dogService.getAllDogs();
        model.addAttribute("dogs", dogs);
        return "showDogs";
    }

    @GetMapping("/dog/{dogId}")
    public String getDog(@PathVariable Long dogId, Model model) {
        Optional<dogData> dogOptional = dogService.getDog(dogId); // Fetch the dog record by its ID

        if (dogOptional.isPresent()) {
            dogData dog = dogOptional.get();
            model.addAttribute("dog", dog);
        } else {
            return "errorPage";
        }

        return "showDog";
    }

    @GetMapping("/add-dog")
    public String addDog(Model model){
        return "addDogForm";
    }

    @PostMapping("/add-dog")
    public String saveDog(@RequestParam("file") MultipartFile file, @RequestParam("dogName") String name, @RequestParam("dogBreed") String breed, @RequestParam("dogAge") int age){
        dogService.addDog(file, name, breed, age);
        return "redirect:/dogs";
    }

    @GetMapping("/update/{dogId}")
    public String updateDog(@PathVariable Long dogId, Model model){
        Optional<dogData> dogOptional = dogService.getDog(dogId);

        if (dogOptional.isPresent()) {
            dogData dog = dogOptional.get();
            model.addAttribute("dog", dog);
        } else {
            return "errorPage";
        }

        return "updateDog";
    }

    @PostMapping("/update/{dogId}")
    public String updateDog(@PathVariable Long dogId,
                            @RequestParam("file") MultipartFile file,
                            @RequestParam("dogName") String name,
                            @RequestParam("dogBreed") String breed,
                            @RequestParam("dogAge") int age) {
        dogService.updateDog(dogId, file, name, breed, age);
        return "redirect:/dogs";
    }

    @GetMapping("/delete/{dogId}")
    public String deleteDog(@PathVariable Long dogId) {
        dogService.deleteDog(dogId);
        return "redirect:/dogs";
    }

}

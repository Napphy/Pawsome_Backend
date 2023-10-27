package com.group5.appDev.controller;

import com.group5.appDev.model.dogData;
import com.group5.appDev.repository.dogRepository;
import com.group5.appDev.service.dogIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
//replace '4200' nalang with the port you guys gonna use para sa frontend
@RestController
public class myController {
    @Autowired
    private dogIService dogService;
    @Autowired
    private dogRepository repository;


    // for RestController
    @GetMapping("/dogs")
    public List<dogData> getDogs() {
        return dogService.getAllDogs();
    }


//for Controller
//    @GetMapping("/dogs")
//    public List<dogData> getDogs(){
////        List<dogData> dogs = dogService.getAllDogs();
////        model.addAttribute("dogs", dogs);
////        return "showDogs";
//
//
//    }
//

    //for RestController
    @GetMapping("/dog/{dogId}")
    public dogData showDog(@PathVariable long dogId){
        return dogService.getDog(dogId);
    }

// for Controller

//    @GetMapping("/dog/{dogId}")
//    public String getDog(@PathVariable Long dogId, Model model) {
//        Optional<dogData> dogOptional = dogService.getDog(dogId); // Fetch the dog record by its ID
//
//        if (dogOptional.isPresent()) {
//            dogData dog = dogOptional.get();
//
//            // Format the date in the "yyyy-MM-dd" format cuz input takes yyyy-mm-dd not mm-dd-yyyy
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            String formattedDogBDay = sdf.format(dog.getDogBDay());
//
//            model.addAttribute("formattedDogBDay", formattedDogBDay);
//            model.addAttribute("dog", dog);
//
//        } else {
//            return "errorPage";
//        }
//
//        return "showDog";
//    }

    // for Controller
    @GetMapping("/add-dog")
    public String addDog(Model model){
        return "addDogForm";
    }


    // for Controller
//    @PostMapping("/add-dog")
//    public String saveDog(@RequestParam("file") MultipartFile file,
//                          @RequestParam("dogName") String name,
//                          @RequestParam("dogBreed") String breed,
//                          @RequestParam("dogAge") int age,
//                          @RequestParam("dogSex") String sex,
//                          @RequestParam("dogSize") String size,
//                          @RequestParam("dogDescription") String description,
//                          @RequestParam("dogBDay") Date bday){
//        dogService.addDog(file, name, breed, age, sex, size, description, bday);
//        return "redirect:/dogs";
//    }

    @PostMapping("/add-dog/")
    public dogData addDogSubmit(@RequestBody dogData dog){
        return dogService.addDog(dog);
    }


    @GetMapping("/update/{dogId}")
    public String updateDog(@PathVariable Long dogId, Model model){
        Optional<dogData> dogOptional = repository.findById(dogId);

        if (dogOptional.isPresent()) {
            dogData dog = dogOptional.get();

            // Format the date in the "yyyy-MM-dd" format cuz input takes yyyy-mm-dd not mm-dd-yyyy
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDogBDay = sdf.format(dog.getDogBDay());

            model.addAttribute("dog", dog);
            model.addAttribute("formattedDogBDay", formattedDogBDay);
        } else {
            return "errorPage";
        }

        return "updateDog";
    }

//    @PostMapping("/update/{dogId}")
//    public String updateDog(@PathVariable Long dogId,
//                            @RequestParam("file") MultipartFile file,
//                            @RequestParam("dogName") String name,
//                            @RequestParam("dogBreed") String breed,
//                            @RequestParam("dogAge") int age,
//                            @RequestParam("dogSex") String sex,
//                            @RequestParam("dogSize") String size,
//                            @RequestParam("dogDescription") String description,
//                            @RequestParam("dogBDay") Date bday) {
//        dogService.updateDog(dogId, file, name, breed, age, sex, size, description, bday);
//        return "redirect:/dogs";
//    }

    @PutMapping("/update/{dogId}")
    public String updateDog(@PathVariable Long dogId,
                            @RequestBody dogData dog) {
        dogService.updateDog(dogId, dog);
        return "redirect:/dogs";
    }


    @GetMapping("/delete/{dogId}")
    public String deleteDog(@PathVariable Long dogId) {
        dogService.deleteDog(dogId);
        return "redirect:/dogs";
    }

}

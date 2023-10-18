package com.group5.appDev.model;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Objects;


@Entity
@Table(name="dogs")
public class dogData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dogId;
    private String dogName;
    private String dogBreed;
    private int dogAge;
    private String dogSex;
    private String dogSize;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String dogImage;
    private String dogDescription;

    public dogData() {
    }

    public dogData(Long dogId, String dogName, String dogBreed, int dogAge, String dogSex, String dogSize, String dogImage, String dogDescription) {
        this.dogId = dogId;
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogAge = dogAge;
        this.dogSex = dogSex;
        this.dogSize = dogSize;
        this.dogImage = dogImage;
        this.dogDescription = dogDescription;
    }

    public Long getDogId() {
        return dogId;
    }

    public void setDogId(Long dogId) {
        this.dogId = dogId;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public String getDogSex() {
        return dogSex;
    }

    public void setDogSex(String dogSex) {
        this.dogSex = dogSex;
    }

    public String getDogSize() {
        return dogSize;
    }

    public void setDogSize(String dogSize) {
        this.dogSize = dogSize;
    }

    public String getDogImage() {
        return dogImage;
    }

    public void setDogImage(String dogImage) {
        this.dogImage = dogImage;
    }

    public String getDogDescription() {
        return dogDescription;
    }

    public void setDogDescription(String dogDescription) {
        this.dogDescription = dogDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dogData dogData = (dogData) o;
        return dogAge == dogData.dogAge && Objects.equals(dogId, dogData.dogId) && Objects.equals(dogName, dogData.dogName) && Objects.equals(dogBreed, dogData.dogBreed) && Objects.equals(dogSex, dogData.dogSex) && Objects.equals(dogSize, dogData.dogSize) && Objects.equals(dogImage, dogData.dogImage) && Objects.equals(dogDescription, dogData.dogDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogId, dogName, dogBreed, dogAge, dogSex, dogSize, dogImage, dogDescription);
    }

    @Override
    public String toString() {
        return "dogData{" +
                "dogId=" + dogId +
                ", dogName='" + dogName + '\'' +
                ", dogBreed='" + dogBreed + '\'' +
                ", dogAge=" + dogAge +
                ", dogSex='" + dogSex + '\'' +
                ", dogSize='" + dogSize + '\'' +
                ", dogImage='" + dogImage + '\'' +
                ", dogDescription='" + dogDescription + '\'' +
                '}';
    }
}
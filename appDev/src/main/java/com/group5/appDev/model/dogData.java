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
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String dogImage;


    public dogData() {
    }

    public dogData(Long dogId, String dogName, String dogBreed, int dogAge, String dogImage) {
        this.dogId = dogId;
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogAge = dogAge;
        this.dogImage = dogImage;
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

    public String getDogImage() {
        return dogImage;
    }

    public void setDogImage(String dogImage) {
        this.dogImage = dogImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dogData dogData = (dogData) o;
        return dogAge == dogData.dogAge && Objects.equals(dogId, dogData.dogId) && Objects.equals(dogName, dogData.dogName) && Objects.equals(dogBreed, dogData.dogBreed) && Objects.equals(dogImage, dogData.dogImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogId, dogName, dogBreed, dogAge, dogImage);
    }

    @Override
    public String toString() {
        return "dogData{" +
                "dogId=" + dogId +
                ", dogName='" + dogName + '\'' +
                ", dogBreed='" + dogBreed + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }

}

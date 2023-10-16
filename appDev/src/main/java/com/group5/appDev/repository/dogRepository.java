package com.group5.appDev.repository;


import com.group5.appDev.model.dogData;
import org.springframework.data.repository.CrudRepository;

public interface dogRepository extends CrudRepository <dogData, Long> {
}

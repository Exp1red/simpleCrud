package com.example.app.simpleCrud.service;

import com.example.app.simpleCrud.entity.Auto;
import com.example.app.simpleCrud.repository.AutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {

    private final AutoRepository autoRepository;

    public AutoService(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    public List<Auto> findAll (){
        return autoRepository.findAll();
    }

    public Auto findAutoById (int id){
        return autoRepository.getOne(id);
    }

    public void deleteAuto (int id){
        autoRepository.deleteById(id);
    }

    public void saveAuto (Auto auto){
        autoRepository.save(auto);
    }


}

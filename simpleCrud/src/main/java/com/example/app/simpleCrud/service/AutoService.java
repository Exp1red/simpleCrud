package com.example.app.simpleCrud.service;

import com.example.app.simpleCrud.dto.AutoDto;
import com.example.app.simpleCrud.entity.Auto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AutoService {


    List<Auto> findAll ();

    Auto findAutoById (int id);

    void deleteAuto (int id);

    void saveAuto (AutoDto autoDto);


}

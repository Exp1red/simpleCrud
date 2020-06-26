package com.example.app.simpleCrud.service;

import com.example.app.simpleCrud.dto.AutoDto;
import com.example.app.simpleCrud.entity.Auto;
import com.example.app.simpleCrud.repository.AutoRepository;

import java.util.List;

public class DefaultAutoService implements AutoService {

    private final AutoRepository autoRepository;

    public DefaultAutoService(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    @Override
    public List<Auto> findAll() {
        return null;
    }

    @Override
    public Auto findAutoById(int id) {
        return null;
    }

    @Override
    public void deleteAuto(int id) {

    }

    @Override
    public void saveAuto(AutoDto autoDto) {

    }
}

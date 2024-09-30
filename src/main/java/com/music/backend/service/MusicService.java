package com.music.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.music.backend.entities.Music;
import com.music.backend.repository.MusicRepository;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicRepository repository;

    public List<Music>getMusics(){
        return repository.findAll();
    }

    public Music getMusicById(int id ){
        return repository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Musica não cadastrada")
        );
    }
    
}

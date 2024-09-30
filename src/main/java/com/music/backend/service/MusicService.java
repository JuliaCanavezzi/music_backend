package com.music.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.music.backend.entities.Music;
import com.music.backend.repository.MusicRepository;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicRepository repository;

    public List<Music>getMusics(){
        return repository.findAll();
    }
    
}

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

    public Music save (Music music) {
		return this.repository.save(music);
	}

    public void deleteById(int id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        }
        else{
            throw new EntityNotFoundException("Musica não cadastrado");
        }
    }

    public void update(int id, Music music){
        Music aux = repository.getReferenceById(id);
        aux.setName(music.getName());
        aux.setNameArtist(music.getNameArtist());
        aux.setReleaseDate(music.getReleaseDate());
        aux.setMusicalStyle(music.getMusicalStyle());
        aux.setDuration(music.getDuration());
        repository.save(aux);
    }
    
}

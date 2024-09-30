package com.music.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.music.backend.entities.Music;

public interface MusicRepository extends JpaRepository<Music, Integer>{
    
}

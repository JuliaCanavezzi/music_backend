package com.music.backend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.music.backend.entities.Music;
import com.music.backend.service.MusicService;

@RestController
public class MusicController {

    @Autowired
    private MusicService service;

    @GetMapping("musics")
        public List<Music> getAlunos(){
            return service.getMusics(); 
        }

    @GetMapping("musics/{id}")
        public Music getAlunoById(@PathVariable int id){
            return service.getMusicById(id); 
        }

    @PostMapping("musics")
        public Music save (@RequestBody Music music) {
            return this.service.save(music);
        }

}

package com.music.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String nameArtist;
    private String releaseDate;
    private String musicalStyle;
    private String duration;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNameArtist() {
        return nameArtist;
    }
    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getMusicalStyle() {
        return musicalStyle;
    }
    public void setMusicalStyle(String musicalStyle) {
        this.musicalStyle = musicalStyle;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    
}

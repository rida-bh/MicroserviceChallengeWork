package com.challenge.movieservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovie;
    private String title;
    private String description;
    private String posterUrl;
    private int durationInMin;
    private Date releaseDate;
    private String country;
    @ManyToOne
    private Experience experience;
    @ManyToOne
    private Type type;
    @ManyToOne
    private Language language;


}

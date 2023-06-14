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
public class Experience {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExperience;
    private String name;
    @OneToMany(mappedBy = "experience")
    private List<Movie> movies ;
}

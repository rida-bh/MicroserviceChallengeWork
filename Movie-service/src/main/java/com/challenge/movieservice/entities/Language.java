package com.challenge.movieservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Language {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLanguage;
    private String name;
    @OneToMany(mappedBy = "language")
    private List<Movie> movies ;
}

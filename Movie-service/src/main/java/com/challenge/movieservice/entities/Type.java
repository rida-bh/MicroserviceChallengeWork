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
public class Type {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idType;
    private String name;
    @OneToMany(mappedBy = "type")
    private List<Movie> movies ;
}

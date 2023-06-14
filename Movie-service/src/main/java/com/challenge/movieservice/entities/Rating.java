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
public class Rating {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRating;
    private String name;
    private Long userId;
    @ManyToOne
    private Movie movie;

}

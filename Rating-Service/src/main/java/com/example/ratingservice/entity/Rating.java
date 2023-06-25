package com.example.ratingservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRating;
    private float ratingValue;
    private Long idMovie;
    private Long idUser;
}

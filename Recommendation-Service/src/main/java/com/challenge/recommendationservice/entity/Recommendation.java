package com.challenge.recommendationservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recommendation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecommendation;
    private Float score ;
    @Column(unique = true)
    private Long idMovie;
}

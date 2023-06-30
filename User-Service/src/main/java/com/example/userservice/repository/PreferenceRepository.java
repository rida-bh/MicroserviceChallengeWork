package com.example.userservice.repository;


import com.example.userservice.entity.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;


public interface PreferenceRepository extends JpaRepository<Preference,Long> {
    Long countByIdMovie(Long id);
}

package com.example.userservice.repository;


import com.example.userservice.entity.Preference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreferenceRepository extends JpaRepository<Preference,Long> {
}

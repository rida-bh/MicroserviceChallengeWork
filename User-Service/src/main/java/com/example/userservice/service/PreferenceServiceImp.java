package com.example.userservice.service;


import com.example.userservice.entity.Preference;
import com.example.userservice.repository.PreferenceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PreferenceServiceImp implements PreferenceService {
    PreferenceRepository preferenceRepository;
    @Override
    public List<Preference> getPreferences() {
        return preferenceRepository.findAll();
    }

    @Override
    public void addPreference(Preference preference) {
        preferenceRepository.save(preference);
    }

    @Override
    public void deletePreference(Long id) {
        preferenceRepository.deleteById(id);
    }

    @Override
    public Float getPortionLikedMovie(Long id) {
        long totalPreferences = preferenceRepository.count();
        if (totalPreferences == 0) {
            return 0.0f; // Return 0 if there are no preferences
        }

        long likedPreferences = preferenceRepository.countByIdMovie(id);
        return (float) likedPreferences / totalPreferences;
    }



}

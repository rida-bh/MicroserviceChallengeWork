package com.example.userservice.service;


import com.example.userservice.entity.Preference;

import java.util.List;

public interface PreferenceService {
    List<Preference> getPreferences();
    void addPreference(Preference preference);
    void deletePreference(Long id);
    Float getPortionLikedMovie(Long id);
}

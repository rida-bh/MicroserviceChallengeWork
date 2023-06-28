package com.example.userservice.web;

import com.example.userservice.entity.Preference;
import com.example.userservice.service.PreferenceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@Slf4j
@CrossOrigin("*")
public class PreferenceController {
    private PreferenceService preferenceService;
    @GetMapping("/preferences")
    private List<Preference> getPreferences(){
        return preferenceService.getPreferences();
    }
    @PostMapping ("/preference")
    private void Preference(@RequestBody Preference preference){
        preferenceService.addPreference(preference);
    }
    @DeleteMapping ("/preference")
    private void Preference(@RequestParam("id") Long id){
        preferenceService.deletePreference(id);
    }
    @GetMapping("/propotion-liked-movie")
    public Float getPortionLikedMovie(@RequestParam("id") Long id) {
        return preferenceService.getPortionLikedMovie(id);
    }
}

package com.example.userservice;

import com.example.userservice.entity.Preference;
import com.example.userservice.repository.PreferenceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner Start(PreferenceRepository preferenceRepository){
		return args -> {
			Preference preference=new Preference();
			preference.setIdMovie(1L);
			preference.setIdUser(1L);
			preferenceRepository.save(preference);
			Preference preference2 =new Preference();
			preference2.setIdMovie(1L);
			preference2.setIdUser(2L);
			preferenceRepository.save(preference2);
			Preference preference3 =new Preference();
			preference3.setIdMovie(1L);
			preference3.setIdUser(3L);
			preferenceRepository.save(preference3);


			Preference preference4 =new Preference();
			preference4.setIdMovie(2L);
			preference4.setIdUser(2L);
			preferenceRepository.save(preference4);
			Preference preference5 =new Preference();
			preference5.setIdMovie(2L);
			preference5.setIdUser(3L);

			preferenceRepository.save(preference5);
			Preference preference6 =new Preference();
			preference6.setIdMovie(3L);
			preference6.setIdUser(1L);
			preferenceRepository.save(preference6);
		};
	}
}

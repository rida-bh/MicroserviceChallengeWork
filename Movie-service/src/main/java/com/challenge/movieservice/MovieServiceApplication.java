package com.challenge.movieservice;

import com.challenge.movieservice.entities.*;
import com.challenge.movieservice.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;
@EnableFeignClients
@SpringBootApplication
public class MovieServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner Start(MovieRepository movieRepository,
							LanguageRepository languageRepository,
							ExperienceRepository experienceRepository,
							TypeRepository typeRepository
							){

		return args -> {
			Stream.of("English","Spanish","Mandarin","Chinese","Hindi","Arabic","Portuguese","Bengali","Russian","Japanese","Punjabi","German","Javanese","French","Telugu","Vietnamese","Korean","Tamil","Italian","Marathi","Turkish").forEach(name->{
				Language language =new Language();
				language.setName(name);
				languageRepository.save(language);
			});
			Stream.of("Action","Comedy","Drama","Romance","Thriller","Science Fiction","Horror","Adventure","Animation","Fantasy","Crime","Mystery","Family","Documentary","Musical","Historical","War","Western","Biography","Sport").forEach(name->{
				Type type =new Type();
				type.setName(name);
				typeRepository.save(type);
			});
			Stream.of("2D","3D","IMAX","IMAX 3D","Dolby Atmos","D-BOX","VIP","4DX","ScreenX","Cineplex UltraAVX","MX4D","3D IMAX","3D D-BOX","3D Dolby Atmos","Premium Large Format","Standard").forEach(name->{
				Experience experience =new Experience();
				experience.setName(name);
				experienceRepository.save(experience);
			});
			Movie movie =new Movie();
			movie.setTitle("Avatar");
			movie.setPosterUrl("./assets/images/movie/movie01.jpg");
			movie.setDescription("A paraplegic Marine is dispatched to the moon Pandora on a unique mission.");
			movie.setDurationInMin(162);
			movie.setCountry("United States");
			movie.setReleaseDate(new Date());
			Type type=typeRepository.findById(1L).get();
			movie.setType(type);
			Experience experience =experienceRepository.findById(1L).get();
			movie.setExperience(experience);
			Language language =languageRepository.findById(1L).get();
			movie.setLanguage(language);
			movieRepository.save(movie);

			Movie movie2 =new Movie();
			movie2.setTitle("Coco");
			movie2.setPosterUrl("./assets/images/movie/movie02.jpg");
			movie2.setDescription("A young boy named Miguel embarks on a journey to the Land of the Dead to unlock the true story of his family history.");
			movie2.setDurationInMin(105);
			movie2.setCountry("United States");
			movie2.setReleaseDate(new Date());
			Type type2=typeRepository.findById(2L).get();
			movie2.setType(type2);
			Experience experience2 =experienceRepository.findById(2L).get();
			movie2.setExperience(experience2);
			Language language2 =languageRepository.findById(2L).get();
			movie2.setLanguage(language2);
			movieRepository.save(movie2);

			Movie movie3 =new Movie();
			movie3.setTitle("Dangal");
			movie3.setPosterUrl("./assets/images/movie/movie03.jpg");
			movie3.setDescription("A former wrestler trains his two daughters to become world-class wrestlers against societal odds.");
			movie3.setDurationInMin(161);
			movie3.setCountry("India");
			movie3.setReleaseDate(new Date());
			Type type3=typeRepository.findById(3L).get();
			movie3.setType(type3);
			Experience experience3 =experienceRepository.findById(16L).get();
			movie3.setExperience(experience3);
			Language language3 =languageRepository.findById(5L).get();
			movie3.setLanguage(language3);
			movieRepository.save(movie3);
		};
	}
}

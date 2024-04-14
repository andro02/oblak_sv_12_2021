package com.example.klk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/film")
public class FilmController {
	
	@Autowired
	private FilmRepository filmRepository;
	
	@GetMapping
    public ResponseEntity<List<Film>> getFilms() {
        return ResponseEntity.ok(filmRepository.findAll());
    }
	
	@PostMapping
    public ResponseEntity<Film> addFilm(@RequestBody Film film) {
        film = filmRepository.save(film);
        return ResponseEntity.ok(film);
    }

}

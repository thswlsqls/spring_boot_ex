package com.care.root.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.care.root.dto.SearchMovieDto;
import com.care.root.service.MovieSearchService;

@RestController
@RequestMapping("search")
public class MovieSearchRestController {
	@Autowired
	MovieSearchService ms;
	@GetMapping("getMovies")
	public List<SearchMovieDto> getMovies() {
		return ms.getMovies();
	}
}
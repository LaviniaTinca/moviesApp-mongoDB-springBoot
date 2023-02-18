package com.laviniatinca.movies.service;

import com.laviniatinca.movies.dao.model.Movie;
import com.laviniatinca.movies.dao.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMovie(String imbdId){
        return movieRepository.findMovieByImdbId(imbdId);
    }
}

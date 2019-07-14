package edu.neu.khoury.cs5004.assignment7.problem1;

import java.util.List;

/**
 * Represents a film director. Includes fields for their name and lists of movies and tv series that
 * they have directed.
 *
 * @author evandouglass
 */
public class Director extends AbstractFilmProfessional {

  /**
   * Constructor for an {@code Director}.
   *
   * @param name the name of this director
   * @param movies a list of movies they have worked on
   * @param series a list of tv series they have worked on
   */
  public Director(Name name,
      List<Movie> movies,
      List<TVSeries> series) {
    super(name, movies, series);
  }

  /**
   * Basic constructor for {@code Director} with only a name parameter. Initializes
   * the movies and tv series as empty {@code ArrayList}s.
   *
   * @param name the name of this professional
   */
  public Director(Name name) {
    super(name);
  }
}
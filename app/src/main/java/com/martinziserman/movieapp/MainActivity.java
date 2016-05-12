package com.martinziserman.movieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.martinziserman.movieapp.Adapter.MoviesAdapter;
import com.martinziserman.movieapp.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Alien"));
        movies.add(new Movie("The usual suspect"));
        movies.add(new Movie("Harry Potter"));
        movies.add(new Movie("Camping"));
        movies.add(new Movie("Dikkenek"));
        movies.add(new Movie("La classe americaine"));
        movies.add(new Movie("L'attaque de la moussaka geante"));
        movies.add(new Movie("Yololo"));
        movies.add(new Movie("Fight club"));
        movies.add(new Movie("Moon"));
        movies.add(new Movie("Emmanuelle"));
        movies.add(new Movie("Twilight"));
        movies.add(new Movie("Tempete de boulettes geantes"));
        movies.add(new Movie("Rubber"));
        movies.add(new Movie("Pixels"));
        movies.add(new Movie("Les visiteurs"));
        movies.add(new Movie("Star wars"));

        ListView moviesListView = (ListView) findViewById(R.id.movies_listview);
        MoviesAdapter moviesAdapter = new MoviesAdapter(this);

        moviesListView.setAdapter(moviesAdapter);

        moviesAdapter.refreshWithMovies(movies);

    }
}

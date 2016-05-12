package com.martinziserman.movieapp.Adapter;

import android.view.View;
import android.widget.TextView;

import com.martinziserman.movieapp.R;
import com.martinziserman.movieapp.model.Movie;

public class RowMovieHolder {

    private final TextView titleTextView;

    public RowMovieHolder(View rowView) {
        titleTextView = (TextView) rowView.findViewById(R.id.row_movie_title_textview);
    }

    public void refreshWithMovie(Movie movie) {
        titleTextView.setText(movie.getTitle());
    }

}

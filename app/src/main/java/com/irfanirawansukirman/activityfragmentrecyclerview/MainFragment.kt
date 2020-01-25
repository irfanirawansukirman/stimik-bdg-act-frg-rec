package com.irfanirawansukirman.activityfragmentrecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.main_fragment, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val subMovieList = listOf<SubMovieResponse>(
            SubMovieResponse("Movie1", "Moviemovie1", "9,7", "Sport"),
            SubMovieResponse("Movie2", "Moviemovie2", "9,7", "Sport"),
            SubMovieResponse("Movie3", "Moviemovie3", "9,7", "Sport"),
            SubMovieResponse("Movie4", "Moviemovie4", "9,7", "Sport"),
            SubMovieResponse("Movie5", "Moviemovie5", "9,7", "Sport")
        )

        val movieList = listOf<MovieResponse>(
            MovieResponse("Sale Movie 1", subMovieList),
            MovieResponse("Sale Movie 2", subMovieList),
            MovieResponse("Sale Movie 3", subMovieList),
            MovieResponse("Sale Movie 4", subMovieList),
            MovieResponse("Sale Movie 5", subMovieList)
        )

        val movieAdapter = MainAdapter(movieList)
        val linearVertical =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recycler_main.layoutManager = linearVertical
        recycler_main.adapter = movieAdapter
    }

}

data class MovieResponse(
    val movieCategory: String,
    val subMovieList: List<SubMovieResponse>
)

data class SubMovieResponse(
    val movieTitle: String,
    val subMovieTitle: String,
    val movieRatings: String,
    val movieCategory: String
)
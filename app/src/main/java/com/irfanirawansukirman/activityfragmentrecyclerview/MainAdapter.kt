package com.irfanirawansukirman.activityfragmentrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val movieList: List<MovieResponse>) :
    RecyclerView.Adapter<MainAdapter.ItemHolder>() {

    class ItemHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bindItem(item: MovieResponse) {
            val btnSeeAll = view.findViewById<TextView>(R.id.txt_seeAll)
            btnSeeAll.setOnClickListener {
                Toast.makeText(view.context, "Hallo see all", Toast.LENGTH_SHORT).show()
            }

            // ini kategori movie
            val movieCategory = view.findViewById<TextView>(R.id.txt_item)

            // ini title movie
            val movieTitle0 = view.findViewById<TextView>(R.id.txt_movieTitle0)
            val movieTitle1 = view.findViewById<TextView>(R.id.txt_movieTitle1)
            val movieTitle2 = view.findViewById<TextView>(R.id.txt_movieTitle2)
            val movieTitle3 = view.findViewById<TextView>(R.id.txt_movieTitle3)
            val movieTitle4 = view.findViewById<TextView>(R.id.txt_movieTitle4)

            // ini sub title movie
            val subMovieTitle0 = view.findViewById<TextView>(R.id.txt_movieSubTitle0)
            val subMovieTitle1 = view.findViewById<TextView>(R.id.txt_movieSubTitle1)
            val subMovieTitle2 = view.findViewById<TextView>(R.id.txt_movieSubTitle2)
            val subMovieTitle3 = view.findViewById<TextView>(R.id.txt_movieSubTitle3)
            val subMovieTitle4 = view.findViewById<TextView>(R.id.txt_movieSubTitle)

            // mapping data ke view
            movieCategory.text = item.movieCategory

            movieTitle0.text = item.subMovieList[0].movieTitle
            movieTitle1.text = item.subMovieList[1].movieTitle
            movieTitle2.text = item.subMovieList[2].movieTitle
            movieTitle3.text = item.subMovieList[3].movieTitle
            movieTitle4.text = item.subMovieList[4].movieTitle

            subMovieTitle0.text = item.subMovieList[0].subMovieTitle
            subMovieTitle1.text = item.subMovieList[1].subMovieTitle
            subMovieTitle2.text = item.subMovieList[2].subMovieTitle
            subMovieTitle3.text = item.subMovieList[3].subMovieTitle
            subMovieTitle4.text = item.subMovieList[4].subMovieTitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.main_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = movieList.size

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bindItem(movieList[position])
    }

}
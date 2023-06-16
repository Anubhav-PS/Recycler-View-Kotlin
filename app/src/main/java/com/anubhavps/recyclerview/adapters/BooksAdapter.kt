package com.anubhavps.recyclerview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.anubhavps.recyclerview.R
import com.anubhavps.recyclerview.models.BookModel
import com.google.android.material.textview.MaterialTextView

class BooksAdapter(private val booksList: ArrayList<BookModel>) :
    RecyclerView.Adapter<BooksAdapter.BookHolder>() {



    inner class BookHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // define the views to be accessed/value to be set  or modified
        var title: MaterialTextView
        var author: MaterialTextView
        var publisher: MaterialTextView
        var edition: MaterialTextView
        var coverImage: ImageView


        init {
            title = itemView.findViewById(R.id.itemBookViewTitleTxt)
            author = itemView.findViewById(R.id.itemBookViewAuthorTxt)
            publisher = itemView.findViewById(R.id.itemBookViewPublisherTxt)
            edition = itemView.findViewById(R.id.itemBookViewEditionTxt)
            coverImage = itemView.findViewById(R.id.itemBookViewCoverImg)

            // define any lambda function that needs to be executed when the item is clicked
            itemView.setOnClickListener() {

                //display a toast containing the title of the book
                Toast.makeText(
                    itemView.context,
                    "Book Name is : ${booksList[adapterPosition].title}",
                    Toast.LENGTH_LONG
                ).show()
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookHolder {
        //inflate the custom item view we created so that it gets used for displaying in the recycler view
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_book_view, parent, false)
        return BookHolder(view)
    }

    override fun onBindViewHolder(holder: BookHolder, position: Int) {

        // this is where the books details are combined with each item layout in recycler view

        holder.title.text = booksList[position].title
        holder.author.text = booksList[position].author
        holder.publisher.text = booksList[position].publisher
        holder.edition.text = booksList[position].edition
        holder.coverImage.load(booksList[position].url) {
            transformations(RoundedCornersTransformation(2f))
        }

    }

    override fun getItemCount(): Int {
        return booksList.size;
    }
}
package com.anubhavps.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anubhavps.recyclerview.adapters.BooksAdapter
import com.anubhavps.recyclerview.models.BookModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //define the recycler view
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        //add layout manager to define either horizontal or vertical scrolling
        recyclerView.layoutManager =  LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


        //initialise the array list that contains all the object that needs to be displayed as individual item in recycler view
        val bookList : ArrayList<BookModel> = ArrayList()


        // create sample instances of book models


        val book1 = BookModel(
            title = "Advanced Engineering Mathematics",
            author = "Michael D. Greenberg",
            publisher = "Pearson Education",
            edition = "2nd",
            url = "https://m.media-amazon.com/images/I/914QD+lYOvL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book2 = BookModel(
            title = "Algorithms and Data Structures: The Basic Toolbox",
            author = "Kurt Mehlhorn and Peter Sanders",
            publisher = "Springer",
            edition = "3rd",
            url = "https://m.media-amazon.com/images/I/61tFwFUQ4CL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book3 = BookModel(
            title = "Algorithms in C++ Part 5: Graph Algorithms",
            author = "Robert Sedgewick",
            publisher = "Addison-Wesley Professional",
            edition = "3rd",
            url = "https://m.media-amazon.com/images/I/61lOVvk4ydL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book4 = BookModel(
            title = "Algorithms, Part I",
            author = "Robert Sedgewick and Kevin Wayne",
            publisher = "Addison-Wesley Professional",
            edition = "4th",
            url = "https://m.media-amazon.com/images/I/41eQ07OnlbL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book5 = BookModel(
            title = "Analog Circuit Design: A Tutorial Guide to Applications and Solutions",
            author = "Bob Dobkin and Jim Williams",
            publisher = "Newnes",
            edition = "2nd",
            url = "https://m.media-amazon.com/images/I/51zclExwT9L._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book6 = BookModel(
            title = "Applied Partial Differential Equations: An Introduction",
            author = "J. David Logan",
            publisher = "Springer",
            edition = "2nd",
            url = "https://m.media-amazon.com/images/P/3319124927.01._SCLZZZZZZZ_SX500_.jpg"
        )

        val book7 = BookModel(
            title = "Calculus: Early Transcendentals",
            author = "James Stewart",
            publisher = "Cengage Learning",
            edition = "8th",
            url = "https://m.media-amazon.com/images/I/41XZVHND-aL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book8 = BookModel(
            title = "Classical Mechanics",
            author = "Herbert Goldstein, Charles P. Poole Jr., and John L. Safko",
            publisher = "Pearson",
            edition = "3rd",
            url = "https://m.media-amazon.com/images/I/718n4on-z6L._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book9 = BookModel(
            title = "Control Systems Engineering",
            author = "Norman S. Nise",
            publisher = "Wiley",
            edition = "7th",
            url = "https://m.media-amazon.com/images/I/51FRTMPrqeL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book10 = BookModel(
            title = "Data Structures and Algorithm Analysis in C++",
            author = "Mark Allen Weiss",
            publisher = "Pearson",
            edition = "4th",
            url = "https://m.media-amazon.com/images/I/41x7Y46JVkL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book11 = BookModel(
            title = "Data Structures and Algorithms Made Easy: Data Structures and Algorithmic Puzzles",
            author = "Narasimha Karumanchi",
            publisher = "CareerMonk Publications",
            edition = "1st",
            url = "https://m.media-amazon.com/images/I/61CVP-MfUoL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book12 = BookModel(
            title = "Data Structures Using C",
            author = "Reema Thareja",
            publisher = "Oxford University Press",
            edition = "2nd",
            url = "https://m.media-amazon.com/images/I/51mDmYHm31L._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book13 = BookModel(
            title = "Data Structures: Abstraction and Design Using Java",
            author = "Elliot B. Koffman and Paul A.T. Wolfgang",
            publisher = "Wiley",
            edition = "3rd",
            url = "https://m.media-amazon.com/images/I/41F92ATEWXL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book14 = BookModel(
            title = "Digital Signal Processing: Principles, Algorithms, and Applications",
            author = "John G. Proakis and Dimitris G. Manolakis",
            publisher = "Pearson",
            edition = "4th",
            url = "https://m.media-amazon.com/images/I/81TLXS7o0GL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book15 = BookModel(
            title = "Electric Energy Systems: Analysis and Operation",
            author = "Antonio Gomez-Exposito, Antonio J. Conejo, and Claudio Canizares",
            publisher = "CRC Press",
            edition = "2nd",
            url = "https://m.media-amazon.com/images/I/91ShOa1wfnL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book16 = BookModel(
            title = "Electric Machinery and Transformers",
            author = "Bhag S. Guru and Huseyin R. Hiziroglu",
            publisher = "Oxford University Press",
            edition = "3rd",
            url = "https://m.media-amazon.com/images/I/714YMuhModL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book17 = BookModel(
            title = "Electrical Engineering: Principles and Applications",
            author = "Allan R. Hambley",
            publisher = "Pearson",
            edition = "7th",
            url = "https://m.media-amazon.com/images/I/619h00PdvOL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book18 = BookModel(
            title = "Electrical Machines, Drives, and Power Systems",
            author = "Theodore Wildi",
            publisher = "Pearson",
            edition = "6th",
            url = "https://m.media-amazon.com/images/I/81LmKBUiBML._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book19 = BookModel(
            title = "Electrical Power Systems Quality",
            author = "Roger C. Dugan, Mark F. McGranaghan, and Surya Santoso",
            publisher = "McGraw-Hill",
            edition = "3rd",
            url = "https://m.media-amazon.com/images/I/41L1dvd+AZL._AC_UY327_FMwebp_QL65_.jpg"
        )

        val book20 = BookModel(
            title = "Electronic Devices and Circuit Theory",
            author = "Robert L. Boylestad and Louis Nashelsky",
            publisher = "Pearson",
            edition = "11th",
            url = "https://m.media-amazon.com/images/I/51KPN4V2YPL._AC_UY327_FMwebp_QL65_.jpg"
        )

        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
        bookList.add(book5)
        bookList.add(book6)
        bookList.add(book7)
        bookList.add(book8)
        bookList.add(book9)
        bookList.add(book10)
        bookList.add(book11)
        bookList.add(book12)
        bookList.add(book13)
        bookList.add(book14)
        bookList.add(book15)
        bookList.add(book16)
        bookList.add(book17)
        bookList.add(book18)
        bookList.add(book19)
        bookList.add(book20)


        //initialise the book adapter
        val booksAdapter = BooksAdapter(bookList)

        // attach adapter to the recycler view
        recyclerView.adapter = booksAdapter




    }
}
package com.example.codepathmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var emails: List<Email>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recycler View initialization
        val emailsRv = findViewById<RecyclerView>(R.id.emailsRv)

        //Fetching list of emails
        emails = EmailFetcher.getEmails()

        //Create adapter
        val adapter = EmailAdapter(emails)

        //Attach the adapter to the RecyclerView to populate items
        emailsRv.adapter = adapter

        //Set layout manager to position the items
        emailsRv.layoutManager = LinearLayoutManager(this)
    }
}
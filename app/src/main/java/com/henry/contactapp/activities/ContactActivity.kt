package com.henry.contactapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.henry.contactapp.R
import com.henry.contactapp.adapters.ContactAdapter
import com.henry.contactapp.models.Suppliers
import kotlinx.android.synthetic.main.activity_contact.*
import java.util.function.Supplier

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        rvContact.layoutManager = layoutManager

        val adapter = ContactAdapter(this, Suppliers.contacts)
        rvContact.adapter = adapter
    }
}
package com.henry.contactapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.henry.contactapp.R
import com.henry.contactapp.models.contact
import kotlinx.android.synthetic.main.list_item.view.*

class ContactAdapter(val context: Context, val contacts:List<contact>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    inner class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var currentContact:String? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener {
                Toast.makeText(context,currentContact,Toast.LENGTH_SHORT).show()
            }
        }

        fun setData(item:contact?, pos: Int) {
            itemView.txvContact.text = item!!.name
            currentContact = item.name
            currentPosition = pos

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contacts[position]
        holder.setData(contact, position)
    }

}
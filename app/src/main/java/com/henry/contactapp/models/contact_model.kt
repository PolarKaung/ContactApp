package com.henry.contactapp.models

data class contact(val name: String)

object Suppliers {
    val contacts = listOf(
        contact("Kaung Min Khant"),
        contact("Wint Myat Noe")
    )
}
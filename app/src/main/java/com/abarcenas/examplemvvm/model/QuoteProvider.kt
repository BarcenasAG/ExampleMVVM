package com.abarcenas.examplemvvm.model

class QuoteProvider {
    companion object {
        fun random():QuoteModel{                   //Creamos una funcion aleatoria
            val position = (0..9).random()
            return quote[position]
        }

       private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "1",
                author = "AristiDevs"
            ),
            QuoteModel(
                quote = "2",
                author = "AristiDevs"
            ),
            QuoteModel(
                quote = "3",
                author = "AristiDevs"
            ),
            QuoteModel(
                quote = "4",
                author = "AristiDevs"
            ),
            QuoteModel(
                quote = "5",
                author = "AristiDevs"
            ),
            QuoteModel(
                quote = "6",
                author = "AristiDevs"
            ),
            QuoteModel(
                quote = "7",
                author = "AristiDevs"
            ),
            QuoteModel(
                quote = "8",
                author = "AristiDevs"
            ),
            QuoteModel(
                quote = "9",
                author = "AristiDevs"
            ),
            QuoteModel(
                quote = "10",
                author = "AristiDevs"
            ),
        )
    }
}
package com.example.bookz2.category

import com.example.bookz2.R

object CategoryConstant {
    fun getCategoryData(): List<CategoryData> {
        val data = mutableListOf<CategoryData>()

        data.add(
            CategoryData(
                id = "agama",
                name = "Agama",
                image = R.drawable.ic_book_1
            )
        )

        data.add(
            CategoryData(
                id = "biografi",
                name = "Biografi",
                image = R.drawable.ic_book_2
            )
        )

        data.add(
            CategoryData(
                id = "buku_cerita_anak",
                name = "Buku Cerita Anak",
                image = R.drawable.ic_book_3
            )
        )

        data.add(
            CategoryData(
                id = "humor",
                name = "Humor",
                image = R.drawable.ic_book_4
            )
        )

        data.add(
            CategoryData(
                id = "misteri",
                name = "Misteri",
                image = R.drawable.ic_book_1
            )
        )

        data.add(
            CategoryData(
                id = "psikologi",
                name = "Psikologi",
                image = R.drawable.ic_book_2
            )
        )

        data.add(
            CategoryData(
                id = "sastra",
                name = "Sastra",
                image = R.drawable.ic_book_3
            )
        )

        data.add(
            CategoryData(
                id = "bisnis",
                name = "Bisnis",
                image = R.drawable.ic_book_4
            )
        )

        data.add(
            CategoryData(
                id = "fantasi",
                name = "Novel",
                image = R.drawable.ic_book_1
            )
        )

        data.add(
            CategoryData(
                id = "komik",
                name = "Komik",
                image = R.drawable.ic_book_2
            )
        )

        data.add(
            CategoryData(
                id = "motivasi",
                name = "Motivasi",
                image = R.drawable.ic_book_3
            )
        )

        data.add(
            CategoryData(
                id = "romantis",
                name = "Romantis",
                image = R.drawable.ic_book_4
            )
        )

        return data
    }
}
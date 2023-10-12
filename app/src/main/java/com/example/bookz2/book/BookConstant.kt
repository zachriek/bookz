package com.example.bookz2.book

import com.example.bookz2.R

object BookConstant {
    fun getBookData(): List<BookData> {
        val data = mutableListOf<BookData>()

//        Buku Agama
        data.add(
            BookData(
                id = "iman_dalam_tantangan",
                categoryId = "agama",
                title = "Iman Dalam Tantangan",
                author = "Franz Magnis Suseno",
                image = R.drawable.book_iman
            )
        )

        data.add(
            BookData(
                id = "ketika_rasul_marah",
                categoryId = "agama",
                title = "Ketika Rasul Marah",
                author = "Dr. Abdullah Faraj al-Shabban",
                image = R.drawable.book_rasul
            )
        )

        data.add(
            BookData(
                id = "tafsir_juz_amma",
                categoryId = "agama",
                title = "Tafsir Juz 'Amma",
                author = "Imam Qusyairi",
                image = R.drawable.book_juz_amma
            )
        )

        data.add(
            BookData(
                id = "kesehatan_mental",
                categoryId = "agama",
                title = "Kitab Kesehatan Mental",
                author = "Abu Zaid al-Balkhi",
                image = R.drawable.book_kesehatan_mental
            )
        )

//        Biografi
        data.add(
            BookData(
                id = "elon_musk",
                categoryId = "biografi",
                title = "Elon Musk: Tesla Spacex",
                author = "Ashlee Vance",
                image = R.drawable.book_elon_musk
            )
        )

        data.add(
            BookData(
                id = "tuesdays_with_morrie",
                categoryId = "biografi",
                title = "Tuesdays With Morrie",
                author = "Mitch Albom",
                image = R.drawable.book_tuesday_with_morrie
            )
        )

//        Buku Cerita Anak
        data.add(
            BookData(
                id = "wimpy_kid",
                categoryId = "buku_cerita_anak",
                title = "Diary Of A Wimpy Kid",
                author = "Jeff Kinney",
                image = R.drawable.book_wimpy_kid
            )
        )

        data.add(
            BookData(
                id = "suho_goes_to_pie",
                categoryId = "buku_cerita_anak",
                title = "Suho Goes to Pee",
                author = "Elkey Chereyl",
                image = R.drawable.book_suho_goes_to_pie
            )
        )

//        Buku Humor
        data.add(
            BookData(
                id = "the_odd_1s_out",
                categoryId = "humor",
                title = "The Odd 1S Out",
                author = "James Rallison",
                image = R.drawable.book_the_odd_1s_out
            )
        )

//        Buku Misteri
        data.add(
            BookData(
                id = "sherlock_holmes",
                categoryId = "misteri",
                title = "Sherlock Holmes",
                author = "Doyle, Sir Arthur Co",
                image = R.drawable.book_sherlock_holmes
            )
        )

        data.add(
            BookData(
                id = "woman_in_white",
                categoryId = "misteri",
                title = "Woman in White",
                author = "Wilkie Collins",
                image = R.drawable.book_women_in_white
            )
        )

//        Buku Psikologi
        data.add(
            BookData(
                id = "outliers",
                categoryId = "psikologi",
                title = "Outliers",
                author = "Malcolm Gladwell",
                image = R.drawable.book_outliers
            )
        )

        data.add(
            BookData(
                id = "think_again",
                categoryId = "psikologi",
                title = "Think Again",
                author = "Adam Grant",
                image = R.drawable.book_think_again
            )
        )

//        Buku Sastra
        data.add(
            BookData(
                id = "beware_worn_down_by_time",
                categoryId = "sastra",
                title = "Beware Worn Down By Time",
                author = "Addin Jauharudin",
                image = R.drawable.book_worn_down
            )
        )

        data.add(
            BookData(
                id = "the_odd_1s_out_2",
                categoryId = "sastra",
                title = "The Odd 1S Out: How To Be Cool",
                author = "James Rallison",
                image = R.drawable.book_the_odd_1s_out_2
            )
        )

//        Buku Bisnis
        data.add(
            BookData(
                id = "chasing_unicorns",
                categoryId = "bisnis",
                title = "Chasing Unicorns",
                author = "Nicko Widjaja",
                image = R.drawable.book_chasing_unicorns
            )
        )

        data.add(
            BookData(
                id = "the_intelligent_investor",
                categoryId = "bisnis",
                title = "The Intelligent Investor",
                author = "Benjamin Graham",
                image = R.drawable.book_inteliigent_investor
            )
        )

//        Buku Fantasi
        data.add(
            BookData(
                id = "the_line_between_loss_wonders",
                categoryId = "fantasi",
                title = "The Line Between Loss & Wonders",
                author = "Ayra Sirait",
                image = R.drawable.book_the_line
            )
        )

        data.add(
            BookData(
                id = "harry_potter_and_the_sorcerers_stone",
                categoryId = "fantasi",
                title = "Harry Potter And The Sorcerers Stone",
                author = "J.K. Rowling",
                image = R.drawable.book_harry_potter_1
            )
        )

//        Buku Komik
        data.add(
            BookData(
                id = "big_nate_14",
                categoryId = "komik",
                title = "Big Nate #14",
                author = "Lincoln Peirce",
                image = R.drawable.book_big_nate_14
            )
        )

        data.add(
            BookData(
                id = "sapiens_a_graphic_history",
                categoryId = "komik",
                title = "Sapiens: A Graphic History",
                author = "Yuval Noah Harari",
                image = R.drawable.book_sapiens
            )
        )

//        Buku Motivasi
        data.add(
            BookData(
                id = "think_and_grow_rich",
                categoryId = "motivasi",
                title = "Think and Grow Rich",
                author = "Napoleon Hill",
                image = R.drawable.book_think_grow_rich
            )
        )

        data.add(
            BookData(
                id = "factfulness",
                categoryId = "motivasi",
                title = "Factfulness",
                author = "Hans Rosling",
                image = R.drawable.book_factfulness
            )
        )

//        Buku Romantis
        data.add(
            BookData(
                id = "winter_in_tokyo",
                categoryId = "romantis",
                title = "Winter in Tokyo",
                author = "Ilana Tan",
                image = R.drawable.book_winter_in_tokyo
            )
        )

        data.add(
            BookData(
                id = "mismatch",
                categoryId = "romantis",
                title = "MetroPop: Mismatch",
                author = "Arata Kim",
                image = R.drawable.book_mismatch
            )
        )

        return data
    }
}
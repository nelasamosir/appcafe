package com.cafe.cafeapp.data

import com.cafe.cafeapp.model.Cake
import com.cafe.cafeapp.model.Drink
import com.cafe.cafeapp.R

object DataDummy {
    val mobileCakes = listOf(
        Cake(
            id = 1,
            name = "Red Velvet Cake",
            type = "cake",
            price = "40 Ribu/slice",
            photo = R.drawable.reve
        ),
        Cake(
            id = 2,
            name = "Chocolate Brownies",
            type = "brownies",
            price = "45 Ribu/slice",
            photo = R.drawable.brownies
        ),
        Cake(
            id = 3,
            name = "Blueberry Muffin",
            type = "muffin",
            price = "30 Ribu/pcs",
            photo = R.drawable.muffin
        ),
        Cake(
            id = 4,
            name = "Apple Pie",
            type = "pie",
            price = "35 Ribu/slice",
            photo = R.drawable.pie
        ),
        Cake(
            id = 5,
            name = "Lemon Tart",
            type = "tart",
            price = "35 Ribu/slice",
            photo = R.drawable.tart
        ),
        Cake(
            id = 6,
            name = "Carrot Cake",
            type = "cake",
            price = "40 Ribu/slice",
            photo = R.drawable.carrot
        ),
        Cake(
            id = 7,
            name = "Cheesecake",
            type = "cake",
            price = "45 Ribu/slice",
            photo = R.drawable.cheese
        ),
        Cake(
            id = 8,
            name = "Banana Bread",
            type = "bread",
            price = "20 Ribu/pcs",
            photo = R.drawable.bread
        ),
        Cake(
            id = 9,
            name = "Coconut Macaroon",
            type = "macaroon",
            price = "7 Ribu/pcs",
            photo = R.drawable.macaroon
        ),
        Cake(
            id = 10,
            name = "Chocolate Chip Cookie",
            type = "cookie",
            price = "15 Ribu/pcs",
            photo = R.drawable.cookie
        ),
    )


    val mobileDrinks = listOf(
        Drink(
            id = 1,
            name = "Cappuccino",
            photo = R.drawable.cino,
            type = "coffee",
            price = "37 Ribu/cup",
        ),
        Drink(
            id = 2,
            name = "Latte",
            photo = R.drawable.latte,
            type = "coffee",
            price = "35 Ribu/cup",
        ),
        Drink(
            id = 3,
            name = "Chamomile Tea",
            photo = R.drawable.chamomile,
            type = "tea",
            price = "35 Ribu/cup",
        ),
        Drink(
            id = 4,
            name = "Orange Juice",
            photo = R.drawable.orange,
            type = "juice",
            price = "17 Ribu/cup",
        ),
        Drink(
            id = 5,
            name = "Blueberry Smoothie",
            photo = R.drawable.blueberry,
            type = "smoothie",
            price = "40 Ribu/cup",
        ),
        Drink(
            id = 6,
            name = "Vanilla Milkshake",
            photo = R.drawable.vanilla,
            type = "milkshake",
            price = "25 Ribu/cup",
        ),
        Drink(
            id = 7,
            name = "Espresso",
            photo = R.drawable.espresso,
            type = "coffee",
            price = "30 Ribu/cup",
        ),
        Drink(
            id = 8,
            name = "Chai Tea Latte",
            photo = R.drawable.chai,
            type = "tea",
            price = "33 Ribu/cup",
        ),
        Drink(
            id = 9,
            name = "Matcha Latte",
            photo = R.drawable.matcha,
            type = "coffee",
            price = "30 Ribu/cup",
        ),
        Drink(
            id = 10,
            name = "Soda Drink",
            photo = R.drawable.soda,
            type = "soda",
            price = "10 Ribu/can",
        ),
    )

}
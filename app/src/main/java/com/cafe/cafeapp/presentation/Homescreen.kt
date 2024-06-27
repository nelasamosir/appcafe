package com.cafe.cafeapp.presentation

import com.cafe.cafeapp.presentation.component.CakeItem
import com.cafe.cafeapp.presentation.component.DrinkItem
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.navigation.NavController
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cafe.cafeapp.navigation.Screen
import com.cafe.cafeapp.data.DataDummy
import com.cafe.cafeapp.model.Cake
import com.cafe.cafeapp.model.Drink

@Composable
fun Homescreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    cake: List<Cake> = DataDummy.mobileCakes,
    drink: List<Drink> = DataDummy.mobileDrinks,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(cake, key = { it.id }) {
                    CakeItem(cake = it) { cakeId ->
                        navController.navigate(Screen.Detail.route + "/$cakeId")
                    }
                }
            }
        }


        items(drink, key = { it.id }) {
            DrinkItem(drink = it, modifier = Modifier.padding(horizontal = 16.dp))
        }
    }}
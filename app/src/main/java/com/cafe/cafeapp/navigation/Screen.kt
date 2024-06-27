package com.cafe.cafeapp.navigation

import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String) {
    object Home : Screen("Home")

    object Grid : Screen("Grid")

    object About : Screen("About")

    object Detail : Screen ("Detail_Cake")
}
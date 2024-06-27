package com.cafe.cafeapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cafe.cafeapp.R
import com.cafe.cafeapp.model.Cake
import com.cafe.cafeapp.ui.theme.CafeAppTheme

@Composable
fun CakeItem(
    cake: Cake ,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = cake.photo),
            contentDescription = cake.name,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = cake.name,
            textAlign = TextAlign.Center,
            color = when (cake.name) {
                "Red Velvet Cake" -> Color.Black
                "Chocolate Brownies" -> Color.Black
                "Blueberry Muffin" -> Color.Black
                "Apple Pie" -> Color.Black
                "Lemon Tart" -> Color.Black
                "Carrot Cake" -> Color.Black
                "Cheesecake" -> Color.Black
                "Banana Bread" -> Color.Black
                "Coconut Macaroon" -> Color.Black
                "Chocolate Chip Cookie" -> Color.Black
                else -> MaterialTheme.colorScheme.primary
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = cake.type,
            textAlign = TextAlign.Center,
            color = when (cake.type) {
                "cake" -> Color.Black
                "brownies" -> Color.Black
                "muffin" -> Color.Black
                "pie" -> Color.Black
                "tart" -> Color.Black
                "cake" -> Color.Black
                "cake" -> Color.Black
                "bread" -> Color.Black
                "macaroon" -> Color.Black
                "cookie" -> Color.Black
                else -> MaterialTheme.colorScheme.primary
            },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
    (showBackground=true)
@Composable
private fun CakeItemPreview() {
    CafeAppTheme {
        CakeItem(
            cake = Cake(2, "Chocolate Brownies", "brownies", price = "45Ribu/slice", R.drawable.brownies),
            onItemClicked = { cakeId ->
                println("Cake Id : $cakeId")
            }
        )
    }
}
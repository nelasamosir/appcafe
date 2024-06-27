package com.cafe.cafeapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cafe.cafeapp.model.Drink
import com.cafe.cafeapp.ui.theme.CafeAppTheme
import com.cafe.cafeapp.R

@Composable
fun DrinkItem(
    drink: Drink ,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = drink.photo),
            contentDescription = drink.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = drink.name, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = drink.type, color = MaterialTheme.colorScheme.primary)
                Text(text = " - ${drink.price}")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MentorItemPreview() {
    CafeAppTheme {
        DrinkItem(
            drink = Drink(
                1,
                "Cappuccino",
                R.drawable.cino,
                "coffee",
                "37 Ribu/cup"
            )
        )
    }
}
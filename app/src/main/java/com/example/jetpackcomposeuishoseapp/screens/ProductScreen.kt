package com.example.jetpackcomposeuishoseapp.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpackcomposeuishoseapp.Navigation.NavigationItem
import com.example.jetpackcomposeuishoseapp.R
import com.example.jetpackcomposeuishoseapp.component.ProductItem
import com.example.jetpackcomposeuishoseapp.model.Product

@Composable
fun ProductScreen(
    navController: NavController
){
   var products: List<Product> = remember {
       getProductList()
   }

    LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.padding(8.dp)) {
        items(products){
            ProductItem(product = it){
                navController.navigate("${NavigationItem.PRODUCT_DETAILS}/${it.id}")
            }
        }
    }
}

fun getProductList() : List<Product>{
    return listOf(
        Product(
            id = "1",
            color = Color.Magenta,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s1,
            size = 8
        ) ,
                Product(
                id = "2",
        color = Color.Cyan,
        price = 1200f,
        name = "Shoes Blue",
        discountPrice = 1000f,
        rating = 4.7f,
        imageRes = R.drawable.s2,
        size = 8
    ),
        Product(
            id = "3",
            color = Color.Blue,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s3,
            size = 8
        ) ,
        Product(
            id = "4",
            color = Color.Black,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s4,
            size = 8
        ) ,
        Product(
            id = "5",
            color = Color.Cyan,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s7,
            size = 8
        ) ,
        Product(
            id = "6",
            color = Color.Magenta,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s8,
            size = 8
        ) ,
        Product(
            id = "7",
            color = Color.Red,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s7,
            size = 8
        ) ,
        Product(
            id = "8",
            color = Color.Green,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s9,
            size = 8
        ) ,
        Product(
            id = "9",
            color = Color.DarkGray,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s10,
            size = 8
        ) ,
        Product(
            id = "10",
            color = Color.Green,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s12,
            size = 8
        ) ,
        Product(
            id = "11",
            color = Color.Cyan,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s13,
            size = 8
        ) ,
        Product(
            id = "12",
            color = Color.DarkGray,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s1,
            size = 8
        ) ,
        Product(
            id = "13",
            color = Color.Yellow,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s11,
            size = 8
        ) ,
        Product(
            id = "14",
            color = Color.Red,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s7,
            size = 8
        ) ,
        Product(
            id = "15",
            color = Color.Cyan,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s2,
            size = 8
        ) ,
        Product(
            id = "16",
            color = Color.Magenta,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s3,
            size = 8
        ) ,
        Product(
            id = "17",
            color = Color.Blue,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s4,
            size = 8
        ) ,
        Product(
            id = "18",
            color = Color.Black,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s7,
            size = 8
        ) ,
        Product(
            id = "19",
            color = Color.Cyan,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s8,
            size = 8
        ) ,
        Product(
            id = "20",
            color = Color.Magenta,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s9,
            size = 8
        ) ,
        Product(
            id = "21",
            color = Color.Green,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s10,
            size = 8
        ) ,
        Product(
            id = "22",
            color = Color.Red,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s11,
            size = 8
        ) ,
        Product(
            id = "23",
            color = Color.Cyan,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s12,
            size = 8
        ) ,
        Product(
            id = "24",
            color = Color.Yellow,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s13,
            size = 8
        ) ,
        Product(
            id = "25",
            color = Color.Green,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s1,
            size = 8
        ) ,
        Product(
            id = "26",
            color = Color.DarkGray,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s2,
            size = 8
        ) ,
        Product(
            id = "27",
            color = Color.Red,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s7,
            size = 8
        )


    )
}
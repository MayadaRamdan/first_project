package com.example.first_project


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape

import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage



@Composable
fun grid(list: List<Product>){
    LazyVerticalGrid(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        columns = GridCells.Fixed(2)){
       items(count = list.count()) {index ->
           gridCell(list[index])
       }
    }
}

@Composable
fun gridCell( pro:Product){

    Card(modifier = Modifier

        .clip(RoundedCornerShape(20.dp))
        .requiredSize(200.dp ,250.dp)) {
        Column(modifier = Modifier.fillMaxWidth()) {
            AsyncImage(model = pro.Url, contentDescription = "")
            Text(text = pro.name)
            Text(text = pro.price.toString())
        }

    }


}
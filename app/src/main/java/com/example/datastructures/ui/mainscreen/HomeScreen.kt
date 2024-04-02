package com.example.datastructures.ui.mainscreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MyGreeting(name: String = "Pinal", number: Int) {
    Text(
        text = "Hello $name, you're $number years old!"
    )

    Text("Let's try this")
}
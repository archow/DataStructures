package com.example.datastructures

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.datastructures.databinding.ActivityMainBinding
import com.example.datastructures.ui.mainscreen.MyGreeting
import com.example.datastructures.ui.theme.DataStructuresTheme

//some change
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    fun methodName(name: String, number: Int){

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)

//        setContent {
//            //all my composable functions
//            MyGreeting(number = 40)
//        }
//        setContentView(binding.root)

//        val myExample = ExampleK("", 8)
//        myExample.name = "whatever"
//        myExample.number = 9

//        //mutable; can be reassigned
//        //attributes can be changed if object
//        var string = "hello"
//        string = "hi"


        //immutable; cannot be reassigned
//        val someString = "hey"
       // someString = "ho"

        setContent {
            DataStructuresTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DataStructuresTheme {
        MyGreeting(number = 30)
    }
}
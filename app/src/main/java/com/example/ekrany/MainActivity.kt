package com.example.ekrany

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var navController = rememberNavController()
            NavHost(navController = navController, startDestination = "one"){
                composable("one"){ Ekran1(nav = {navController.navigate("two")} ) }
                composable("two"){ Ekran2(nav = {navController.navigate("three")}) }
                composable("three"){ Ekran3(nav = {navController.navigate("four")}) }
                composable("four"){ Ekran3(nav = {navController.navigate("one")}) }
            }
        }
    }
}
@Composable
fun Ekran1(nav:()->Unit){
    Column{
        Text("Лента")
        Button(onClick = nav) {}
    }
}
@Composable
fun Ekran2(nav:()->Unit){
    Column{
        Text("Чаты")
        Button(onClick = nav) {}
    }
}
@Composable
fun Ekran3(nav:()->Unit){
    Column{
        Text("Поиск")
        Button(onClick = nav) {}
    }
}
@Composable
fun Ekran4(nav:()->Unit){
    Column{
        Text("sfefw")
        Button(onClick = nav) {}
    }
}


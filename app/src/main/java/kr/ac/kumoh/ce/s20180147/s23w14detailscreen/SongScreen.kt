package kr.ac.kumoh.ce.s20180147.s23w14detailscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

enum class SongScreen {
    List,
    Detail
}

@Composable
fun SongApp(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = SongScreen.List.name
    ){
        composable(SongScreen.List.name){
            SongList(navController)
        }
        composable(SongScreen.Detail.name){
            SongDetail(navController)
        }
    }
}

@Composable
fun SongDetail(navController: NavController) {
    Button(onClick = {
        navController.navigate(SongScreen.List.name)
    }) {
        Text("노래 내용")
    }
}

@Composable
fun SongList(navController: NavController) {
    Column {
        Button(onClick = {
            navController.navigate(SongScreen.Detail.name)
        }) {
            Text("노래 1")
        }
        Button(onClick = {
            navController.navigate(SongScreen.Detail.name)
        }) {
            Text("노래 2")
        }
    }
}

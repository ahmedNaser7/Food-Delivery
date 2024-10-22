package com.example.foodDelivery.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodDelivery.R
import com.example.foodDelivery.ui.theme.Green40


@Composable
fun RegisterScreen(){
   Box(
       modifier = Modifier
           .fillMaxSize()
           .background(color = Color.White)
   ){
       Image(
           modifier = Modifier
               .fillMaxSize()
               .padding(bottom = 430.dp),
           painter = painterResource(id = R.drawable.background),
           contentDescription = "background"
       )
       Image(
           modifier = Modifier
               .fillMaxSize()
               .padding(bottom = 280.dp),
           painter = painterResource(id = R.drawable.gradient),
           contentDescription = "background"
       )
       Column(
           modifier = Modifier
               .fillMaxSize()
               .padding(top = 40.dp)
       ){
           Image(
               modifier = Modifier
                   .fillMaxWidth()
                   .size(170.dp),
               painter = painterResource(id = R.drawable.logo),
               contentDescription = "background"
           )
           Text(
               modifier = Modifier.align(Alignment.CenterHorizontally),
               fontSize = 40.sp,
               fontWeight = FontWeight.Bold,
               color = Green40,
               text = "Food Ninja"
           )
           Text(
               modifier = Modifier.padding(top = 1.dp).align(Alignment.CenterHorizontally),
               fontSize = 15.sp,
               fontWeight = FontWeight.Bold,
               color = Color.Black,
               text = "Deliever Favorite Food"
           )
           Text(
               modifier = Modifier.padding(top = 30.dp).align(Alignment.CenterHorizontally),
               fontSize = 20.sp,
               fontWeight = FontWeight.Bold,
               color = Color.Black,
               text = "Sign Up For Free"
           )
       }
   }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview(){
    RegisterScreen()
}
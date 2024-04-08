package com.example.liam

import android.content.Intent
import android.graphics.drawable.shapes.RoundRectShape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class WoofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Woof()
        }
    }
}

@Composable
fun Woof(){

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ) {
        val mContext = LocalContext.current

        Spacer(modifier = Modifier.height(10.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Row(

            ){
                Image(painter = painterResource(id = R.drawable.paw),
                    contentDescription ="logo",
                    modifier = Modifier
                        .size(width = 50.dp, height = 55.dp)
                        .size(100.dp)
                        .clip(shape = CircleShape)

                )

                Spacer(modifier =Modifier.width(5.dp))


                Column {
                    Text(
                        text="Woof",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 40.sp,
                        fontFamily = FontFamily.Serif,
                    )

                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        //CARD 1
        Card (
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
                .fillMaxWidth()
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    modifier = Modifier.padding(start = 10.dp),
                ) {
                    Image(painter = painterResource(id = R.drawable.dog1),
                        contentDescription ="dog",
                        modifier = Modifier
                            .size(width = 50.dp, height = 50.dp)
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop

                    )

                    Spacer(modifier =Modifier.width(10.dp))

                    Column {
                        Text(text="Koda", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                        Text(text= "2 years old")
                    }
                }
            }
        }
        //END OF CARD 1
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 2
        Card (
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
                .fillMaxWidth()
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    modifier = Modifier.padding(start = 10.dp),
                ) {
                    Image(painter = painterResource(id = R.drawable.dog2),
                        contentDescription ="dog",
                        modifier = Modifier
                            .size(width = 50.dp, height = 50.dp)
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop

                    )

                    Spacer(modifier =Modifier.width(10.dp))

                    Column {
                        Text(text="Lola", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                        Text(text= "16 years old")
                    }
                }
            }
        }
        //END OF CARD 2
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 3
        Card (
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
                .fillMaxWidth()
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    modifier = Modifier.padding(start = 10.dp),
                ) {
                    Image(painter = painterResource(id = R.drawable.dog3),
                        contentDescription ="dog",
                        modifier = Modifier
                            .size(width = 50.dp, height = 50.dp)
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop

                    )

                    Spacer(modifier =Modifier.width(10.dp))

                    Column {
                        Text(text="Frankie", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                        Text(text= "2 years old")
                    }
                }
            }
        }
        //END OF CARD 3
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 4
        Card (
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
                .fillMaxWidth()
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    modifier = Modifier.padding(start = 10.dp),
                ) {
                    Image(painter = painterResource(id = R.drawable.dog4),
                        contentDescription ="dog",
                        modifier = Modifier
                            .size(width = 50.dp, height = 50.dp)
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop

                    )

                    Spacer(modifier =Modifier.width(10.dp))

                    Column {
                        Text(text="Nox", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                        Text(text= "8 years old")
                    }
                }
            }
        }
        //END OF CARD 4
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 5
        Card (
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
                .fillMaxWidth()
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    modifier = Modifier.padding(start = 10.dp),
                ) {
                    Image(painter = painterResource(id = R.drawable.dog5),
                        contentDescription ="dog",
                        modifier = Modifier
                            .size(width = 50.dp, height = 50.dp)
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop

                    )

                    Spacer(modifier =Modifier.width(10.dp))

                    Column {
                        Text(text="Faye", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                        Text(text= "8 years old")
                    }
                }
            }
        }
        //END OF CARD 5
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 6
        Card (
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
                .fillMaxWidth()
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    modifier = Modifier.padding(start = 10.dp),
                ) {
                    Image(painter = painterResource(id = R.drawable.dog6),
                        contentDescription ="dog",
                        modifier = Modifier
                            .size(width = 50.dp, height = 50.dp)
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop

                    )

                    Spacer(modifier =Modifier.width(10.dp))

                    Column {
                        Text(text="Bella", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                        Text(text= "14 years old")
                    }
                }
            }
        }
        //END OF CARD 6
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 7
        Card (
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
                .fillMaxWidth()
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    modifier = Modifier.padding(start = 10.dp),
                ) {
                    Image(painter = painterResource(id = R.drawable.dog7),
                        contentDescription ="dog",
                        modifier = Modifier
                            .size(width = 50.dp, height = 50.dp)
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop

                    )

                    Spacer(modifier =Modifier.width(10.dp))

                    Column {
                        Text(text="Moana", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                        Text(text= "2 years old")
                    }
                }
            }
        }
        //END OF CARD 7
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 8
        Card (
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
                .fillMaxWidth()
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    modifier = Modifier.padding(start = 10.dp),
                ) {
                    Image(painter = painterResource(id = R.drawable.dog8),
                        contentDescription ="dog",
                        modifier = Modifier
                            .size(width = 50.dp, height = 50.dp)
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop

                    )

                    Spacer(modifier =Modifier.width(10.dp))

                    Column {
                        Text(text="Tzeitel", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                        Text(text= "7 years old")
                    }
                }
            }
        }
        //END OF CARD 8
        Spacer(modifier =Modifier.height(10.dp))


        Spacer(modifier =Modifier.height(10.dp))

        Button(onClick = { mContext.startActivity(Intent(mContext,DestinationActivity::class.java)) },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),) {
            Text(text = "Next")

        }
    }

}

@Preview(showBackground = true)
@Composable
fun WoofPreview() {
    Woof()
}
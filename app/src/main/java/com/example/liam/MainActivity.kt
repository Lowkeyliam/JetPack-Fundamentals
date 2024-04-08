package com.example.liam

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){
   Column (modifier = Modifier
       .fillMaxSize()
       .verticalScroll(rememberScrollState()),
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Center
       ) {
       val mContext = LocalContext.current

       Text(
           text = "Welcome to Android",
           fontSize = 30.sp,
           color = Color.Blue,
           fontWeight = FontWeight.Bold,
           fontStyle = FontStyle.Italic,
           textDecoration = TextDecoration.Underline
       )
       Text(text = "Android development is taught for the purpose of creating applications that can run in or android devices")

       //LottieAnimation
       val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.welcome))
       val progress by animateLottieCompositionAsState(composition)
       LottieAnimation(composition, progress,
           modifier = Modifier.size(300.dp)
       )
       //End of Lottie animation

       Spacer(modifier = Modifier.height(20.dp))
       Text(
           text = "Types of cars",
           fontSize = 20.sp,
           modifier = Modifier
               .fillMaxWidth()
               .background(Color.Cyan)
               .height(30.dp) ,
           textAlign = TextAlign.Center,
           fontWeight = FontWeight.Bold,
           color = Color.Black
       )
       Text(text = "1. Subaru")
       Text(text = "2. Mercedes Benz")
       Text(text = "3. Audi")
       Text(text = "4. Toyota")

       Spacer(modifier = Modifier.height(20.dp))
       Text(
           text = "Types of bikes",
           fontSize = 20.sp,
           modifier = Modifier
               .fillMaxWidth()
               .background(Color.Cyan)
               .height(30.dp) ,
           textAlign = TextAlign.Center,
           fontWeight = FontWeight.Bold,
           color = Color.Black,
           fontStyle = FontStyle.Italic
       )
       Text(text = "1. Suzuki")
       Text(text = "2. Yamaha")
       Text(text = "3. Honda")
       Text(text = "4. Ducatti")
       Column (modifier = Modifier.fillMaxWidth(),
           horizontalAlignment = Alignment.CenterHorizontally) {
           Button(onClick = {
               mContext.startActivity(Intent(mContext,DestinationActivity::class.java))

           },
               shape = RoundedCornerShape(5.dp),
               colors = ButtonDefaults.buttonColors(Color.Cyan),) {
               Text(text = "Destination",
                   color = Color.Black)
           }
       }
       Spacer(modifier = Modifier.height(10.dp))

       Divider()

       Spacer(modifier = Modifier.height(10.dp))
       Text(text = "eMobilis Mobile Training Institute", 
           fontSize = 20.sp,
           fontWeight = FontWeight.Bold
           )
   Box(modifier = Modifier.fillMaxWidth(),
       contentAlignment = Alignment.Center) {
       Image(
           painter = painterResource(id = R.drawable.back),
           contentDescription = "car",
           modifier = Modifier
               .size(200.dp)
               .clip(shape = CircleShape),
           contentScale = ContentScale.Crop
       )
   }
       Button(onClick = {
                        mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
       },
           shape = RoundedCornerShape(5.dp),
           colors = ButtonDefaults.buttonColors(Color.Cyan),
           modifier = Modifier
               .fillMaxWidth()
               .padding(start = 30.dp, end = 30.dp)
           ) {
           Text(text = "Continue",
               color = Color.Black
           )
       }

       Button(onClick = {
           mContext.startActivity(Intent(mContext,LottieActivity::class.java))
       },
           shape = RoundedCornerShape(5.dp),
           colors = ButtonDefaults.buttonColors(Color.Cyan),
           modifier = Modifier
               .fillMaxWidth()
               .padding(start = 30.dp, end = 30.dp)
       ) {
           Text(text = "Contact Us",
               color = Color.Black
           )
       }

   }
}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}
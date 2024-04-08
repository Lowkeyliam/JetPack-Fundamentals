package com.example.liam

import android.content.Intent
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.liam.ui.theme.LiamTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column (modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(
            title = { Text(text = "HomeScreen",
                color = Color.Black
                ) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.Black)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.Black)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.Black)
                }
            }
        )
        //End of TopAppBar

        Text(
            text = "Destinations",
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Cursive
        )

        //FirstRow
        Row {
            Image(
                painter = painterResource(id = R.drawable.london),
                contentDescription = "London",
                modifier = Modifier.size(width = 200.dp, height = 145.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "LONDON", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                Text(text = "Located at the north end of the Palace of Westminster in London, Big Ben is known for its majestic clock face and melodious chimes. This iconic clock tower is a symbol of British heritage ")
            }

            Spacer(modifier = Modifier.height(10.dp))
        }
        //End of Row1

        //SecondRow
        Row {
            Image(
                painter = painterResource(id = R.drawable.dubai),
                contentDescription = "Dubai",
                modifier = Modifier.size(width = 200.dp, height = 145.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "DUBAI", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                Text(text = "The Burj Khalifa in Dubai, United Arab Emirates, is the world’s tallest skyscraper, soaring to dizzying heights of over 2,700 feet.")
            }

            Spacer(modifier = Modifier.height(10.dp))
        }
        //End of Row2

        //ThirdRow
        Row {
            Image(
                painter = painterResource(id = R.drawable.maldives),
                contentDescription = "Maldives",
                modifier = Modifier.size(width = 200.dp, height = 145.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "MALDIVES", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                Text(text = "Topping the global list is the enchanting paradise of the Maldives in the Indian Ocean. As Paton describes, With its overwater bungalows, crystal-clear waters and vibrant marine life.")
            }

            Spacer(modifier = Modifier.height(10.dp))
        }
        //End of Row3

        Column (modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                mContext.startActivity(Intent(mContext,IntentActivity::class.java))
            },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Cyan),) {
                Text(text = "Next",
                    color = Color.Black)
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}
package com.example.activity3_composablelayout2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable

fun ActivitasPertama(modifier: Modifier){
    Column(modifier = Modifier.padding(top=100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text( stringResource( R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)
        Text( stringResource( R.string.univ),
            fontSize = 22.sp)
        Spacer(modifier = Modifier.height(25.dp))
        Card (modifier = Modifier
            .fillMaxWidth(1f)
            .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )) {
            Row(){
                val gambar = painterResource(R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = modifier.size(100.dp).padding(5.dp)
                )
                Spacer(modifier = modifier.width(30.dp))
                Column(){
                    Text(
                        stringResource(R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top=15.dp)
                    )
                    Text(
                        stringResource(R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow
                    )

                }
            }
        }
        Card (modifier = Modifier
            .fillMaxWidth(1f)
            .padding(horizontal = 12.dp, vertical = 6.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF0000FF) // Warna Biru Penuh (Blue)
            )){
            Row() {
                val gambar = painterResource(R.drawable.logo_umy) // Pastikan R.drawable.logo_umy ada
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = modifier.size(100.dp).padding(5.dp)
                )
                Spacer(modifier = modifier.width(30.dp))
                Column() {
                    Text(
                        stringResource(R.string.nama1),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top=15.dp)
                    )
                    Text(
                        stringResource(R.string.umur1),
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(top=10.dp)
                    )
                    Text(
                        stringResource(R.string.hobi1),
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(top=5.dp)
                    )
                }
            }
        }
        Card (modifier = Modifier
            .fillMaxWidth(1f)
            .padding(horizontal = 12.dp, vertical = 6.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF008000) // Warna Hijau Gelap (Green)
            )){
            Row() {
                val gambar = painterResource(R.drawable.logo_umy) // Pastikan R.drawable.logo_umy ada
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = modifier.size(100.dp).padding(5.dp)
                )
                Spacer(modifier = modifier.width(30.dp))
                Column() {
                    Text(
                        stringResource(R.string.nama2),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top=15.dp)
                    )
                    Text(
                        stringResource(R.string.umur2),
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(top=10.dp)
                    )
                    Text(
                        stringResource(R.string.hobi2),
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(top=5.dp)
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
        ){
            Text(
                stringResource(R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 60.dp)
            )
        }
    }
}
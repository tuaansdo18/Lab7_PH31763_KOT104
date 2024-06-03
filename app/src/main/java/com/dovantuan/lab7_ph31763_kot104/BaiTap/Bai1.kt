package com.dovantuan.lab7_ph31763_kot104.BaiTap

import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import com.dovantuan.lab7_ph31763_kot104.MainViewModel
import com.dovantuan.lab7_ph31763_kot104.ui.screens.MovieScreen

@Composable
fun Bai1(){
    val mainViewModel = MainViewModel()
    val moviesState = mainViewModel.movies.observeAsState(initial = emptyList())
    MovieScreen(movies = moviesState.value)
}
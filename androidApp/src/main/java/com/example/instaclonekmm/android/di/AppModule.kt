package com.example.instaclonekmm.android.di

import com.example.instaclonekmm.android.auth.login.LoginViewModel
import com.example.instaclonekmm.android.auth.signup.SignUpViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { LoginViewModel() }
    viewModel { SignUpViewModel() }
}
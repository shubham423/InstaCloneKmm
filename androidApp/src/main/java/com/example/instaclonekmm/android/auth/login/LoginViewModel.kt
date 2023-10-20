package com.example.instaclonekmm.android.auth.login

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class LoginViewModel: ViewModel() {
    var uiState by mutableStateOf(LoginUiState())
        private set

    fun updateEmail(input: String){
        uiState = uiState.copy(email = input)
    }

    fun updatePassword(input: String){
        uiState = uiState.copy(password = input)
    }
}

data class LoginUiState(
    var email: String = "",
    var password: String = ""
)
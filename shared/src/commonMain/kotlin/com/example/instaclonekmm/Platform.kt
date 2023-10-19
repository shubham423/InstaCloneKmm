package com.example.instaclonekmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
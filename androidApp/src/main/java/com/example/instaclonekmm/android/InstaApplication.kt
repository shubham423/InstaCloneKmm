package com.example.instaclonekmm.android

import android.app.Application
import com.example.instaclonekmm.android.di.appModule
import org.koin.core.context.GlobalContext.startKoin

class InstaApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule)
        }
    }
}
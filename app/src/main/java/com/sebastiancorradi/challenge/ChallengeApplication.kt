package com.sebastiancorradi.challenge

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ChallengeApplication: Application() {
    companion object {
        private var instance: ChallengeApplication? = null

        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        // Setup singleton instance
        instance = this
    }
}
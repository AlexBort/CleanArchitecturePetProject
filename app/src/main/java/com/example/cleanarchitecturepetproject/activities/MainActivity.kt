package com.example.cleanarchitecturepetproject.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cleanarchitecturepetproject.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * app module is different from the data and domain in that it has AndroidManifest. So every app begin to launch from
         * Manifest. So only app module can be launched and built independently
         */

        /**
         *
         */
    }
}
package com.bitfitprivatelimited.LifecycleAwareSample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created on Android Studio
 * Author: Umesh
 * DATE: 12/13/2018
 * TIME :3:56 PM.
 * DAY: Thursday
 * Project: LifeCycleSample
 */
class DemoActivity : AppCompatActivity() {
    val TAG = "DemoActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        lifecycle.addObserver(MyLifeCycleObserver())
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy")
    }
}

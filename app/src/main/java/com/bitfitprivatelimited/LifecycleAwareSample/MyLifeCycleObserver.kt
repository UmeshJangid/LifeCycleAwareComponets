package com.bitfitprivatelimited.LifecycleAwareSample

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

/**
 * Created on Android Studio
 * Author: Umesh
 * DATE: 12/13/2018
 * TIME :3:56 PM.
 * DAY: Thursday
 * Project: LifeCycleSample
 */
class MyLifeCycleObserver : LifecycleObserver {
    var TAG = "MyLifeCycleObserver"
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateObserver() {
        Log.e(TAG, "onCreateObserver")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStartObserver() {
        Log.e(TAG, "onStartObserver")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeObserver() {
        Log.e(TAG, "onResumeObserver")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPauseObserver() {
        Log.e(TAG, "onPauseObserver")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopObserver() {
        Log.e(TAG, "onStopObserver")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyObserver() {
        Log.e(TAG, "onDestroyObserver")
    }
}
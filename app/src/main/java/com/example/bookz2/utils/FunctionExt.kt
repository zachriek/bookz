package com.example.bookz2.utils

import android.os.CountDownTimer

fun setTimer(
    timer: Long,
    interval: Long,
    onTick: ((Long) -> Unit)? = null,
    onFinish: (() -> Unit)? = null
) = object : CountDownTimer(timer, interval){
    override fun onTick(time: Long) {
        onTick?.invoke(time / interval)
    }
    override fun onFinish() {
        onFinish?.invoke()
    }
}
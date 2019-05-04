package com.example.chessclock

import android.os.Bundle
import android.os.SystemClock
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class ClockActivity : AppCompatActivity(), ClockPresenter.ClockPresenterView {

    private val presenter by lazy { ClockPresenter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playerOneChrono.setOnClickListener { presenter.onChrono1Tap() }
        playerTwoChrono.setOnClickListener { presenter.onChrono2Tap() }
        playerOneChrono.base = SystemClock.elapsedRealtime() + (2* 60000 + 0 * 1000)
        playerTwoChrono.base = SystemClock.elapsedRealtime() + (2* 60000 + 0 * 1000)
    }

    override fun stopChrono1() {
        playerOneChrono.stop()
    }

    override fun stopChrono2() {
        playerTwoChrono.stop()
    }

    override fun resumeChrono1() {
        playerOneChrono.start()
    }

    override fun resumeChrono2() {
        playerTwoChrono.start()
    }
}

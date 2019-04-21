package com.example.chessclock

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class ClockActivity : AppCompatActivity(), ClockPresenter.ClockPresenterView {

    val presenter by lazy { ClockPresenter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playerOneChrono.setOnClickListener { presenter.onChrono1Tap() }
        playerTwoChrono.setOnClickListener { presenter.onChrono2Tap() }
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

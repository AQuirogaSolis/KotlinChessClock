package com.example.chessclock

class ClockPresenter(private val view: ClockPresenterView) {

    fun onChrono1Tap() {
        view.stopChrono1()
        view.resumeChrono2()
    }

    fun onChrono2Tap() {
        view.stopChrono2()
        view.resumeChrono1()
    }

    interface ClockPresenterView {
        fun stopChrono1()
        fun stopChrono2()
        fun resumeChrono1()
        fun resumeChrono2()
    }
}

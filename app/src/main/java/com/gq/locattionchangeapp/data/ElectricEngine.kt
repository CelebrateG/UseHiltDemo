package com.gq.locattionchangeapp.data

import javax.inject.Inject

class ElectricEngine @Inject constructor() : Engine {
    override fun start() {
        println("electric engine start.")
    }

    override fun shoutDown() {
        println("electric engine shout down.")
    }
}
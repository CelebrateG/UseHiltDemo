package com.gq.locattionchangeapp.data

import javax.inject.Inject

class GasEngine @Inject constructor() : Engine {
    override fun start() {
        println("Gas engine start.")
    }

    override fun shoutDown() {
        println("Gas engine shoutDown.")
    }
}
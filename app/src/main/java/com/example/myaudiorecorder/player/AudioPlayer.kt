package com.example.myaudiorecorder.player

import java.io.File

interface AudioPlayer {
    fun playFile(file: File)
    fun stop()
}
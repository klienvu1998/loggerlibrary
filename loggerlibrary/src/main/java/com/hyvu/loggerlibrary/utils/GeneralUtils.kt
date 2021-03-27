package com.hyvu.loggerlibrary.utils

import com.hyvu.loggerlibrary.Logger
import java.text.SimpleDateFormat

class GeneralUtils {
    companion object {
        val simpleDateTimeFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd")

        fun logLevel(logType: Int): String {
            when (logType) {
                Logger.DEBUG -> {
                    return "DEBUG"
                }
                Logger.ASSERT -> {
                    return "ASSERT"
                }
                Logger.ERROR -> {
                    return "ERROR"
                }
                Logger.INFO -> {
                    return "INFO"
                }
                Logger.VERBOSE -> {
                    return "VERBOSE"
                }
                Logger.WARN -> {
                    return "WARN"
                }
            }
            return "UNKNOWN"
        }
    }
}
package com.hyvu.loggerlibrary

import com.hyvu.loggerlibrary.utils.GeneralUtils
import java.io.PrintWriter
import java.io.StringWriter

class LoggerUtils {
    fun generateMessage(logType: Int, message: String, throwable: Throwable?): String {
        val messageBuilder = StringBuilder()
        val timeInMillis = System.currentTimeMillis()
        messageBuilder.append("${GeneralUtils.simpleDateTimeFormat.format(timeInMillis)} || ")
        messageBuilder.append("${GeneralUtils.logLevel(logType)} || ")
        val currentThread = Thread.currentThread()
        messageBuilder.append("${currentThread.id} || ")
        messageBuilder.append("$message || ")
        messageBuilder.append(convertThrowableToString(throwable))
        return messageBuilder.toString()
    }

    private fun convertThrowableToString(throwable: Throwable?): String {
        if (throwable != null) {
            val sw = StringWriter()
            val pw = PrintWriter(sw)
            throwable?.printStackTrace(pw)
            return sw.toString()
        }
        return ""
    }
}
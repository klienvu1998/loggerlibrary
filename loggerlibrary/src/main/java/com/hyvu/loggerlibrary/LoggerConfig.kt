package com.hyvu.loggerlibrary

import android.Manifest
import android.content.Context
import android.util.Log
import androidx.core.app.ActivityCompat
import com.hyvu.loggerlibrary.utils.StorageUtils

class LoggerConfig {

    private var context: Context? = null
    private var isExportConsole: Boolean = true
    private var isExportTxt: Boolean = false
    private var storageUtils: StorageUtils? = null
    private val loggerUtils = LoggerUtils()

    constructor(context: Context?) {
        this.context = context
        storageUtils = StorageUtils(context)
    }

    private constructor(context: Context?, builder: Builder) {
        this.isExportConsole = builder.isExportConsole
        this.isExportTxt = builder.isExportTxt
        this.context = context
        storageUtils = StorageUtils(context)
    }

    @Synchronized
    fun log(logType: Int, message: String, throwable: Throwable?) {
        val messageGenerated = loggerUtils.generateMessage(logType, message, throwable)
        val stackClassCalledLog = Thread.currentThread().stackTrace[6]
        val method = "${stackClassCalledLog.fileName}:${stackClassCalledLog.lineNumber}"
        if (isExportConsole) {
            Log.println(logType, method, messageGenerated)
        }
        if (isExportTxt) {
            val messageTxt = "$method: $messageGenerated"
            storageUtils?.writeToTxtFile(messageTxt)
        }
    }

    companion object {

        fun newBuilder(context: Context?): Builder {
            return Builder(context)
        }

        class Builder(var context: Context?) {
            var isExportTxt: Boolean = false
            var isExportConsole: Boolean = true

            fun setExportTxt(isSupportTxt: Boolean): Builder {
                this.isExportTxt = isSupportTxt
                return this
            }

            fun setExportConsole(isSupportConsole: Boolean): Builder {
                this.isExportConsole = isSupportConsole
                return this
            }

            fun build(): LoggerConfig {
                return LoggerConfig(context, this)
            }
        }
    }

}
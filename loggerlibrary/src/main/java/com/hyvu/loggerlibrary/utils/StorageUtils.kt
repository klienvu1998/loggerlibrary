package com.hyvu.loggerlibrary.utils

import android.content.Context
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStreamWriter
import java.lang.Exception

class StorageUtils {

    private var context: Context? = null

    companion object {
        const val LOGGER_DIR_NAME = "LoggerOutput"
    }

    constructor(context: Context?) {
        this.context = context
    }

    fun getBaseAppStoragePath(): String {
        return context?.getExternalFilesDir(null)?.absolutePath ?: ""
    }

    fun writeToTxtFile(message: String) {
        try {
            var file = File(getBaseAppStoragePath(), LOGGER_DIR_NAME)
            if (!file.exists()) {
                file.mkdir()
            }
            file = File(file, "${GeneralUtils.simpleDateFormat.format(System.currentTimeMillis())}.txt")
            if (!file.exists()) {
                file.createNewFile()
            }
            val writer: FileOutputStream? = FileOutputStream(file, true)
            val outputStream = OutputStreamWriter(writer)
            if (writer != null) {
                val data = message + "\n"
                outputStream.append(data)
                outputStream.close()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
package com.hyvu.loggerlibrary

class Logger {

    companion object {

        const val ASSERT = 7
        const val DEBUG = 3
        const val ERROR = 6
        const val INFO = 4
        const val VERBOSE = 2
        const val WARN = 5

        private val baseLogger = BaseLogger()

        fun setDisableAllLog(isHide: Boolean) {
            baseLogger.setHideAllLog(isHide)
        }

        fun setConfig(loggerConfig: LoggerConfig) {
            baseLogger.setConfig(loggerConfig)
        }

        fun d(message: String) {
            baseLogger.d(message)
        }

        fun d(message: String, throwable: Throwable?) {
            baseLogger.d(message, throwable)
        }

        fun e(message: String) {
            baseLogger.e(message)
        }

        fun e(message: String, throwable: Throwable?) {
            baseLogger.e(message, throwable)
        }

        fun w(message: String) {
            baseLogger.w(message)
        }

        fun w(message: String, throwable: Throwable?) {
            baseLogger.w(message, throwable)
        }

        fun i(message: String) {
            baseLogger.i(message)
        }

        fun i(message: String, throwable: Throwable?) {
            baseLogger.i(message, throwable)
        }

        fun v(message: String) {
            baseLogger.v(message)
        }

        fun v(message: String, throwable: Throwable?) {
            baseLogger.v(message, throwable)
        }

        fun wtf(message: String) {
            baseLogger.wtf(message)
        }

        fun wtf(throwable: Throwable?) {
            baseLogger.wtf(throwable)
        }

        fun wtf(message: String, throwable: Throwable?) {
            baseLogger.wtf(message, throwable)
        }

    }
}
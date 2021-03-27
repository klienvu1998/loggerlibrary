package com.hyvu.loggerlibrary


class BaseLogger: BaseLoggerInterface {

    private var loggerConfig: LoggerConfig? = null
    private var isHideLog = false

    fun setHideAllLog(isHideLog: Boolean) {
        this.isHideLog = isHideLog
    }

    fun setConfig(loggerConfig: LoggerConfig) {
        this.loggerConfig = loggerConfig
    }

    override fun d(message: String) {
        log(Logger.DEBUG, message, null)
    }

    override fun d(message: String, throwable: Throwable?) {
        log(Logger.DEBUG, message, throwable)
    }

    override fun e(message: String) {
        log(Logger.ERROR, message, null)
    }

    override fun e(message: String, throwable: Throwable?) {
        log(Logger.ERROR, message, throwable)
    }

    override fun w(message: String) {
        log(Logger.WARN, message, null)
    }

    override fun w(message: String, throwable: Throwable?) {
        log(Logger.WARN, message, throwable)
    }

    override fun i(message: String) {
        log(Logger.INFO, message, null)
    }

    override fun i(message: String, throwable: Throwable?) {
        log(Logger.INFO, message, throwable)
    }

    override fun v(message: String) {
        log(Logger.VERBOSE, message, null)
    }

    override fun v(message: String, throwable: Throwable?) {
        log(Logger.VERBOSE, message, throwable)
    }

    override fun wtf(message: String) {
        log(Logger.ASSERT, message, null)
    }

    override fun wtf(throwable: Throwable?) {
        log(Logger.ASSERT, "", throwable)
    }

    override fun wtf(message: String, throwable: Throwable?) {
        log(Logger.ASSERT, message, throwable)
    }

    override fun log(logType: Int, message: String, throwable: Throwable?) {
        if (!isHideLog) {
            loggerConfig?.log(logType, message, throwable)
        }
    }
}
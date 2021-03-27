package com.hyvu.loggerlibrary

interface BaseLoggerInterface {
    fun d(message: String)
    fun d(message: String, throwable: Throwable?)
    fun e(message: String)
    fun e(message: String, throwable: Throwable?)
    fun w(message: String)
    fun w(message: String, throwable: Throwable?)
    fun i(message: String)
    fun i(message: String, throwable: Throwable?)
    fun v(message: String)
    fun v(message: String, throwable: Throwable?)
    fun wtf(message: String)
    fun wtf(message: String, throwable: Throwable?)
    fun wtf(throwable: Throwable?)
    fun log(logType: Int, message: String, throwable: Throwable?)
}
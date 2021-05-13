package com.khoazero123.ocr.analytics

interface CrashLogger {

    fun logException(exception: Exception)

    fun logMessage(message: String)

    fun setString(tag: String, value: String)

    fun setLong(tag: String, value: Long)

}
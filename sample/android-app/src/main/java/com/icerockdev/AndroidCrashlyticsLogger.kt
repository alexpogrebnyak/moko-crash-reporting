package com.icerockdev

import dev.icerock.moko.crashReporting.CrashlyticsLogger

class AndroidCrashlyticsLogger: CrashlyticsLogger {
    override fun setUserId(userId: String) {
        TODO("Not yet implemented")
    }

    override fun setCustomValue(value: String, forKey: String) {
        TODO("Not yet implemented")
    }

    override fun log(message: String) {
        TODO("Not yet implemented")
    }

    override fun recordException(name: String, message: String, stackTrace: List<Long>) {
        TODO("Not yet implemented")
    }
}
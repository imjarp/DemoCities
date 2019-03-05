package demo.swapkeyboard.swap.com.demoapp.base

import java.lang.IllegalStateException

class Result<T : Any?>(val result: T, val error: Error?) {

    init {
        if (result == null && error == null) throw IllegalStateException("Result must have either result or error")
    }

    fun hasFailed() = error == null

    fun isSuccess() = !hasFailed()
}
package demo.swapkeyboard.swap.com.demoapp.base

import org.junit.Assert.*
import org.junit.Test
import java.lang.IllegalStateException
import demo.swapkeyboard.swap.com.demoapp.base.Result

class ResultTest {

    @Test(expected = IllegalStateException::class)
    fun whenResultIsNullThrowsError() {
        Result(null, null)
    }

    @Test
    fun whenResultIsValidDoNotFail() {
        Result(Any(), null)
        Result(null, demo.swapkeyboard.swap.com.demoapp.base.Error(Error.INTERNAL_ERROR, "Error"))
    }

}
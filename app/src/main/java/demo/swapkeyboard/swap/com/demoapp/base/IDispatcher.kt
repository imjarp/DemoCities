package demo.swapkeyboard.swap.com.demoapp.base

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.MainCoroutineDispatcher

interface IDispatcher {
    fun getUIDispatcher(): MainCoroutineDispatcher
    fun getIODispatcher(): CoroutineDispatcher
}
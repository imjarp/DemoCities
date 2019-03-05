package demo.swapkeyboard.swap.com.demoapp.base

import kotlinx.coroutines.Dispatchers

class DispatcherApp : IDispatcher {

    override fun getUIDispatcher() = Dispatchers.Main

    override fun getIODispatcher() = Dispatchers.IO
}
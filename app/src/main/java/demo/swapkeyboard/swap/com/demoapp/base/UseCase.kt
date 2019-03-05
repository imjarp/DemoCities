package demo.swapkeyboard.swap.com.demoapp.base

abstract class UseCase<out Result, in Params>(dispatcherApp: IDispatcher) : BaseScope(dispatcherApp) {
    abstract fun execute(params: Params, onResult: (Result) -> Unit)
}
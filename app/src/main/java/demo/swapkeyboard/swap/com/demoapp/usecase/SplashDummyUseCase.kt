package demo.swapkeyboard.swap.com.demoapp.usecase

import demo.swapkeyboard.swap.com.demoapp.base.IDispatcher
import demo.swapkeyboard.swap.com.demoapp.base.Result
import demo.swapkeyboard.swap.com.demoapp.base.UseCase
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SplashDummyUseCase(dispatcherApp: IDispatcher) : UseCase<Result<Boolean>, Unit>(dispatcherApp) {

    /**
     *   Dummy method just to init some values in the app
     **/
    override fun execute(params: Unit, onResult: (Result<Boolean>) -> Unit) {

        launch(dispatcherApp.getIODispatcher()) {
            Thread.sleep(3_000)
            withContext(context = dispatcherApp.getUIDispatcher()) {
                onResult.invoke(Result(true, null))
            }
        }
    }
}
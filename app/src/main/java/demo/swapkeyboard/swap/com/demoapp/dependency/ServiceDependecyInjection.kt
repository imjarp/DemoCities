package demo.swapkeyboard.swap.com.demoapp.dependency

import demo.swapkeyboard.swap.com.demoapp.base.DispatcherApp
import demo.swapkeyboard.swap.com.demoapp.base.IDispatcher
import org.koin.dsl.module.module

val appModule = module {
    single { DispatcherApp() as IDispatcher }
}
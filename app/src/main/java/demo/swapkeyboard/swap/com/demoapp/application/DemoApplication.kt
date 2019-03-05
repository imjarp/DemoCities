package demo.swapkeyboard.swap.com.demoapp.application

import android.app.Application
import demo.swapkeyboard.swap.com.demoapp.dependency.appModule
import org.koin.android.ext.android.startKoin

class DemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(appModule))
    }
}
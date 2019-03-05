package demo.swapkeyboard.swap.com.demoapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import demo.swapkeyboard.swap.com.demoapp.base.IDispatcher
import demo.swapkeyboard.swap.com.demoapp.usecase.SplashDummyUseCase
import org.koin.android.ext.android.inject

class SplashActivity : AppCompatActivity() {


    private val iDispatcher: IDispatcher by inject()
    private lateinit var useCase: SplashDummyUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        useCase = SplashDummyUseCase(iDispatcher)
        lifecycle.addObserver(useCase)

    }

    override fun onResume() {
        super.onResume()
        useCase.execute(Unit) {
            MainActivity.startActivity(this@SplashActivity)
        }
    }

    override fun onPause() {
        super.onPause()
        lifecycle.removeObserver(useCase)
    }
}

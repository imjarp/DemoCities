package demo.swapkeyboard.swap.com.demoapp.base

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

open class BaseScope(protected val dispatcherApp: IDispatcher) : CoroutineScope, LifecycleObserver {

    private lateinit var job: Job

    override val coroutineContext: CoroutineContext
        get() = job + dispatcherApp.getUIDispatcher()

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun startJobCreating() {
        job = Job()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun destroyJob() {
        job.cancel()
    }
}
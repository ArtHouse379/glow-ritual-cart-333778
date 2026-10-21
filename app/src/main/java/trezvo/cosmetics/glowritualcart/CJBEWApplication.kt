package trezvo.cosmetics.glowritualcart

import android.app.Application
import trezvo.cosmetics.glowritualcart.di.dataModule
import trezvo.cosmetics.glowritualcart.di.dispatcherModule
import trezvo.cosmetics.glowritualcart.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class CJBEWApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@CJBEWApplication)
            modules(appModules)
        }
    }
}

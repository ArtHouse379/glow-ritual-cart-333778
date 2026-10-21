package trezvo.cosmetics.glowritualcart.di

import trezvo.cosmetics.glowritualcart.data.datastore.OnboardingDataStoreManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataStoreModule = module {
    single { OnboardingDataStoreManager(androidContext()) }
}
package dev.goodwy.rphone

import dev.goodwy.rphone.controller.PlayStoreViewModel
import dev.goodwy.rphone.controller.PurchaseHelper
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {
    includes(commonModule)
    single<PurchaseHelper> {
        PlayStoreViewModel(androidApplication(), get())
    }
}

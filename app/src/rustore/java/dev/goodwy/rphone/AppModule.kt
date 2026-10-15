package dev.goodwy.rphone

import dev.goodwy.rphone.controller.PurchaseHelper
import dev.goodwy.rphone.controller.RuStoreViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {
    includes(commonModule)
    single<PurchaseHelper> {
        RuStoreViewModel(androidApplication(), get())
    }
}

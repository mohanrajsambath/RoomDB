package com.roomsamples

import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val db = module{
    single{WordRoomDatabase.getDatabase(androidContext(),get())}
    factory{get<WordRoomDatabase>().wordDao()}
}
val respository = module{
    single{WordRepository(get())}
}
val viewModules= module{
    viewModel { WordViewModel(get()) }
    factory{WordListAdapter(androidContext())}
}


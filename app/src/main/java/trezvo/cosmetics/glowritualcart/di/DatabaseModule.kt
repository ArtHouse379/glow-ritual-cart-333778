package trezvo.cosmetics.glowritualcart.di

import androidx.room.Room
import trezvo.cosmetics.glowritualcart.data.database.CJBEWAppDatabase
import org.koin.dsl.module

private const val DB_NAME = "cjbew_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = CJBEWAppDatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<CJBEWAppDatabase>().cartItemDao() }

    single { get<CJBEWAppDatabase>().orderDao() }
}
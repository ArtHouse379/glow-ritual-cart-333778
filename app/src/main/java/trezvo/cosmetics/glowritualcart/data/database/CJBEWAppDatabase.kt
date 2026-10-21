package trezvo.cosmetics.glowritualcart.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import trezvo.cosmetics.glowritualcart.data.database.dao.CartItemDao
import trezvo.cosmetics.glowritualcart.data.database.dao.OrderDao
import trezvo.cosmetics.glowritualcart.data.database.converter.Converters
import trezvo.cosmetics.glowritualcart.data.entity.CartItemEntity
import trezvo.cosmetics.glowritualcart.data.entity.OrderEntity

@Database(
    entities = [CartItemEntity::class, OrderEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class CJBEWAppDatabase : RoomDatabase() {

    abstract fun cartItemDao(): CartItemDao

    abstract fun orderDao(): OrderDao
}
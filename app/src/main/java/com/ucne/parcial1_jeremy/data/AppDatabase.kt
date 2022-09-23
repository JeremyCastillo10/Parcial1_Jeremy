package com.ucne.parcial1_jeremy.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ucne.parcial1_jeremy.data.entity.Anonima

@Database(
    entities = [Anonima::class],
    version = 2
)
abstract class AppDataBase : RoomDatabase(){

}
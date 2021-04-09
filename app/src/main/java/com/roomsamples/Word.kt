package com.roomsamples

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Entity
@Entity(tableName = "table_word")
class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)

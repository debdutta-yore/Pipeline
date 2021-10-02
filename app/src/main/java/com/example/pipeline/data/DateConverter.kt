package com.example.pipeline.data

import androidx.room.TypeConverter
import java.util.*

class DateConverter {

    @TypeConverter
    fun fromTimeStamp(value: Long?): Date?{
        return value?.let{
            Date(it)
        }
    }

    @TypeConverter
    fun dateToTimeStamp(date: Date?): Long?{
        return date?.time
    }
}
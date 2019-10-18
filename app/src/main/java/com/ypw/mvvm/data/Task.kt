package com.ypw.mvvm.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

/**
 *  @author : fengzili on
 *  @email  : 291924028@qq.com
 *  @date   : 2019/10/18 0018
 *  @pkn    : com.ypw.mvvm.data
 *  @desc   :
 */


@Entity(tableName = "tasks")
data class Task @JvmOverloads constructor(
    @ColumnInfo(name = "title")
    var title: String = "",
    @ColumnInfo(name = "description")
    var description: String = "",
    @ColumnInfo(name = "completed")
    var isCompleted: Boolean = false,
    @PrimaryKey @ColumnInfo(name = "entryid")
    var id: String = UUID.randomUUID().toString()
) {}
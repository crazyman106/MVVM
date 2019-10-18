package com.ypw.mvvm.data.source

import com.ypw.mvvm.data.Task


/**
 *  @author : fengzili on
 *  @email  : 291924028@qq.com
 *  @date   : 2019/10/18 0018
 *  @pkn    : com.ypw.mvvm.data.source
 *  @desc   : Interface to the data layer.
 */
interface TasksRepository {
    suspend fun getTasks(forceUpdate: Boolean = false): com.ypw.mvvm.data.Result<List<Task>>

    suspend fun getTask(taskId: String, forceUpdate: Boolean = false): com.ypw.mvvm.data.Result<Task>

    suspend fun saveTask(task: Task)

    suspend fun completeTask(task: Task)

    suspend fun completeTask(taskId: String)

    suspend fun activateTask(task: Task)

    suspend fun activateTask(taskId: String)

    suspend fun clearCompletedTasks()

    suspend fun deleteAllTasks()

    suspend fun deleteTask(taskId: String)
}
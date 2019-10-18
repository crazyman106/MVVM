package com.ypw.mvvm.data.source

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 *  @author : fengzili on
 *  @email  : 291924028@qq.com
 *  @date   : 2019/10/18 0018
 *  @pkn    : com.ypw.mvvm.data.source
 *  @desc   :
 */
class DefaultTasksRepository(
    private val tasksRemoteDataSource: TasksDataSource,
    private val tasksLocalDataSource: TasksDataSource,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) {

}
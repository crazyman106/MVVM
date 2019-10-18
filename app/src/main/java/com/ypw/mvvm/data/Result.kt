package com.ypw.mvvm.data

/**
 *  @author : fengzili on
 *  @email  : 291924028@qq.com
 *  @date   : 2019/10/18 0018
 *  @pkn    : com.ypw.mvvm.data
 *  @desc   :
 */

sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
    object Loading : Result<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Error -> "Error[exception=$exception]"
            Loading -> "Loading"
        }
    }
}

val Result<*>.successed
    get() = this is Result.Success && data != null
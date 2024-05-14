package com.mryogip.core_lib.error

open class ErrorEntity {
    fun isError(): Boolean = this != NoError
}

object NoError : ErrorEntity()
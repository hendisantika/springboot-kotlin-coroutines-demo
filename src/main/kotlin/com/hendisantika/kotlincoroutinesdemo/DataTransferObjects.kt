package com.hendisantika.kotlincoroutinesdemo

import java.time.ZoneId
import java.time.ZonedDateTime

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-coroutines-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/06/21
 * Time: 15.33
 */

class CounterEvent(
    val value: Long,
    val action: CounterAction,
    val at: ZonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"))
)

enum class CounterAction { UP, DOWN }

class CounterState(
    val value: Long,
    val at: ZonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"))
) {
    fun toEvent(action: CounterAction) = CounterEvent(value, action, at)
}

package com.hendisantika.kotlincoroutinesdemo

import org.springframework.data.redis.core.ReactiveRedisTemplate
import org.springframework.data.redis.core.incrementAndAwait
import org.springframework.stereotype.Repository

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-coroutines-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/06/21
 * Time: 15.36
 */
@Repository
class CounterRepository(private val redisTemplate: ReactiveRedisTemplate<String, CounterEvent>) {
    suspend fun get(): CounterState = CounterState(redisTemplate.opsForValue().incrementAndAwait(COUNTER_KEY, 0L))
}

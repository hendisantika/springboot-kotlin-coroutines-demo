package com.hendisantika.kotlincoroutinesdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-coroutines-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/06/21
 * Time: 15.43
 */
@RestController
class CounterController(private val counterRepository: CounterRepository) {
    @GetMapping("/")
    suspend fun getCounterState(): CounterState = counterRepository.get()

    @PutMapping("/up")
    suspend fun upCounterState(): CounterState = counterRepository.up()

}

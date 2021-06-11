package com.hendisantika.kotlincoroutinesdemo

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
class CounterController(private val repo: CounterRepository)

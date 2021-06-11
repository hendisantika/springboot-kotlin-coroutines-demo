package com.hendisantika.kotlincoroutinesdemo

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory
import org.springframework.data.redis.core.ReactiveRedisTemplate

@SpringBootApplication
class SpringbootKotlinCoroutinesDemoApplication {
    @Bean
    fun reactiveRedisTemplate(
        connectionFactory: ReactiveRedisConnectionFactory,
        objectMapper: ObjectMapper
    ): ReactiveRedisTemplate<String, CounterEvent> {

        val valueSerializer = Jackson2JsonRedisSerializer(CounterEvent::class.java).apply {
            setObjectMapper(objectMapper)
        }

        return ReactiveRedisTemplate(
            connectionFactory,
            newSerializationContext<String, CounterEvent>(StringRedisSerializer())
                .value(valueSerializer)
                .build()
        )
    }

}

fun main(args: Array<String>) {
    runApplication<SpringbootKotlinCoroutinesDemoApplication>(*args)
}

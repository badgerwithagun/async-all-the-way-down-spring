package com.gruelbox.asyncallthewaydownspring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class AsyncAllTheWayDownSpringApplication

fun main(args: Array<String>) {
    runApplication<AsyncAllTheWayDownSpringApplication>(*args)
}
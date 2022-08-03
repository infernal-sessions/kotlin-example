package com.creditas.kotlinexample

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class EndpointController {
    fun getVerbose():String {
        return "OK"
    }

    fun get(): ResponseEntity<String> {
        return ResponseEntity("Message", HttpStatus.OK)
    }
}
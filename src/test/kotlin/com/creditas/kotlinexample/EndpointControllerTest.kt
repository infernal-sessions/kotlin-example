package com.creditas.kotlinexample;
import org.amshove.kluent.shouldBeEqualTo
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class EndpointControllerTest {

    @Test
    fun shouldReturnOkKluent() {
        val endpointController = EndpointController()

        val result = endpointController.get()
        val expected = ResponseEntity("Message", HttpStatus.OK)

        result shouldBeEqualTo expected
    }

//    @Test
//    fun shouldReturnOkKotest() {
//        shouldBeEqualTo("OK")
//    }

    @Test
    fun shouldReturnOkAssertJ() {
        val endpointController = EndpointController()

        val result = endpointController.get()
        val expected = ResponseEntity("Message", HttpStatus.OK)

        Assertions.assertThat(result).isEqualTo(expected)
    }

}

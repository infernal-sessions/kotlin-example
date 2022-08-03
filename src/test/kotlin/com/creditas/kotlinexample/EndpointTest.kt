package com.creditas.kotlinexample;
import org.amshove.kluent.shouldBeEqualTo
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test;

public class EndpointTest {

    @Test
    fun shouldReturnOkKluent() {
        val endpointController: EndpointController = EndpointController()
        val result = endpointController.getVerbose()
        result shouldBeEqualTo "OK"
    }

//    @Test
//    fun shouldReturnOkKotest() {
//        shouldBeEqualTo("OK")
//    }

    @Test
    fun shouldReturnOkAssertJ() {
        Assertions.assertThat("").isEqualTo("OK")
    }

}

package org.example.javabasics

import org.junit.Test

class PrimeNumberTest {

    @Test
    void testMain() {
        PrimeNumber.main(["args"] as String[])
    }

    @Test
    void testIsPrime() {
        boolean result = PrimeNumber.isPrime(0)
        assert result == true
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
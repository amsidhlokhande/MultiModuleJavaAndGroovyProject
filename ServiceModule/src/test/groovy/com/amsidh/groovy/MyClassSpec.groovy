package com.amsidh.groovy

import spock.lang.Specification
import spock.lang.Unroll

class MyClassSpec extends Specification{

    @Unroll
    def "max(#a,#b) == #c"(){
        expect:
        MyClass.max(a,b) == c

        where:
        a   |   b   |   c
        1   |   3   |   3
        7   |   2   |   7
        65  |  -90  |   65
       -30  |  -24  |   -24
       -45  |  -90  |   -45

    }
}

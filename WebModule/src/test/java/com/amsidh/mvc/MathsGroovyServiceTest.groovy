package com.amsidh.mvc

class MathsGroovyServiceTest extends GroovyTestCase {

    void testForAddition() {
        new MathsGroovyService().addition();
    }

    void testForSubtraction() {
        new MathsGroovyService().subtraction();
    }
}

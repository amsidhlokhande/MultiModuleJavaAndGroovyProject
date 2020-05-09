package com.amsidh.mvc;

import org.junit.Test;

public class CalculatorJavaServiceTest {

    @Test
    public void testForAdd() {
        new CalculatorJavaService().add();
    }

    @Test
    public void testForSub() {
        new CalculatorJavaService().sub();
    }

}

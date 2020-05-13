package com.amsidh.groovy

class OperationGroovyServiceTest extends GroovyTestCase{
    def operationGroovyService = new OperationGroovyService();
    void testAdd(){
        operationGroovyService.add();
    }

    void testSub(){
        operationGroovyService.sub();
    }
}

package com.amsidh.mvc

import com.amsidh.mvc.ServiceGroovyImpl

class ServiceGroovyImplTest  extends GroovyTestCase{

    void testMessage1Groovy(){
        new ServiceGroovyImpl().message1();
    }

    void testMessage2Groovy(){
        new ServiceGroovyImpl().message2();
    }


}

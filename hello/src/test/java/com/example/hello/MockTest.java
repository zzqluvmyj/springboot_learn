package com.example.hello;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
//为了避免第三方的干扰的测试，此处模拟的第三方是remoteService
public class MockTest {

    @MockBean
    private RemoteService remoteService;

    @Autowired
    private MainService mainService;

    @Test
    public void testMainService(){
        BDDMockito.given(this.remoteService.call()).willReturn("angus");//模拟远程方法调用的返回结果
        mainService.mainService();
    }

}

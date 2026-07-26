package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    @Test
    void testclass(){
        ExternalApi a = mock(ExternalApi.class);
        when(a.getData())
                .thenReturn("Mock Data");
        MyService so = new MyService(a);

        String data = so.fetchData();

        assertEquals("Mock Data",data);
         verify(a, 
            times(2)
        ).getData();
    }
}

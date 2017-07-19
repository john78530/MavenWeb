package com.mkyong;
import java.util.HashMap;
import java.util.Map;
import org.junit.*;

public class WelcomeControllerTest {
    @Test
    public void testWelcome(){
        WelcomeController test = new WelcomeController();
        Map<String, Object> model = new HashMap<>();
        //model.put("",null);
        String s = test.welcome(model);
        Assert.assertEquals("welcome",s);
    }
}

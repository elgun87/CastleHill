package com.castlehill.runners;

import com.castlehill.utilitiy.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}

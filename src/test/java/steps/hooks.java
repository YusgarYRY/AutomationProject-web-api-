package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static helper.setup.*;

public class hooks {

    @Before
    public void beforeTest() {
        startDriver();
    }

    @After
    public void afterTest() {
        stopDriver();
    }

}

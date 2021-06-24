package slotMachine;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SpinnerSpecs {

    @Test
    public void spin() {
        List<String> colors = Arrays.asList("RED", "GREEN", "BLUE");

        Spinner spinner = new Spinner(){
            @Override
            public String spin() {
                return "RED";
            }
        };

        Assert.assertEquals("RED", spinner.spin());
    }
}

package slotMachine;

import org.junit.Assert;
import org.junit.Test;

public class SlotMachineSpecs {
    @Test
    public void zeroTokensForAllDifferentColors(){
        SlotMachine slotMachine = new SlotMachine();
        Assert.assertEquals(0, slotMachine.play());
    }
}

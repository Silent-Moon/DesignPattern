package com.anon._6commandpattern.command;

import com.anon._6commandpattern.Command;
import com.anon._6commandpattern.receiver.CeilingFan;

public abstract class AbstractCeilingFanCommand implements Command {
    protected CeilingFan ceilingFan;
    protected CeilingFan.Speed prevSpeed;

    protected AbstractCeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case LOW:
                ceilingFan.low();
                break;
            case MEDIUM:
                ceilingFan.medium();
                break;
            case HIGH:
                ceilingFan.high();
                break;
            case OFF:
                ceilingFan.off();
                break;
        }
    }
}

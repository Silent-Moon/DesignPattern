package com.anon._6commandpattern.command;

import com.anon._6commandpattern.receiver.CeilingFan;

public class CeilingFanHighCommand extends AbstractCeilingFanCommand {
    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }
}

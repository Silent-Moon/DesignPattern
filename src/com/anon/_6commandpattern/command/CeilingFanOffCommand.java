package com.anon._6commandpattern.command;

import com.anon._6commandpattern.receiver.CeilingFan;

public class CeilingFanOffCommand extends AbstractCeilingFanCommand {
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }
}

package com.anon._6commandpattern.command;

import com.anon._6commandpattern.Command;
import com.anon._6commandpattern.receiver.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

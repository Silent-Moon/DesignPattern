package com.anon._6commandpattern.command;

import com.anon._6commandpattern.Command;
import com.anon._6commandpattern.receiver.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

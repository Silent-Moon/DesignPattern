package com.anon._6commandpattern;

import com.anon._6commandpattern.command.*;
import com.anon._6commandpattern.receiver.CeilingFan;
import com.anon._6commandpattern.receiver.Light;
import com.anon._6commandpattern.receiver.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        // Test for normal commands
        RemoteControl remoteControl = new RemoteControl(7);
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        StereoOnWithCdCommand stereoOn = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(3, stereoOn, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        remoteControl.offButtonWasPushed(2);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        // Test for marco commands
        Command partyOn[] = {livingRoomLightOn, kitchenLightOn, stereoOn, ceilingFanHigh};
        Command partyOff[] = {livingRoomLightOff, kitchenLightOff, stereoOff, ceilingFanOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(4, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(4);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(4);
    }
}

package com.anon._6commandpattern;

import com.anon._6commandpattern.command.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    private int slotSize;

    public RemoteControl(int slotSize) {
        this.slotSize = slotSize;
        this.onCommands = new Command[slotSize];
        this.offCommands = new Command[slotSize];
        Command noCommand = new NoCommand();
        for (int i = 0; i < slotSize; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if ((slot < slotSize) && (slot >= 0)) {
            this.onCommands[slot] = onCommand;
            this.offCommands[slot] = offCommand;
        }
    }

    public void onButtonWasPushed(int slot) {
        if ((slot < slotSize) && (slot >= 0)) {
            onCommands[slot].execute();
            undoCommand = onCommands[slot];
        }
    }

    public void offButtonWasPushed(int slot) {
        if ((slot < slotSize) && (slot >= 0)) {
            offCommands[slot].execute();
            undoCommand = offCommands[slot];
        }
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control ------\n");
        for (int i = 0; i < slotSize; i++) {
            stringBuilder.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName())
                    .append("    ").append(offCommands[i].getClass().getName()).append("\n");
        }
        stringBuilder.append("[undo] ").append(undoCommand.getClass().getName()).append("\n");
        return stringBuilder.toString();
    }
}

package com.anon._6commandpattern.command;

import com.anon._6commandpattern.Command;

/**
 * The <code>NoCommand</code> object is an example of a <code>null</code> object. A null object is useful
 * when you don't have a meaningful object to return, and yet you want to remove
 * the responsibility for handling null from the client. For instance, in our remote
 * control we didn't have a meaningful object to assign to each slot out of the box,
 * so we provided a <code>NoCommand</code> object that acts as a surrogate and does nothing
 * when its execute method is called.
 * <p>
 * You'll find uses for Null Objects in conjunction with many Design Patterns and
 * sometimes you'll even see Null Object listed as a Design Pattern.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}

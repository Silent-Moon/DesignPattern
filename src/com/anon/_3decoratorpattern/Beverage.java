package com.anon._3decoratorpattern;

public abstract class Beverage implements Chargeable, Describable {
    public abstract Size getSize();

    public abstract void setSize(Size size);

    public enum Size {
        TALL, GRANDE, VENTI
    }
}

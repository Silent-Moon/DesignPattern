package com.anon._3decoratorpattern;

/**
 * Extending <code>Beverage</code> is important here, it allows for chained invocation when multiple condiments are
 * ordered within a serve.
 */
public abstract class CondimentDecorator extends Beverage {
}

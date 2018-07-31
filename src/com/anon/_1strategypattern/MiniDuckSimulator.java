package com.anon._1strategypattern;

import com.anon._1strategypattern.ducks.DecoyDuck;
import com.anon._1strategypattern.ducks.MallardDuck;
import com.anon._1strategypattern.ducks.RedheadDuck;
import com.anon._1strategypattern.ducks.RubberDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        System.out.println();

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performFly();
        redheadDuck.performQuack();
        System.out.println();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        System.out.println();
    }
}

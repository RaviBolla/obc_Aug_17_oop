package com.oop.lod;

/**
 * Created by ravibol on 8/7/17.
 */
public class Motor
{
    String direction;

    public Motor(String direction)
    {
        this.direction = direction;
    }

    public void stepForward(int steps)
    {
        System.out.print("Step Backward in direction: " + direction + " steps : " + steps);
    }

    public void stepBackward(int steps)
    {
        System.out.print("Step Backward in direction: " + direction + " steps : " + steps);
    }
}

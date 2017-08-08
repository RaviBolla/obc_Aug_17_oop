package com.oop.lod;

/**
 * Created by ravibol on 8/7/17.
 */
public class MoonRoverRemoteController {

    public MoonRover rover = new MoonRover();

    public void PressLeftButton()
    {
        rover.HorizontalMotor.stepForward(10);
    }

    public void PressRightButton()
    {
        rover.HorizontalMotor.stepBackward(10);
    }

    public void PressUpButton()
    {
        rover.VerticalMotor.stepForward(5);
    }

    public void PressDownButton()
    {
        rover.VerticalMotor.stepBackward(5);
    }
}

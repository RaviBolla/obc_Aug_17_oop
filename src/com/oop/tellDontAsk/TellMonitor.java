package com.oop.tellDontAsk;

/**
 * Created by ravibol on 8/7/17.
 */
public class TellMonitor {

    public static void main(String args[]) {
        Alarm alarm = new Alarm();
        TellMonitor tm = new TellMonitor("Time Vortex Hocus", 2, alarm);
        tm.setValue(3);
    }

    private int value;
    private int limit;
    private String name;
    private Alarm alarm;

    public TellMonitor(String name, int value, Alarm alarm) {
        this.alarm = alarm;
        this.name = name;
        this.value = value;
    }
    public void setValue(int arg) {
        value = arg;
        if (value > limit) alarm.warn(name + " too high");
    }
}

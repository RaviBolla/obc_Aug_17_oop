package com.oop.tellDontAsk;

/**
 * Created by ravibol on 8/7/17.
 */
public class AskMonitor {

    public static void main(String args[]) {
        Alarm alarm = new Alarm();
        AskMonitor am = new AskMonitor("Time Vortex Hocus", 2, alarm);
        am.setValue(3);
        if (am.getValue() > am.getLimit())
            am.getAlarm().warn(am.getName() + " too high");
    }


    private int value;
    private int limit;
    private String name;
    private Alarm alarm;
    public AskMonitor (String name, int limit, Alarm alarm) {
        this.name = name;
        this.limit = limit;
        this.alarm = alarm;
    }

    public String getName() {
        return name;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getLimit() {
        return limit;
    }
}

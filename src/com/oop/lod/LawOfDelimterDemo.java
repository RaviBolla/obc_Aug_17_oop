package com.oop.lod;

/**
 * Created by ravibol on 8/7/17.
 */
public class LawOfDelimterDemo {

    /**
     * This method shows two violations of "Law of Delimiter" or "Principle of least knowledge".
     */
    public void process(Order o) {

        Message msg = o.getMessage();
        msg.normalize();
        o.getMessage().normalize();
        new Message().normalize();
    }

    private class Order {
        Message getMessage() {
            return new Message();
        }
    }

    private class Message {
        void normalize() {

        }
    }
}

package com.oop;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by ravibol on 8/7/17.
 */
public class AliasBug {

    @Test
    public void testretirmentParty() {
        Date retirementDate = new Date(Date.parse("Tue 1 Nov 2016"));

        // this means we need a retirement party
        Date partyDate = retirementDate;

        // but that date is a Tuesday, let's party on the weekend
        partyDate.setDate(5);
        assertEquals(new Date(Date.parse("Sat 5 Nov 2016")), retirementDate);
        // oops, now I have to work three more days :-(
    }

    @Test
    public void testPersonAsAuthor() {
        class Person {
            private String name, phoneNumber;
            Person(String name) {
                this.name = name;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }
        }

        Person me = new Person("Martin");
        me.setPhoneNumber("1234");
        Person articleAuthor = me;
        me.setPhoneNumber("999");
        assertEquals("999", articleAuthor.getPhoneNumber());
    }

}

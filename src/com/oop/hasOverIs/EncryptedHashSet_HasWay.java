package com.oop.hasOverIs;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by ravibol on 8/7/17.
 */
public class EncryptedHashSet_HasWay {

    private HashSet container;

    public boolean add(Object o) {
        return container.add(encrypt(o));
    }

    public boolean addAll(Collection c) {
        for(Object o: c) {
            if(!container.add(encrypt(o)))
                return false;
        }
        return true;
    }

    Object encrypt(Object o) {
        return o;
    }
}

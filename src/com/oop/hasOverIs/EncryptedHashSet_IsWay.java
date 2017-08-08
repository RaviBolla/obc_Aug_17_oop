package com.oop.hasOverIs;

import java.util.HashSet;

/**
 * Created by ravibol on 8/7/17.
 */
public class EncryptedHashSet_IsWay extends HashSet {
    public boolean add(Object o) {
        return super.add(encrypt(o));
    }

    Object encrypt(Object o) {
        return o;
    }
}

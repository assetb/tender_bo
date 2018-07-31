/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altaik.bo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aset
 */
public abstract class RecipientsBase implements Iterable<Recipient>, Iterator<Recipient>, AutoCloseable {

    public int primaryLastPurchase = 1000;
    protected ArrayList<User> users;
    Integer index;
    Boolean isLoaded = false;

//    public RecipientsBase() {
//    }

    protected abstract boolean LoadIds();

    @Override
    public Iterator<Recipient> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return users != null && index + 1 < users.size();
    }

    @Override
    public Recipient next() {
        if (hasNext()) {
            index++;
            return Current();
        } else {
            Logger.getLogger(RecipientsBase.class.getName()).log(Level.SEVERE, "Exception: END OF RECIPIENT COLLECTION EXCEEDED. RETURN NULL.");
            return null;
        }
    }

    public Recipient Current() {
        return GetByIndex(index);
    }

    private int GetUserIndex(int userId) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).id == userId) {
                return i;
            }
        }
        return -1;
    }

    public Recipient GetByUserId(int userId) {
        return GetByIndex(GetUserIndex(userId));
    }

    public abstract Recipient GetByIndex(int index);

    public final void Reset() {
        index = 0;
    }

    public final void Reload() {
        isLoaded = LoadIds();
    }

    @Override
    public void close() {
        if (!users.isEmpty()) {
            users.clear();
        }
        if (users != null) {
            users = null;
        }
    }
}

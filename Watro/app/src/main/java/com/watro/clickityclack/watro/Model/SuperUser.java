package com.watro.clickityclack.watro.Model;

import java.util.IllegalFormatCodePointException;

public abstract class SuperUser {
    
    protected String email;
    protected String id;
    public SuperUser() {

    }
    /**
     * Constructor for general user class from which all others inherit
     * @param email email of user in form: name@host.ext
     * @param id firebase generated ID of user
     */
    public SuperUser(String email, String id) {
        setEmail(email);
        //this.email = email;
        this.id = id;
    }

    /**
     * Getter of user's email
     * @return String email of user
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter of email
     * @param email new email of user
     */
    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".com") && email.indexOf("@") < email.indexOf(".com")
                && (email.indexOf(".com") - email.indexOf("@")) != 1) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email has Invalid Format");
        }
    }

    /**
     * Getter of id
     * @return String id of user
     */
    public String getId() {
        return id;
    }
}
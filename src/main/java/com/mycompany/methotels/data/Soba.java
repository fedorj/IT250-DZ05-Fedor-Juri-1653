/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.data;

import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author Fedor
 */
public class Soba {
    private String ime;
    private int sprat;
    private String tv;
    private String internet;
    private String jacuzzi;

    @Inject
    public Soba() {
    }

    public Soba(String ime, int sprat, String tv, String internet, String jacuzzi) {
        this.ime = ime;
        this.sprat = sprat;
        this.tv = tv;
        this.internet = internet;
        this.jacuzzi = jacuzzi;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getSprat() {
        return sprat;
    }

    public void setSprat(int sprat) {
        this.sprat = sprat;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(String jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    

}

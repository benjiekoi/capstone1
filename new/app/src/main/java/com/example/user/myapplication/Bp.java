package com.example.user.myapplication;

/**
 * Created by User on 2/21/2018.
 */

public class Bp {

    private String SYS;
    private String DIA;
    private String HR;

    public Bp(){

    }

    public Bp(String SYS, String DIA, String HR) {
        this.SYS = SYS;
        this.DIA = DIA;
        this.HR = HR;
    }

    public String getSYS() {
        return SYS;
    }

    public void setSYS(String SYS) {
        this.SYS = SYS;
    }

    public String getDIA() {
        return DIA;
    }

    public void setDIA(String DIA) {
        this.DIA = DIA;
    }

    public String getHR() {
        return HR;
    }

    public void setHR(String HR) {
        this.HR = HR;
    }
}

package com.csci448.tcranor.mapit;



public class WeatherItem {
    private Double mTmp;
    private String mDesc;

    public Double getmTmp() {
        return mTmp;
    }

    public void setmTmp(Double mTmp) {
        this.mTmp = mTmp;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    @Override
    public String toString() {
        return "Temp: " + mTmp + "F (" + mDesc + ")" ;
    }
}


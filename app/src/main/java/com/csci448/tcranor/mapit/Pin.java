package com.csci448.tcranor.mapit;

import com.google.android.gms.maps.model.LatLng;

import java.util.Date;



public class Pin {
    private Date time;
    private LatLng pos;

    public Pin(Date date, LatLng location) {
        this.time = date;
        this.pos = location;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public LatLng getPos() {
        return pos;
    }

    public void setPos(LatLng pos) {
        this.pos = pos;
    }
}

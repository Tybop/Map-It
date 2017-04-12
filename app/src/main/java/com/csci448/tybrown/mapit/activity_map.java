package com.csci448.tybrown.mapit;

import android.support.v4.app.Fragment;

public class activity_map extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return fragment_map.newInstance();
    }
}

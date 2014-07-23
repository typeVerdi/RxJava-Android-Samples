package com.morihacky.android.rxjava;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.morihacky.android.rxjava.app.R;

import timber.log.Timber;

public class DemoActivity
    extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        Timber.plant(new Timber.DebugTree());

        getSupportFragmentManager().beginTransaction()
                                   .addToBackStack(this.toString())
                                   .replace(R.id.activity_container, new DemoFragment(), this.toString())
                                   .commit();
    }
}

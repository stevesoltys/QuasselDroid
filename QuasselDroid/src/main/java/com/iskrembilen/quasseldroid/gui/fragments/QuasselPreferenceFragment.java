package com.iskrembilen.quasseldroid.gui.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.iskrembilen.quasseldroid.R;

public class QuasselPreferenceFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.data_preferences);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}

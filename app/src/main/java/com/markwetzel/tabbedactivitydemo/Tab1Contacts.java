package com.markwetzel.tabbedactivitydemo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Tab1Contacts extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1contacts, container, false);

        Bundle bundle = getArguments();
        if(bundle != null) {
            Log.i("Test of bundle", bundle.toString());
        }

        return rootView;
    }
}

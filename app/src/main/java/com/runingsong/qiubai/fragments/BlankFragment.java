package com.runingsong.qiubai.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.runingsong.qiubai.R;

public class BlankFragment extends Fragment {
    public static final String TEXT = "text";
    public BlankFragment() {
    }

    public static BlankFragment newInstance(String str) {
        Bundle args = new Bundle();
        args.putString(TEXT,str);
        BlankFragment fragment = new BlankFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView)view.findViewById(R.id.blank_text);
        Bundle arguments = getArguments();
        String str = arguments.getString(TEXT);
        textView.setText(str);
    }
}

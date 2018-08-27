package com.test.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Pavan Kumar DS on 7/27/2018 for Mala.
 */
public class FragmentRight extends Fragment {
    // This method will be invoked when the Fragment view object is created.
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View retView = inflater.inflate(R.layout.fragment_right, container);

        if(retView!=null) {
            TextView fragmentRightTextView = (TextView)retView.findViewById(R.id.fragmentRightTextView);
            fragmentRightTextView.setText("This is the default right fragment.");
        }
        return retView;
    }

}

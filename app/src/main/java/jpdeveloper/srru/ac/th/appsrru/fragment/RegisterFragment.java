package jpdeveloper.srru.ac.th.appsrru.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jpdeveloper.srru.ac.th.appsrru.R;

public class RegisterFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        // control + space
        View view = inflater.inflate(R.layout.fragment_register,container,false);
        return view;


    }
}

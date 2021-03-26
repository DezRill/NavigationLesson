package com.dezrill.navfragments_lesson;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SecondFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        Bundle bundle=getArguments();
        String str;

        if (bundle!=null) {
            str=bundle.getString("key");
            Toast.makeText(getContext(),str,Toast.LENGTH_SHORT).show();
        }

        getView().findViewById(R.id.sBtnNext).setOnClickListener(v -> MainActivity.controller.navigate(R.id.action_secondFragment_to_thirdFragment));
        getView().findViewById(R.id.sBtnBack).setOnClickListener(v -> MainActivity.controller.navigate(R.id.action_secondFragment_to_firstFragment));
    }
}
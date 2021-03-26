package com.dezrill.navfragments_lesson;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        getView().findViewById(R.id.fBtnNext).setOnClickListener(v -> {
            Bundle bundle=new Bundle();
            bundle.putString("key", "С первого фрагмента на второй фрагмент");
            MainActivity.controller.navigate(R.id.action_firstFragment_to_secondFragment, bundle);
        });
    }
}
package com.taxi.taxidriver.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.taxi.taxidriver.R;
import com.taxi.taxidriver.utils.BaseFragment;

import static com.taxi.taxidriver.ui.MainHomeActivity.tvEditProfile;

public class JobHistoryFragment extends BaseFragment {
    private View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_job_history, container, false);
        return rootView;
    }
}

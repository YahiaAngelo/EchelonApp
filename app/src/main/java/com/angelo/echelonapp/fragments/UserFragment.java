package com.angelo.echelonapp.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.angelo.echelonapp.R;
import com.angelo.echelonapp.adapters.UserAdapter;
import com.angelo.echelonapp.classes.User;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class UserFragment extends Fragment {


    public UserFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_user, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User(getString(R.string.yunusname), getString(R.string.yunus_desc), R.drawable.yunus));
        userList.add(new User(getString(R.string.nanoname), getString(R.string.nano_desc), R.drawable.nano));
        userList.add(new User(getString(R.string.enesname), getString(R.string.enes_desc), R.drawable.enes));
        userList.add(new User(getString(R.string.resitname), getString(R.string.resit_desc), R.drawable.resit));
        userList.add(new User(getString(R.string.peakname), getString(R.string.peak_desc), R.drawable.peak));


        UserAdapter userAdapter = new UserAdapter(new ArrayList<User>(userList));

        recyclerView.setAdapter(userAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return rootView;
    }
}

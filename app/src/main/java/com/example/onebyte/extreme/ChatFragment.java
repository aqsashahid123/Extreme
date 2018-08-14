package com.example.onebyte.extreme;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ChatFragment extends Fragment {
    List<String> customList;
    Adapter adapter;
    RecyclerView rvList;

    public ChatFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        rvList = (RecyclerView) view.findViewById(R.id.rvData);
        customList = new ArrayList<>();
        customList.add("Tell me a quote");
        customList.add("Tell me a joke");
        customList.add("Tell me a story");
        customList.add("Tell me a story");
        adapter = new Adapter(customList, this.getActivity());
        rvList.setLayoutManager(new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL, true));
        rvList.setAdapter(adapter);
        return view;
    }
}

package com.uts.reza.Activities;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uts.reza.R;

import java.util.ArrayList;
import java.util.List;

// Tanggal Pengerjaan : 23 Mei 2019
// NIM : 10116310
// NAMA : MUHAMAD REZA FEBRIANA
// KELAS : IF-7 / AKB-7


public class MenuSearch extends Fragment {

    private RecyclerView listMember;
    private LinearLayoutManager linearLayoutManager;
    private MemberListAdapter memberListAdapter;

    protected Context context;

    public static MenuSearch newInstance(){
        return new MenuSearch();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_menu_search, container, false);

        listMember = (RecyclerView) rootView.findViewById(R.id.listMember);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        linearLayoutManager = new LinearLayoutManager(context);
        memberListAdapter = new MemberListAdapter();

        listMember.setLayoutManager(linearLayoutManager);
        listMember.setAdapter(memberListAdapter);

        loadData();
    }

    private void loadData(){
        List<Member> memberList = new ArrayList<>();
        Member member;

        int thumb[] = {R.drawable.pink, R.drawable.pink, R.drawable.pink, R.drawable.pink, R.drawable.pink};

        String name[] = {"Cecep Arief H", "Husnie Fathu R", "Sabadi Dwiputra", "Febbye Permana", "Yodi Azhari"};

        String team[] = {"Nim : 10116601 Kelas : IF7","Nim : 10116278 Kelas : IF7","Nim : 10116314 Kelas: IF7", "Nim : 10116306 Kelas: IF7", "Nim : 10116307 Kelas: IF7"};

        for(int i=0; i < thumb.length; i++){
            member = new Member();
            member.setId(i+1);
            member.setName(name[i]);
            member.setTeam(team[i]);
            member.setThumb(thumb[i]);
            memberList.add(member);
        }

        memberListAdapter.addAll(memberList);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}

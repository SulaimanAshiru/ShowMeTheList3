package com.example.showmethelist3.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.showmethelist3.R;
import com.example.showmethelist3.model.Person;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    //Create List
    private List<Person> personList;

    //Constructor

    public PersonAdapter(List<Person> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Create view ojbect
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.person_item_view,
                        parent,
                        false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    class PersonViewHolder extends RecyclerView.ViewHolder{

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

package com.example.showmethelist3.viewmodel;

import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AndroidViewModel;

import com.example.showmethelist3.R;
import com.example.showmethelist3.model.Person;
import com.example.showmethelist3.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    //Declare Repo
    private Repository repo;


    public MainActivityViewModel(@NonNull Application application) {
        super(application);

        //Initalize repo
        repo = Repository.getInstance();
    }

   //Create method to get Data
   public List<Person> getData() {
        return repo.getData();

    }
}

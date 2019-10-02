package com.example.showmethelist3.repository;

import com.example.showmethelist3.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    //Private Constructor

    private Repository () {

    }
    //Static class to hold Instance
    static class InstanceHolder {
      //static class to hold Instance
        static Repository INSTANCE = new Repository();
    }

    //public static method to get the Instance
    public static Repository getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public List<Person> getData () {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Name: Michael", "Jordan", "Email: mj23@bulls.com", "Phone Number: 2123452321", ""));
        people.add(new Person("Name: Stephen", "Curry",  "Email: sc30@warriors.com", "Phone Number: 2128562135",  ""));
        people.add(new Person("Name: Lebron",  "James",  "Email: lj23@heat.com", "Phone Number: 2124569878", ""));
        people.add(new Person("Name: Allen",   "Iverson", "Email: ai03@sixers.com", "Phone Number: 2123697898", ""));
        return people;

    }

}

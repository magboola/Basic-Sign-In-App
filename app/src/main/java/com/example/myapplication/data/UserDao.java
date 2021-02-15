package com.example.myapplication.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.myapplication.model.User;

@Dao
public interface UserDao {
    @Query("SELECT * FROM User WHERE  email = :email and password = :password")
    User getUser(String email, String password);

    @Insert
    void insert(User user);
}
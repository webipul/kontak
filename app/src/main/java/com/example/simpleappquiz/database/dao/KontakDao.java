package com.example.simpleappquiz.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.simpleappquiz.database.entitas.Kontak;

import java.util.List;

@Dao
public interface KontakDao {

    @Query("SELECT * FROM kontak")
    List<Kontak> getAll();

    @Query("INSERT INTO kontak (name, nohp) VALUES(:name, :nohp)")
    void inserAll(String name, String nohp);

    @Delete
    void delete(Kontak kontak);
}

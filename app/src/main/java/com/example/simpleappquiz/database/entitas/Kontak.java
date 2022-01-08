package com.example.simpleappquiz.database.entitas;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Kontak {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "name")
    public String name;

    public String nohp;
}

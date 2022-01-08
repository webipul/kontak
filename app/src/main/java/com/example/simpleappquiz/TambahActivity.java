package com.example.simpleappquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.simpleappquiz.database.AppDatabase;
import com.example.simpleappquiz.database.entitas.Kontak;

public class TambahActivity extends AppCompatActivity {

    private EditText editNama, editNohp;
    private Button btnSave;
    private AppDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);

        editNama = findViewById(R.id.Full_name);
        editNohp = findViewById(R.id.nohp);
        btnSave = findViewById(R.id.btn_save);

        database = AppDatabase.getInstance(getApplicationContext());

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database.kontakDao().inserAll(editNama.getText().toString(), editNohp.getText().toString());
                finish();
            }
        });
    }
}
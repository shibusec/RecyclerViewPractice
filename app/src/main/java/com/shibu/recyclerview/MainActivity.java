package com.shibu.recyclerview;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
     ArrayList<ContactModel>  arraContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //ContactModel model = new ContactModel(R.drawable.boy,"Shihab","01921462000");
        arraContacts.add(new ContactModel(R.drawable.boy,"Shibu","88676746"));
        arraContacts.add(new ContactModel(R.drawable.boy2,"Json","88676746"));
        arraContacts.add(new ContactModel(R.drawable.boy3,"Carlos","967854757"));
        arraContacts.add(new ContactModel(R.drawable.boy4,"Mike","097554444"));
        arraContacts.add(new ContactModel(R.drawable.boy5,"Alif","09876543334"));
        arraContacts.add(new ContactModel(R.drawable.boy6,"Araf","87654433333"));
        arraContacts.add(new ContactModel(R.drawable.boy7,"Himel","4747474774"));
        arraContacts.add(new ContactModel(R.drawable.boy8,"Galib","9876543212"));
        arraContacts.add(new ContactModel(R.drawable.boy2,"Json","88676746"));
        arraContacts.add(new ContactModel(R.drawable.boy3,"Carlos","967854757"));
        arraContacts.add(new ContactModel(R.drawable.boy4,"Mike","097554444"));
        arraContacts.add(new ContactModel(R.drawable.boy5,"Alif","09876543334"));
        arraContacts.add(new ContactModel(R.drawable.boy,"Shibu","88676746"));
        arraContacts.add(new ContactModel(R.drawable.boy2,"Json","88676746"));
        arraContacts.add(new ContactModel(R.drawable.boy3,"Carlos","967854757"));
        arraContacts.add(new ContactModel(R.drawable.boy,"Shibu","88676746"));
        arraContacts.add(new ContactModel(R.drawable.boy2,"Json","88676746"));
        arraContacts.add(new ContactModel(R.drawable.boy3,"Carlos","967854757"));
        arraContacts.add(new ContactModel(R.drawable.boy,"Shibu","88676746"));
        arraContacts.add(new ContactModel(R.drawable.boy2,"Json","88676746"));
        arraContacts.add(new ContactModel(R.drawable.boy3,"Carlos","967854757"));
        arraContacts.add(new ContactModel(R.drawable.boy,"Shibu","88676746"));
        arraContacts.add(new ContactModel(R.drawable.boy2,"Json","88676746"));
        arraContacts.add(new ContactModel(R.drawable.boy3,"Carlos","967854757"));
        arraContacts.add(new ContactModel(R.drawable.boy4,"Mike","097554444"));
        arraContacts.add(new ContactModel(R.drawable.boy5,"Alif","09876543334"));
        arraContacts.add(new ContactModel(R.drawable.boy6,"Araf","87654433333"));
        arraContacts.add(new ContactModel(R.drawable.boy7,"Himel","4747474774"));
        arraContacts.add(new ContactModel(R.drawable.boy8,"Galib","9876543212"));
        arraContacts.add(new ContactModel(R.drawable.boy4,"Mike","097554444"));
        arraContacts.add(new ContactModel(R.drawable.boy5,"Alif","09876543334"));
        arraContacts.add(new ContactModel(R.drawable.boy6,"Araf","87654433333"));
        arraContacts.add(new ContactModel(R.drawable.boy7,"Himel","4747474774"));
        arraContacts.add(new ContactModel(R.drawable.boy8,"Galib","9876543212"));
        arraContacts.add(new ContactModel(R.drawable.boy4,"Mike","097554444"));
        arraContacts.add(new ContactModel(R.drawable.boy5,"Alif","09876543334"));
        arraContacts.add(new ContactModel(R.drawable.boy6,"Araf","87654433333"));
        arraContacts.add(new ContactModel(R.drawable.boy7,"Himel","4747474774"));
        arraContacts.add(new ContactModel(R.drawable.boy8,"Galib","9876543212"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this , arraContacts);
        recyclerView.setAdapter(adapter);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
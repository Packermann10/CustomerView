package com.example.pierre.liste_sport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Pierre on 21/02/2018.
 */

public class handball extends AppCompatActivity {

    //on déclare la liste
    private ListView mListView;

    //on déclare un tableau de string pour faire la liste des caracteristiques du sport
    private String[] caracteristique = new String[]{
            "Sport collectif", "Nikola Karabatic", "Ballon", "Sport en salle"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //on récupère l'intent
        Intent MonIntent = getIntent();

        //on déclare la liste
        mListView = (ListView) findViewById(R.id.Liste1);

        //on délcare l'adapter
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(handball.this,
                android.R.layout.simple_list_item_1, caracteristique);

        //on set l'adapter à notre liste
        mListView.setAdapter(adapter);
    }
}



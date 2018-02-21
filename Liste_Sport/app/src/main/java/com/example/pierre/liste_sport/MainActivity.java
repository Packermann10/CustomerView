package com.example.pierre.liste_sport;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //tableau d'image
    int[] IMG = {R.drawable.basket, R.drawable.foot, R.drawable.hand, R.drawable.rugby};

    //tableau de string pour le libellé des sports
    String[] LABEL = {"Handball", "Football", "Basketball","Rugby"};

    //tableau de string pour les noms des sportifs
    String[] SPORTIF = {"Nikola Karabatic", "Zinédine Zidane", "Tony Parker", "Sébastien Chabal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //on déclare la list
        ListView listView = (ListView) findViewById(R.id.myListe);

        //on déclare notre adapter
        CustomAdapter customAdapter = new CustomAdapter();

        //on set l'adapter
        listView.setAdapter(customAdapter);


    }

    //classe de du custom Adapter
    class CustomAdapter extends BaseAdapter {


        //méthode qui retourne la longueur du tableau d'image
        @Override
        public int getCount() {
            return IMG.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        //méthode getview
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.sport_layout, null);

            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            TextView textView_nom = (TextView) view.findViewById(R.id.tv_nom);
            TextView textView_des = (TextView) view.findViewById(R.id.tv_des);

            imageView.setImageResource(IMG[i]);
            textView_nom.setText(LABEL[i]);
            textView_des.setText(SPORTIF[i]);

            return view;
        }
    }

    //méthode pour cliquer sur un élément de la liste et renvoyer sur une nouvelle activité (fonctionne pas)
    public void onListItemClick(ListView listView, View view, int position, long id) {
        Log.v("L'appli", "sport dans la log");
        Intent MonIntent = new Intent(MainActivity.this, handball.class); // on déclare l'intent
        startActivity(MonIntent);
    }

}




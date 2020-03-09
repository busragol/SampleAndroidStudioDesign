package com.example.sindirella2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twentypage);
        listview=(ListView)findViewById(R.id.listview);
        ArrayList<String> arraylist=new ArrayList<>();
        arraylist.add("Siparişlerim");
        arraylist.add("Sipariş Geçmişim");
        arraylist.add("30₺ Kazan ");
        arraylist.add("Profilim");
        arraylist.add("Ayarlar");
        ArrayAdapter arrayadapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arraylist);
        listview.setAdapter(arrayadapter);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }
}

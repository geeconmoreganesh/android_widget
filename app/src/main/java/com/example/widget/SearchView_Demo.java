package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SearchView_Demo extends AppCompatActivity {

    androidx.appcompat.widget.SearchView search1;
    private ListView list1;
    private ArrayList<CharSequence> arrayList;
    private ArrayAdapter<CharSequence> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view__demo);

        search1 = findViewById(R.id.search_1);
        list1 = (ListView) findViewById(R.id.list_1);

        arrayList=new ArrayList<CharSequence>();
        arrayList.add("Mango");
        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("papaya");
        arrayList.add("kiwi");
        arrayList.add("Grapes");
        arrayList.add("Lychee");
        arrayList.add("pomogranate");

        arrayAdapter=new ArrayAdapter<CharSequence>(this,android.R.layout.simple_list_item_1,arrayList);
        list1.setAdapter(arrayAdapter);

        search1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(arrayList.contains(query))
                {
                    arrayAdapter.getFilter().filter(query);
                }
                else
                {
                    Toast.makeText(SearchView_Demo.this, "No match found", Toast.LENGTH_SHORT).show();
                }

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                arrayAdapter.getFilter().filter(newText);

                return false;
            }
        });

    }
}
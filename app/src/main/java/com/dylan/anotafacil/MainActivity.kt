package com.dylan.anotafacil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.LayoutInflater
import android.view.View
import com.dylan.anotafacil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /*
    BottomNavigationView bottomNavigationView;
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        bottomNavigationView = findViewById(R.id.bottomNavigationView):
        */

        /*
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedlistener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mapa:
                    Toast.makeText(AddAddressActivity.this, "Mapa",Toast.LENGTH_HOME).show();
                    break;

                    case R.id.camara:
                    Toast.makeText(AddNoteActivity.this, "Camara",Toast.LENGTH_HOME).show();
                    break;

                    case R.id.info:
                    Toast.makeText(InfoActivity.this, "Mapa",Toast.LENGTH_HOME).show();
                    break;

                    default;
                }
            }
        }
        */

    }

}
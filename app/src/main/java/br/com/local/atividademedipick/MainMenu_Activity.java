package br.com.local.atividademedipick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;
import android.widget.ImageButton;

public class MainMenu_Activity extends AppCompatActivity {

   //ImageButton imbOrder, imbPresc, imbOrders, imbMedic, imbProfile, imbChat, imbPill;
    //Button btnOrder, btnPresc, btnOrders, btnMedic, btnProfile, btnChat, btnPill;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
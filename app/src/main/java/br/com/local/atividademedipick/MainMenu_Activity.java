package br.com.local.atividademedipick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainMenu_Activity extends AppCompatActivity {

    ImageButton imbOrder, imbPresc, imbOrders, imbMedic, imbProfile, imbChat, imbPill;
    Button btnOrder, btnPresc, btnOrders, btnMedic, btnProfile, btnChat, btnPill;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_layout);

        imbOrder = findViewById(R.id.imbOrder);
        imbPresc = findViewById(R.id.imbPresc);
        imbOrders = findViewById(R.id.imbOrders);
        imbMedic = findViewById(R.id.imbMedic);
        imbProfile = findViewById(R.id.imbProfile);
        imbChat = findViewById(R.id.imbChat);
        imbPill = findViewById(R.id.imbPill);

        btnOrder = findViewById(R.id.btnOrder);
        btnPresc = findViewById(R.id.btnPresc);
        btnOrders = findViewById(R.id.btnOrders);
        btnMedic = findViewById(R.id.btnMedic);
        btnProfile = findViewById(R.id.btnProfile);
        btnChat = findViewById(R.id.btnChat);
        btnPill = findViewById(R.id.btnPill);

        imbOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        imbPresc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        imbOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        imbMedic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        imbProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        imbChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        imbPill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnPresc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnMedic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnPill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em Construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
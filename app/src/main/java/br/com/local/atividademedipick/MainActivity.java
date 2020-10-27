package br.com.local.atividademedipick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEntrar, btnSignup;
    EditText edtUsu, edtSenha;
    TextView txtEsqueceu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrar = findViewById(R.id.btnEntrar);
        edtUsu = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
        btnSignup = findViewById(R.id.btnSignup);
        txtEsqueceu = findViewById(R.id.txtEsqueceu);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = edtUsu.getText().toString();
                String senha = edtSenha.getText().toString();

                if (usuario.equals("etecia") && senha.equals("12345")){

                    startActivity(new Intent(getApplicationContext(), MainMenu_Activity.class));
                    finish();
                }else{

                    Toast.makeText(getApplicationContext(),
                            "Usuário ou Senha inválidos",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        txtEsqueceu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Em construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }


}
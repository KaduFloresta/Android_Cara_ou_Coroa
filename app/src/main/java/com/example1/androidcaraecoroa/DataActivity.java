package com.example1.androidcaraecoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private TextView textResultado;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        imageResultado = findViewById(R.id.imageResultado);
        textResultado = findViewById(R.id.textResultado);
        btnVoltar = findViewById(R.id.btnVoltar);

        // Recuperar os dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");
        // se o número sorteado for 0 = exibe a imagem CARA
        if (numero == 0) {
            textResultado.setText("DEU CARA!!!");
            imageResultado.setImageResource(R.drawable.moeda_cara);

        } else {
            textResultado.setText("DEU COROA!!!");
            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Encerrar essa activity
                finish();
            }
        });
    }
}
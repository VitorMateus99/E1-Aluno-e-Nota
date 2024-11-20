package com.example.e2entregar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);

    }


    public void onClickCadastrar(View view) {
        Intent intent = new Intent(DashboardActivity.this, CadastroActivity.class);
        startActivity(intent);
    }
    public void onClickListagem(View view) {
        Intent intent = new Intent (DashboardActivity.this, ListagemActivity.class);
        startActivity(intent);
        }


    }

package com.example.e2entregar;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        setTitle("E o Inter");

    }

    public void Cadastrar(View view)
    {
        //Pegar caixa
        EditText CaixaNomeAluno = findViewById(R.id.editTextNome);
        EditText CaixaNotaAluno= findViewById(R.id.editTextNota);
        //Pegar dados
        String nome = CaixaNomeAluno.getText().toString();
        String nota = CaixaNotaAluno.getText().toString();

        //Verificar se foi digitado

        if( nome.isEmpty() || nota.isEmpty())
        {
            Toast.makeText(this,"Preencha os campos",
                    Toast.LENGTH_LONG).show();
            return;
        }

        Aluno aluno = new Aluno(nome, Float.parseFloat(nota));

        DadosCompartilhados.lista.add(aluno);

        Toast.makeText(this,"Cadastro Realizado com Sucesso",
                Toast.LENGTH_LONG).show();



    }
















}
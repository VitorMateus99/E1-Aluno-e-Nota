package com.example.e2entregar;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.example.e2entregar.R;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);

        ListView listView = findViewById(R.id.listViewAluno);

        String[] dados = new String[DadosCompartilhados.lista.size()];
        float somaNota= 0;
        float media;

        ///Estamos passando de lista para o Vetor
        for ( int i=0; i < DadosCompartilhados.lista.size() ; i++)
        {
            Aluno aluno = DadosCompartilhados.lista.get(i);
            dados[i] = "Nome: " + aluno.getNome() + "    -    " + "Nota: " + aluno.getNota();
            somaNota += aluno.getNota();

        }
        //Verificar se tem tem aluno na lista e calcular

        if (DadosCompartilhados.lista.size() > 0)
        {
            media = somaNota / DadosCompartilhados.lista.size();
            setTitle("Nota media Geral da Turma: " + media);
        }
        else
        {
            setTitle("Nenhum Aluno Cadastrado");
        }

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dados);
                listView.setAdapter(adapter);

    }








    }



















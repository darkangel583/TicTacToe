package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerSetUp extends AppCompatActivity {

    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_set_up);

        player1 = findViewById(R.id.editTextTextPersonName);
        player2 = findViewById(R.id.editTextTextPersonName2);
    }

    public void submitButtonClick(View view) {
        String player1Name = player1.getText().toString();
        String player2Name = player2.getText().toString();

        Intent intent = new Intent(this,GameDisplay.class);
        intent.putExtra("PLAYER_NAME", new String[] {player1Name, player2Name});
        startActivity(intent);
    }
}
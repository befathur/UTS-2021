package umn.ac.id.uts_33479;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    Button login;
    EditText username;
    EditText passwordLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagelogin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Login");
        login = findViewById(R.id.login);
        username = findViewById(R.id.username);
        passwordLogin = findViewById(R.id.passwordLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("uasmobile") && passwordLogin.getText().toString().equals("uasmobilegenap")){
                    Intent intentPlaylist = new Intent( LoginPage.this, Music.class);
                    startActivity(intentPlaylist);
                }else{
                    Toast.makeText(LoginPage.this, "Password Salah !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
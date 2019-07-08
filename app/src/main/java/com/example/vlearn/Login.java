package com.example.vlearn;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vlearn.api.ApiVLearn;
import com.example.vlearn.api.ApiVLearnClient;
import com.example.vlearn.model.User;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.vlearn.MainActivity.AGE;

public class Login extends AppCompatActivity {

    Button btnLogin;
    private TextInputEditText username,password;
    private ApiVLearnClient apiVLearnClient;
    private List<User> listUsers;
    boolean res;
    private Context c = this;
    private String usern,pwd;
    private User user =null;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        //recuperation de l'id du bouton sur le layout
        btnLogin = findViewById(R.id.btnLogin);
        username = findViewById(R.id.EditTextUsername);
        password = findViewById(R.id.EditTextPassword);

        usern = String.valueOf(username.getText());
        pwd = String.valueOf(password.getText());

        //attribution du listener sur le btnLogin

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signIn(c,usern,pwd)){
                    for (User a : listUsers)
                        user = a;
                    Intent nextPage = new Intent(Login.this,Page_Main.class);
                    nextPage.putExtra("userInfo",user);
                    startActivity(nextPage);

                }
            }
        });

        Intent i = getIntent();
        int age = i.getIntExtra(AGE, 0);

        if (age != 0){

        }
    }


    public boolean signIn(final Context context,String username,String password){

        apiVLearnClient = ApiVLearn.getApiVLearn().create(ApiVLearnClient.class);
        Call<List<User>> call =apiVLearnClient.getUserInfo(username,password);


        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {

                listUsers = response.body();
                res = true;
            }

            @Override
            public void onFailure(@NotNull Call<List<User>> call, Throwable t) {

                Toast.makeText(context,"Erreur Log 75 : "+t.getMessage(),Toast.LENGTH_LONG).show();
                res = false;
            }
        });

        return res;

    }
}

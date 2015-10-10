package com.example.test.barcampexample;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.test.barcampexample.LandingActivity;
import com.example.test.barcampexample.dtos.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class MainActivity extends ActionBarActivity {

    EditText txtLogin;
    EditText txtPassword;
    Button btnLogin;
    List<User> usersList;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createUsers();

        txtLogin = (EditText)findViewById(R.id.txtLogin);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateFields()){
                    if(validateUser()){
                        Intent intent = new Intent(MainActivity.this, LandingActivity.class);
                        startActivity(intent);
                    } else {
                        message = getString(R.string.wrong_user);
                        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    message = getString(R.string.empty_fields);
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void createUsers() {
        usersList = new ArrayList<User>();
        User user = new User("18927648", "Juan", "123456", "3123004002", "Calle 1");
        usersList.add(user);
        user = new User("10456474", "Sebastian", "654321", "3005674983", "Calle 5");
        usersList.add(user);
        user = new User("50052643", "Angela", "105383", "3156452897", "Calle 80");
        usersList.add(user);
        user = new User("24379845", "Sandra", "068977", "3215678435", "Calle 1");
        usersList.add(user);
    }

    private boolean validateFields(){
        if(txtLogin.getText() != null && txtLogin.getText().length() != 0 &&
                txtPassword.getText() != null && txtPassword.getText().length() != 0){
            return true;
        } else {
            return false;
        }
    }

    private boolean validateUser() {
        boolean result = false;
        String userId = txtLogin.getText().toString();
        String userPassword = txtPassword.getText().toString();
        User actualUser = new User(userId, userPassword);
        for(int i = 0; i < usersList.size(); i++){
            if(actualUser.getName().equals(usersList.get(i).getName()) && actualUser.getPassword().equals(usersList.get(i).getPassword())){
                result = true;
                i = usersList.size();
            }
        }
        return result;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

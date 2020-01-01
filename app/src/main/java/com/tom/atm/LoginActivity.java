package com.tom.atm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        EditText edUsername = findViewById(R.id.username); //先取得畫面上的帳號EditText元件，名稱為edUserid
        EditText edPassword = findViewById(R.id.password);
        String username = edUsername.getText().toString();
        String password = edPassword.getText().toString();
        if ("jack".equals(username) && "1234".equals(password)) { //登入成功
            setResult(RESULT_OK);
            finish();

          /*  SharedPreferences setting =
                    getSharedPreferences("atm", MODE_PRIVATE); //取得儲存設定物件setting
            setting.edit() //呼叫其edit()方法取得SharedPreferences.Editor編輯器物件
                    .putString("PREF_USERID", uid) //呼叫putString方法將uid帳號字串儲存
                    .commit(); //呼叫commit()方法，實際進行儲存資料。在此帳號資料儲存的鍵值為「PREF_USERID」。

           */

        } else {
            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.cry)
                    .setTitle("登入訊息")
                    .setMessage("登入失敗")
                    .setPositiveButton("OK", null)
                    .show();
        }

       /*
        怎麼讓APP記住我的登入帳號?
        SharedPreferences setting =
                getSharedPreferences("atm", MODE_PRIVATE);
        edUserid.setText(setting.getString("PREF_USERID", ""));


        */
    }
}

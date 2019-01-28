package com.example.uilogin;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView website, pageTitle, login_usernameTv, login_passwordTv, signUpTv;
    EditText login_usernameEdt, login_passwordEdt;
    Switch darkMode;
    Button login_btn;

    View topView, triView;
    LinearLayout loginView;

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        website = findViewById(R.id.website);
        pageTitle = findViewById(R.id.pageTitle);
        login_usernameTv = findViewById(R.id.login_usernameTv);
        login_passwordTv = findViewById(R.id.login_passwordTv);
        signUpTv = findViewById(R.id.signUpTv);

        login_usernameEdt = findViewById(R.id.login_usernameEdt);
        login_passwordEdt = findViewById(R.id.login_passwordEdt);


        darkMode = findViewById(R.id.darkMode_switch);
        login_btn = findViewById(R.id.login_btn);


        topView = findViewById(R.id.view);
        triView = findViewById(R.id.view2);

        loginView = findViewById(R.id.loginView);

        logo = findViewById(R.id.logo);


        Typeface philosopher = Typeface.createFromAsset(getAssets(), "fonts/Philosopher-Regular.ttf");
        Typeface giger = Typeface.createFromAsset(getAssets(), "fonts/giger.ttf");

        website.setTypeface(philosopher);
        pageTitle.setTypeface(giger);
        login_usernameTv.setTypeface(philosopher);
        login_passwordTv.setTypeface(philosopher);
        signUpTv.setTypeface(philosopher);


        login_usernameEdt.setTypeface(philosopher);
        login_passwordEdt.setTypeface(philosopher);

        darkMode.setTypeface(philosopher);
        login_btn.setTypeface(philosopher);

        topView.setAlpha(0);
        topView.setTranslationY(200);

        triView.setAlpha(0);
        triView.setTranslationY(200);

        darkMode.setAlpha(0);
        darkMode.setTranslationY(200);

        logo.setVisibility(View.GONE);
        logo.setTranslationY(-200);

        website.setAlpha(0);
        website.setTranslationY(200);

        pageTitle.setAlpha(0);
        pageTitle.setTranslationY(200);

        loginView.setAlpha(0);
        loginView.setTranslationY(200);

        signUpTv.setAlpha(0);
        signUpTv.setTranslationY(200);

        topView.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();
        triView.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();
        darkMode.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();
        logo.setVisibility(View.VISIBLE);
        logo.animate().translationY(0).setDuration(800).setStartDelay(500).start();
        website.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();
        pageTitle.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();
        loginView.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();
        signUpTv.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();


        darkMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    Toast.makeText(MainActivity.this, "Checked", Toast.LENGTH_SHORT).show();
                    Intent dark_Screen = new Intent(MainActivity.this, login_dark.class);
                    startActivity(dark_Screen);
                    finishAffinity();
                }

            }
        });


        signUpTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent signup = new Intent(getApplicationContext(), Signup.class);
                startActivity(signup);

            }
        });






    }
}

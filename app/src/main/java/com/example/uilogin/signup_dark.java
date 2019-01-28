package com.example.uilogin;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class signup_dark extends AppCompatActivity {

    TextView website, pageTitle, usernameTv, emailTv, passwordTv, socialMediaTv;
    ImageView fb, google, twitter;
    EditText usernameEdt, emailEdt, passwordEdt;
    Button signup_btn;

    View topView, triView;
    LinearLayout signUpView;

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_dark);

        website = findViewById(R.id.website);
        pageTitle = findViewById(R.id.pageTitle);
        usernameTv = findViewById(R.id.usernameTv);
        emailTv = findViewById(R.id.emailTv);
        passwordTv = findViewById(R.id.passwordTv);
        socialMediaTv = findViewById(R.id.socialMediaTv);

        fb = findViewById(R.id.fb);
        google = findViewById(R.id.google);
        twitter = findViewById(R.id.twitter);

        usernameEdt = findViewById(R.id.usernameEdt);
        emailEdt = findViewById(R.id.emailEdt);
        passwordEdt = findViewById(R.id.passwordEdt);

        signup_btn = findViewById(R.id.signUpBtn);

        topView = findViewById(R.id.view);
        triView = findViewById(R.id.view2);

        signUpView = findViewById(R.id.cardLayout);

        logo = findViewById(R.id.logo);

        Typeface philosopher = Typeface.createFromAsset(getAssets(), "fonts/Philosopher-Regular.ttf");
        Typeface giger = Typeface.createFromAsset(getAssets(), "fonts/giger.ttf");

        website.setTypeface(philosopher);
        pageTitle.setTypeface(giger);
        usernameTv.setTypeface(philosopher);
        emailTv.setTypeface(philosopher);
        passwordTv.setTypeface(philosopher);
        socialMediaTv.setTypeface(philosopher);

        usernameEdt.setTypeface(philosopher);
        emailEdt.setTypeface(philosopher);
        passwordEdt.setTypeface(philosopher);


        signup_btn.setTypeface(philosopher);

        topView.setAlpha(0);
        topView.setTranslationY(-200);

        triView.setAlpha(0);
        triView.setTranslationY(-200);

        logo.setVisibility(View.GONE);
        logo.setTranslationY(-200);

        website.setAlpha(0);
        website.setTranslationY(-200);

        pageTitle.setAlpha(0);
        pageTitle.setTranslationY(-200);

        signUpView.setAlpha(0);
        signUpView.setTranslationY(-400);


        topView.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();
        triView.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();
        logo.setVisibility(View.VISIBLE);
        logo.animate().translationY(0).setDuration(800).setStartDelay(500).start();
        website.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();
        pageTitle.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();
        signUpView.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent login_acivity = new Intent(signup_dark.this, login_dark.class);
                startActivity(login_acivity);
                finishAffinity();

            }
        });
    }
}

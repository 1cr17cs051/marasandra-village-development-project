package com.example.project_village;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ExamActivity extends AppCompatActivity {

    Button kcetButton;
    Button jeemainsButton;
    Button jeeadvancedButton;
    Button neetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        kcetButton = findViewById(R.id.kcet);
        jeemainsButton= findViewById(R.id.jeemain);
        jeeadvancedButton = findViewById(R.id.jeeadvanced);
        neetButton = findViewById(R.id.neet);

        kcetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamActivity.this,ExamInfoActivity.class);
                intent.putExtra("information","ಕೆ.ಸಿ.ಇ.ಟಿ: \n" );
                intent.putExtra("website"," https://cetonline.karnataka.gov.in/kea/");
                startActivity(intent);
            }
        });
        jeemainsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamActivity.this,ExamInfoActivity.class);
                intent.putExtra("information","ಜೆ.ಇ.ಇ ಮುಖ್ಯ:\n" );
                intent.putExtra("website","https://jeemain.nic.in/");
                startActivity(intent);
            }
        });
        jeeadvancedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamActivity.this,ExamInfoActivity.class);
                intent.putExtra("information","ಜೆ.ಇ.ಇ ಸುಧಾರಿತ:\n" );
                intent.putExtra("website","https://jeeadv.ac.in/");
                startActivity(intent);
            }
        });

        neetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamActivity.this,ExamInfoActivity.class);
                intent.putExtra("information","ನೀಟ್:\n" );
                intent.putExtra("website","https://ntaneet.nic.in/Ntaneet/Welcome.aspx");
                startActivity(intent);
            }
        });

    }
}

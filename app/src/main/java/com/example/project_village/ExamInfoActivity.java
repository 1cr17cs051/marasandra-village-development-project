package com.example.project_village;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ExamInfoActivity extends AppCompatActivity {

    TextView examname;
    TextView examlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_info);

        examname = findViewById(R.id.activity_exam_tag);
        examlink = findViewById(R.id.activity_exam_link);


        String information=getIntent().getExtras().getString("information");
        examname.setText(information);
        final String website=getIntent().getExtras().getString("website");
        examlink.setText(website);
    }
}

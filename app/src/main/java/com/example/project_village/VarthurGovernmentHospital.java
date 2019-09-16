package com.example.project_village;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VarthurGovernmentHospital extends AppCompatActivity {


    TextView varthuraddresstag;
    TextView varthuraddress;
    TextView varthurinfotag;
    TextView varthurinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varthur_government_hospital);

        varthuraddresstag=findViewById(R.id.activity_varthur_address_tag);
        varthuraddress=findViewById(R.id.activity_varthur_address);
        varthurinfotag=findViewById(R.id.activity_varthur_info_tag);
        varthurinfo=findViewById(R.id.activity_varthur_info);

        varthuraddresstag.setText("ವಿಳಾಸ:");
        varthuraddress.setText(R.string.varthur_location);
        varthurinfotag.setText("ಮಾಹಿತಿ:");
        varthurinfo.setText(R.string.varthur_info);


    }
}

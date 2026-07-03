package com.example.weatherapp;

import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView address, status, temp, temp_min, temp_max;
    TextView sunrise, sunset, wind, pressure, humidity;

    String CITY = "Pune";
    String API_KEY = "99a1e93a8046cf7d62d822415d22c944";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


                //address = findViewById(R.id.address);
        // = findViewById(R.id.temp);
                temp_min = findViewById(R.id.tvMin);
                temp_max = findViewById(R.id.tvMax);
        //sunrise = findViewById(R.id.sunrise);
        //sunset = findViewById(R.id.sunset);
        //wind = findViewById(R.id.wind);
        //pressure = findViewById(R.id.pressure);
        //humidity = findViewById(R.id.humidity);

        //
        }
    }

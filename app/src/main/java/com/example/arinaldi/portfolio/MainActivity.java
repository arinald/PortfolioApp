package com.example.arinaldi.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void defaultButtonClick(View v) {
        Button button = (Button) v;
        String toastText = "This button will launch my " + button.getText() + " project";
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
}

package com.example.button3;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button clickButton;
    private TextView clickNumberText;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickButton = findViewById(R.id.clickButton);
        clickNumberText = findViewById(R.id.clickNumberText);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                updateClickNumberText();
            }
        });
    }

    private void updateClickNumberText() {
        if (clickCount < 6) {
            clickNumberText.setText("This is a click number: " + clickCount);
            clickNumberText.setTextSize(10);
        } else {
            clickNumberText.setText("Enough to click. Go to new start!");
            clickNumberText.setTextColor(Color.RED);
            clickCount = 0;
        }
    }
}

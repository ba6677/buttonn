package com.example.button3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {
    public static Scanner input=new Scanner(System.in);
    Button button;
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);

    }
    public void Click(View view) {
        x=input.nextInt();
        x++;
        button.setText("This is a click number:" + x);
    }
    if(x=6){
        button.setText("Enough to click.Go to new start");
    }

}
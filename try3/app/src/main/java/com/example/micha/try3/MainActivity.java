package com.example.micha.try3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.icu.text.DisplayContext.LENGTH_SHORT;
//import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button_send_listener);
        btn.setOnClickListener(this);

        Button button = (Button) findViewById(R.id.button_send_anon);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Button 2 was clicked!!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        final EditText myEditText;
        myEditText = findViewById(R.id.plain_text_input);
        myEditText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = myEditText.getText().toString();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }

    public void onClick(View v) {
        Context context = getApplicationContext();
        CharSequence text = "Button 1 was clicked!!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void sendMessage(View v) {
        Context context = getApplicationContext();
        CharSequence text = "Button 3 was clicked!!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}

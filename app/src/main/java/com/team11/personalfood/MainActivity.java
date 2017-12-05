package com.team11.personalfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    private Button chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button testButton = findViewById(R.id.test_button);

        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                startActivity(intent);
            }
        });

        chat = findViewById(R.id.button);
    }

    public void onChatBtnClick(View view) {
        Intent intent = new Intent(getApplicationContext(),ChatActivity.class);
        startActivity(intent);
    }
}

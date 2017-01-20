package com.hfad.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    static public String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view){
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        EditText messageView = (EditText)findViewById(R.id.message);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageView.getText().toString());
        startActivity(intent);
    }
}

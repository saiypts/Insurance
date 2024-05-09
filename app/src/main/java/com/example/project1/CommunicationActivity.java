package com.example.project1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CommunicationActivity extends AppCompatActivity {

    private TextView textViewAgentName;
    private TextView textViewConversation;
    private EditText editTextMessage;
    private Button buttonSendMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);

        textViewAgentName = findViewById(R.id.textViewAgentName);
        textViewConversation = findViewById(R.id.textViewConversation);
        editTextMessage = findViewById(R.id.editTextMessage);
        buttonSendMessage = findViewById(R.id.buttonSendMessage);

        // Simulated agent data
        String agentName = "John Doe";
        String conversation = "Conversation: Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis eget arcu at velit lobortis scelerisque. Nullam vehicula, elit eget pharetra gravida, risus lorem imperdiet sem.";

        // Display agent data
        textViewAgentName.setText("Agent: " + agentName);
        textViewConversation.setText(conversation);

        buttonSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });
    }

    private void sendMessage() {
        String message = editTextMessage.getText().toString().trim();

        // Perform validation on the input field
        if (message.isEmpty()) {
            // Display an error message if the message field is empty
            Toast.makeText(this, "Please type a message", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO: Implement logic to send message to the agent
        // Example: sendToAgent(message);

        // Clear the message field after sending the message
        editTextMessage.setText("");
        // Update the conversation display (optional)
        textViewConversation.append("\nYou: " + message);
    }
}


package com.example.project1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ClaimFilingActivity extends AppCompatActivity {

    private EditText editTextPolicyNumber;
    private EditText editTextAccidentDescription;
    private EditText editTextAccidentLocation;
    private Button buttonUploadPhoto;
    private Button buttonSubmitClaim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim_filing);

        editTextPolicyNumber = findViewById(R.id.editTextPolicyNumber);
        editTextAccidentDescription = findViewById(R.id.editTextAccidentDescription);
        editTextAccidentLocation = findViewById(R.id.editTextAccidentLocation);
        buttonUploadPhoto = findViewById(R.id.buttonUploadPhoto);
        buttonSubmitClaim = findViewById(R.id.buttonSubmitClaim);

        buttonUploadPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement logic to upload photo
                // Example: openCamera();
            }
        });

        buttonSubmitClaim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitClaim();
            }
        });
    }

    private void submitClaim() {
        String policyNumber = editTextPolicyNumber.getText().toString().trim();
        String accidentDescription = editTextAccidentDescription.getText().toString().trim();
        String accidentLocation = editTextAccidentLocation.getText().toString().trim();

        // Perform validation on the input fields
        if (policyNumber.isEmpty() || accidentDescription.isEmpty() || accidentLocation.isEmpty()) {
            // Display an error message if any field is empty
            Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO: Send claim submission request to the server and handle response
    }
}


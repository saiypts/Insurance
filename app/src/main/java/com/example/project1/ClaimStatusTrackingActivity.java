package com.example.project1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ClaimStatusTrackingActivity extends AppCompatActivity {

    private TextView textViewClaimID;
    private TextView textViewClaimStatus;
    private TextView textViewClaimDetails;
    private Button buttonRefreshStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim_status_tracking);

        textViewClaimID = findViewById(R.id.textViewClaimID);
        textViewClaimStatus = findViewById(R.id.textViewClaimStatus);
        textViewClaimDetails = findViewById(R.id.textViewClaimDetails);
        buttonRefreshStatus = findViewById(R.id.buttonRefreshStatus);

        // Simulated claim data
        String claimID = "123456";
        String claimStatus = "Processing";
        String claimDetails = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

        // Display claim data
        textViewClaimID.setText("Claim ID: " + claimID);
        textViewClaimStatus.setText("Status: " + claimStatus);
        textViewClaimDetails.setText("Details: " + claimDetails);

        buttonRefreshStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refreshClaimStatus();
            }
        });
    }

    private void refreshClaimStatus() {
        // Implement logic to refresh claim status
        // Example: Fetch updated status from server
        Toast.makeText(this, "Claim status refreshed", Toast.LENGTH_SHORT).show();
    }
}

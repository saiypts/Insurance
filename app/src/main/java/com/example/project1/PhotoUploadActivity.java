package com.example.project1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PhotoUploadActivity extends AppCompatActivity {

    private static final int REQUEST_IMAGE_CAPTURE = 1;

    private Button buttonSelectPhoto;
    private ImageView imageViewSelectedPhoto;
    private Button buttonUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_upload);

        buttonSelectPhoto = findViewById(R.id.buttonSelectPhoto);
        imageViewSelectedPhoto = findViewById(R.id.imageViewSelectedPhoto);
        buttonUpload = findViewById(R.id.buttonUpload);

        buttonSelectPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchTakePictureIntent();
            }
        });

        buttonUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadPhoto();
            }
        });
    }

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            imageViewSelectedPhoto.setImageBitmap(imageBitmap);
            imageViewSelectedPhoto.setVisibility(View.VISIBLE);
            buttonUpload.setVisibility(View.VISIBLE);
        }
    }

    private void uploadPhoto() {
        // Implement logic to upload the selected photo
        // Example: uploadImageToServer();
        Toast.makeText(this, "Photo uploaded successfully", Toast.LENGTH_SHORT).show();
    }
}


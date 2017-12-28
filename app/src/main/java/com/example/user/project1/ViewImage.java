package com.example.user.project1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class ViewImage extends AppCompatActivity {

    ImageView iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        //Intent i = getIntent();
        //File f = i.getExtras().get("img");

        String f = getIntent().getExtras().getString("img");

        //Bitmap bm = BitmapFactory.decodeFile(f);

        iv2=findViewById(R.id.imageView2);
        //iv2.setImageBitmap(bm);

        if(f!=null)
        iv2.setImageURI(Uri.parse(f));
    }
}

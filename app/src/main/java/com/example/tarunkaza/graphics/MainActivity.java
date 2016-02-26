package com.example.tarunkaza.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView iv;
    Bitmap bitmap;
    Canvas canvas;
    Paint paint;
    Path path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView)findViewById(R.id.iv);
        bitmap=Bitmap.createBitmap(500,500, Bitmap.Config.ARGB_8888);
        path=new Path();
        canvas=new Canvas(bitmap);
        paint=new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        path.lineTo(0,100);
        path.lineTo(100,200);
        path.lineTo(200,0);
        canvas.drawPath(path,paint);
        canvas.drawCircle(bitmap.getWidth()/2,bitmap.getHeight()/2,10,paint);
        canvas.drawRect(550, 50, 400, 250, paint);
        canvas.drawLine(1000, 500, 350, 500, paint);
        canvas.drawOval(new RectF(bitmap.getWidth()/4, bitmap.getHeight()/4, 200 , 300), paint);
        iv.setImageBitmap(bitmap);


    }

}

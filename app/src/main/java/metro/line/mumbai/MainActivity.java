package metro.line.mumbai;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView drawingImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawingImageView = (ImageView) this.findViewById(R.id.drawingImageView);
        Bitmap bmp1 = BitmapFactory.decodeResource(this.getResources(), R.mipmap.metro_mumbai);
        drawingImageView.setImageBitmap(bmp1);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        paint.setColor(Color.GREEN);
    }

}

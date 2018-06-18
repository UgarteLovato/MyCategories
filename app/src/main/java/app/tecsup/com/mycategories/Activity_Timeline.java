package app.tecsup.com.mycategories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_Timeline extends AppCompatActivity {


    private int[] photos = {
            R.drawable.helados,
            R.drawable.chocolates,
            R.drawable.arroz,
            R.drawable.galletas,
            R.drawable.conserva,
            R.drawable.arroz,

    };
    private int index = 0;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_timeline);

        imageView = (ImageView)findViewById(R.id.imageView);
    }

    public void nextImage(View view) {
        if(++index > photos.length-1)
            index = 0;
        imageView.setImageResource(photos[index]);
    }
    public void previousImage(View view) {
        if(--index < 0)
            index = photos.length-1;
        imageView.setImageResource(photos[index]);
    }

}
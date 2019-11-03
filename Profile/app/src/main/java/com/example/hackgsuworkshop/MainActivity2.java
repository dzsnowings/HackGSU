package com.example.hackgsuworkshop;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity2 extends Activity {
    ImageView image;
    RadioButton radioButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView simpleImageView = (ImageView) findViewById(R.id.imageView);
        simpleImageView.setImageResource(R.drawable.gidle_latata);


    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radioButton:
                if(checked)
                    break;
        }
    }
}

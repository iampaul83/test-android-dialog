package com.example.iampaul83.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.afollestad.materialdialogs.MaterialDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView samsungPayButton;
    MaterialDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        samsungPayButton = findViewById(R.id.samsungpaybutton);

        samsungPayButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.samsungpaybutton:
                view.setVisibility(View.INVISIBLE);
                dialog = new MaterialDialog.Builder(this)
                    .cancelable(false)
                    .title("yoyo")
                    .content("loading")
                    .progress(true, 0)
                    .show();
                dialog.setContent("ddddd");
                break;
            default:
                break;
        }
    }
}

package com.wq.blokish;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.wq.blokish.R;

public class Help extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

//		getActionBar().setDisplayHomeAsUpEnabled(true);

        View v = findViewById(R.id.video);
        v.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://v.qq.com/x/page/z0336j9pn0z.html"))); // if device has Youtube app
                } catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://v.qq.com/x/page/z0336j9pn0z.html"))); // if not
                }
            }
        });
    }
}

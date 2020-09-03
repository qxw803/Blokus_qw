package com.wq.blokish;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import com.wq.blokish.R;

public class EndGameDialog extends Dialog {
	public EndGameDialog(final Context context, boolean redwins, String message, final int level, final int score) {
		super(context);
		setContentView( R.layout.endgame);

		getWindow().setLayout( LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		TextView tv = (TextView) findViewById(R.id.message);
		tv.setText( message);
		View b = findViewById(R.id.ok);
		b.setOnClickListener( new android.view.View.OnClickListener(){
			public void onClick(View v) {
				EndGameDialog.this.dismiss();
			}
		});
		findViewById(R.id.icons).setVisibility( redwins ? View.VISIBLE : View.GONE);
	}
}

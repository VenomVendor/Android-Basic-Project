package vee.sample.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyFirstProjectActivity extends Activity {

	// Declaration Starts here
	// we have added 3 objects EditText, Button, TextView

	EditText e;
	Button b;
	TextView t;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Connecting Objects in xml to declared Variables

		e = (EditText) findViewById(R.id.editText1); // Edittext should be
														// connected to Edittext
														// only
		b = (Button) findViewById(R.id.button1);
		t = (TextView) findViewById(R.id.textView2); // Output Should be
														// displayed below
														// Button,
														// it's id is
														// android:id="@+id/textView2"

		// On clicking the Button, fetch the values entered in Edittext
		// Store in temp string
		// display in TextView

		// type "b.seton" & Hit Ctrl+Space, then type "new" hit Ctrl+Space
		// u will get the below easily

		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// Function Goes here

				// Fetch the Values from EditText
				String temp = e.getText().toString();

				// set temp values to TextView

				t.setText(temp);

			}
		});

	}
}
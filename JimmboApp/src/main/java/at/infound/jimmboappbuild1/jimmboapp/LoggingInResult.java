package at.infound.jimmboappbuild1.jimmboapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

import at.infound.jimmboappbuild1.jimmboapp.MainActivity;

public class LoggingInResult extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging_in_result);

        Intent intent = getIntent();
        String message = intent.getStringExtra(LoggingIn.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setTextSize(24);
        textView.setText(message);

        setContentView(textView);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.result, menu);
//        return true;
//    }

}

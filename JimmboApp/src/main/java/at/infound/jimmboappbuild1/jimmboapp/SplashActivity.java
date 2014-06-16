package at.infound.jimmboappbuild1.jimmboapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;

public class SplashActivity extends Activity {

    public static final long TIME = 3000;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final ProgressBar progress = (ProgressBar) findViewById(R.id.startProgressBar);

        Thread welcomeThread = new Thread() {

            @Override
            public void run() {
                try {
                    sleep(TIME);
                } catch (Exception e) {
                    Log.e(getClass().getName(), e.toString());
                } finally {
                    ProgressBarAnimation anim = new ProgressBarAnimation(progress, 0, 3000);
                    anim.setDuration(3000);
                    progress.startAnimation(anim);
                    startActivity(new Intent(SplashActivity.this,MainActivity.class));
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}
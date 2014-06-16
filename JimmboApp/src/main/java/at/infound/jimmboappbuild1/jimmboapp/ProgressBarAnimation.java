package at.infound.jimmboappbuild1.jimmboapp;

import android.view.animation.*;
import android.widget.ProgressBar;

/**
 * Created by juliansvoboda on 12/06/14
 * with the help of a template by Eli Konky http://stackoverflow.com/questions/8035682/animate-progressbar-update-in-android
 */
public class ProgressBarAnimation extends Animation {
    private ProgressBar progressBar;
    private float from;
    private float to;

    public ProgressBarAnimation(ProgressBar progressBar, float from, float to) {
        super();
        this.progressBar = progressBar;
        this.from = from;
        this.to = to;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float value = from + (to - from) * interpolatedTime;
        progressBar.setProgress((int) value);
    }
}

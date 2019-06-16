package vite.kike.vibrato;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton b = (ToggleButton) findViewById(R.id.toggleButton);

        final Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        final long[] pattern = {0, 10000, 0};

        b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    v.vibrate(pattern, 0);
                } else {
                    v.cancel();
                }
            }
        });

    }
}

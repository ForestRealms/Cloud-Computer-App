package cloud.computer.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class introductoryActivity extends AppCompatActivity {
    ImageView background,icon,text;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);
        icon = findViewById(R.id.icon);
        background = findViewById(R.id.background);
        text = findViewById(R.id.text);
        lottieAnimationView = findViewById(R.id.lottie);

        background.animate().translationY(-2600).setDuration(1000).setStartDelay(8000);
        text.animate().translationY(1600).setDuration(1000).setStartDelay(8000);
        icon.animate().translationY(1600).setDuration(1000).setStartDelay(8000);
        lottieAnimationView.animate().translationY(1600).setDuration(1000).setStartDelay(8000);

    }
}
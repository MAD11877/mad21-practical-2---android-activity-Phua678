package sg.edu.np.mad.practical2_mad_phuachengann;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User newuser = new User("Phua Cheng Ann", "I am a Financial Infomatic Student!", 10203193, false);
        Button fbutton = findViewById(R.id.FollowUnFollowButton);
        if (newuser.followed == true)
        {
            fbutton.setText("Unfollow");
            newuser.followed = false;
        }
        else if(newuser.followed == false)
        {
            fbutton.setText("Follow");
            newuser.followed = true;
        }
    }
}


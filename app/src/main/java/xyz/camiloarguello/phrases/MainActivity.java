package xyz.camiloarguello.phrases;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void playSound(View view){
        int id = view.getId();

        String ourID = view.getResources().getResourceEntryName(id);
        int resourceID = getResources().getIdentifier(ourID, "raw","xyz.camiloarguello.phrases");

        mediaPlayer = MediaPlayer.create(this, resourceID);
        mediaPlayer.start();

        if(mediaPlayer.isPlaying()){
            view.setAlpha(.8f);
        }
    }
}

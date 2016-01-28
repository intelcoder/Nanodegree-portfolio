package com.example.fiddlest.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button spotify,superDuoBtn,libraryBtn,buildBiggerBtn,capstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spotify =(Button)findViewById(R.id.spotifyBtn);
        superDuoBtn = (Button) findViewById(R.id.superDuoBtn);
        libraryBtn = (Button) findViewById(R.id.libraryBtn);
        buildBiggerBtn = (Button) findViewById(R.id.buildItBiggerBtn);
        capstoneBtn= (Button) findViewById(R.id.capstoneApp);


        spotify.setOnClickListener(this);
        superDuoBtn.setOnClickListener(this);
        libraryBtn.setOnClickListener(this);
        buildBiggerBtn.setOnClickListener(this);
        capstoneBtn.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        Context context = getApplicationContext();
        switch(v.getId()){
            case R.id.spotifyBtn:
                Toast.makeText(context,"This button will launch my spotify streamer app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.libraryBtn:
                Toast.makeText(MainActivity.this, "This button will launch my library app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.superDuoBtn:
                Toast.makeText(MainActivity.this, "This button will launch my super duo app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buildItBiggerBtn:
                Toast.makeText(MainActivity.this, "This button will launch my build it bigger app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstoneApp:
                Toast.makeText(MainActivity.this, "This button will launch my capstome app!", Toast.LENGTH_SHORT).show();
        }

    }
}

package jpdeveloper.srru.ac.th.appsrru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jpdeveloper.srru.ac.th.appsrru.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add Fragment (shift + command + enter)
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment,new MainFragment())
                    .commit();

        }



    } // Main Method

}  //Main Class

package com.example.dell.fragmentapplication;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ViewPager vP;
    private static final String FRAG_TAG = "frag_tag";
    BottomNavigationView bV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vP = findViewById(R.id.viewpager);
        bV=findViewById(R.id.bNV);

        MyViewPagerAdapter myViewPagerAdapter =new MyViewPagerAdapter(getSupportFragmentManager());
        vP.setAdapter(myViewPagerAdapter);
        vP.setCurrentItem(0);

        bV.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case  R.id.Home:  vP.setCurrentItem(0);
                    return true;
                    case R.id.Help: vP.setCurrentItem(1);
                    return true;
                    case R.id.Shop: vP.setCurrentItem(2);
                    return true;
                    default: return false;
                }
            }
        });

    }





//    public void addHandler(View view) {
//       Fragment1 fra1 = new Fragment1();
//
//        getSupportFragmentManager()
//                .beginTransaction()
//                .addToBackStack(null)
//                .add(R.id.fragmentContainer,fra1,FRAG_TAG)
//                .commit();
//    }
//

    public void remHandler(View view) {

        Fragment fra=getSupportFragmentManager()
                .findFragmentByTag(FRAG_TAG);

        if (fra!=null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fra)
                    .commit();
        }
    }

//    public void repHandler(View view) {
//        Fragment2 fragment2 = new Fragment2();
//
//        getSupportFragmentManager()
//                .beginTransaction()
//                .addToBackStack(null)
//                .replace(R.id.fragmentContainer,fragment2,FRAG_TAG)
//                .commit();
//    }
}

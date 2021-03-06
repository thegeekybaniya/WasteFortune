package in.thegeekybaniya.wastefortune;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

    BottomBar bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomBar = (BottomBar) findViewById(R.id.bottomBar);

        bottomBar.setOnTabSelectListener(
                new OnTabSelectListener() {
                    @Override
                    public void onTabSelected(@IdRes int tabId) {
                        if(tabId==R.id.tab_account){
                            AccountFragment f = new AccountFragment();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                        }else if(tabId==R.id.tab_donate){
                            DonateFragment f = new DonateFragment();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                        }else if(tabId==R.id.tab_home){
                            HomeFragment f = new HomeFragment();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                        }
                    }
                }
        );



    }
}

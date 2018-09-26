package ktsquares.com.restaurant_automation;

import android.app.FragmentTransaction;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToLogin();

    }
    private void goToLogin(){

        Fragment login_f = new Login_fragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.login,login_f);
        ft.commit();
    }

}

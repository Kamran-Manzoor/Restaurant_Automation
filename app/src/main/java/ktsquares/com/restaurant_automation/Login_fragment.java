package ktsquares.com.restaurant_automation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Tahir Raza on 17/09/2018.
 */

public class Login_fragment extends Fragment {

    EditText phone,pass;
    Button login;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.new_login, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view){
        phone = (EditText)view.findViewById(R.id.et_login_phone);
        pass = (EditText)view.findViewById(R.id.et_login_password);
        login = (Button) view.findViewById(R.id.btn_login);

    }

}




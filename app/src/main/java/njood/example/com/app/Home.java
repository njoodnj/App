package njood.example.com.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends Activity {

    String name, password, email, Err;
    TextView nameTV, emailTV, passwordTV, welcomeTV, err;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        nameTV = (TextView) findViewById(R.id.home_name);
        passwordTV = (TextView) findViewById(R.id.home_password);

        err = (TextView) findViewById(R.id.err);

        name = getIntent().getStringExtra("name");
        password = getIntent().getStringExtra("password");
        email = getIntent().getStringExtra("email");
        Err = getIntent().getStringExtra("err");

        welcomeTV.setText("name"+name);
        nameTV.setText("name: "+name);
        passwordTV.setText("password: "+password);
        emailTV.setText("email: "+email);
        err.setText(Err);
    }
}

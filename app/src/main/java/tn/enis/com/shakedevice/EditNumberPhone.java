package tn.enis.com.shakedevice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class EditNumberPhone extends AppCompatActivity {
    private int editTextNumberPhone ;
    private Intent intent;
    public final static String EXTRA_MESSAGE="com.enis.shakeDevice.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_number_phone);
    }

    public void register(View view){
        Log.d("activity ","EditNumberPhone activity is active now");
       editTextNumberPhone = Integer.parseInt(String.valueOf(((EditText)findViewById(R.id.editText_numPhone)).getText()));
        Log.d("editTextNumberPhone ","the number is "+editTextNumberPhone);
        intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_MESSAGE,""+editTextNumberPhone);
        startActivity(intent);

    }
}

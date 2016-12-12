package tn.enis.com.shakedevice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent ;
    private static int numberPhone=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("activity "," MainActivity is active now");

            Intent intentEditNumberPhone = getIntent();

            String str = intentEditNumberPhone.getStringExtra(EditNumberPhone.EXTRA_MESSAGE);


        try {

            numberPhone = Integer.parseInt(str);


        }catch (Exception ex){

            ex.printStackTrace();
            Log.d("numberPhone "," your number phone is null check the number ");
        }

            Log.d("activity ","MainActivity is active now");
            Log.d("numberPhone "," your number phone is "+numberPhone);


        }



    public void startService(View view){
        intent = new Intent(this, MyService.class);
        //Start Service
        startService(intent);
    }

    public void stopService(View view){
        intent = new Intent(this, MyService.class);
        //Stop Service
        stopService(intent);
    }
    public void editNumberPhone(View view){
        intent = new Intent(this, EditNumberPhone.class);
        startActivity(intent);

    }
}

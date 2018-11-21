package cosc341.ubco.ngkat.tracking;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Tracking2 extends AppCompatActivity {

    Alerts alerts = new Alerts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking2);

        LinearLayout LL = findViewById(R.id.layoutL);
        TextView nameFood =  findViewById(R.id.textViewName);

        //to change
        nameFood.setText("Chicken n Rice");

        for(int i = 0; i < LL.getChildCount(); i++){
            Integer id = LL.getChildAt(i).getId();
            TextView tV = findViewById(id);
            tV.setBackgroundColor(Color.parseColor("#006969"));
        }

        int target = 0; // 0 =  buying , 1 = selling, 2 = delivery

        // DEMO for Buying
        switch(target){
            case 0:
                buying(LL);
                break;
        }
    }

    protected void buying(LinearLayout LL){
        for(int i = LL.getChildCount()-1; i > 0; i--){
            Integer id = LL.getChildAt(i).getId();
            TextView tV = findViewById(id);
            tV.setBackgroundColor(Color.parseColor("#420420"));
            tV.setTextColor(Color.parseColor("#FFFFFF"));
        }

        Boolean done = alerts.AlertDeliver(this);
        if (done == true){
            Integer id = LL.getChildAt(LL.getChildCount()-1).getId();
            TextView tV = findViewById(id);
            tV.setBackgroundColor(Color.parseColor("#420420"));
            tV.setTextColor(Color.parseColor("#FFFFFF"));
        }
    }

    protected void selling(LinearLayout LL){

    }

}

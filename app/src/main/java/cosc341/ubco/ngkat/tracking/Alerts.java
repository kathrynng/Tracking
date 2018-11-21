package cosc341.ubco.ngkat.tracking;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

public class Alerts {
    Boolean done;
    public boolean AlertDeliver(Context context){
        done = false;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(true);
        builder.setTitle("Delivered");
        builder.setMessage("Has the order been delivered?");
        builder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        done = true;
                    }
                });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                done = false;
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
        return done;
    }

}

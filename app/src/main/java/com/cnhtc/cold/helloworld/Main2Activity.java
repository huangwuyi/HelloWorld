package com.cnhtc.cold.helloworld;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements DialogInterface{

    private Button buttonShowAlert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonShowAlert= (Button) findViewById(R.id.buttonShowAlertDialog);
        buttonShowAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog=new AlertDialog.Builder(Main2Activity.this).create();
                alertDialog.setTitle("这是一个Alert的标题");
                alertDialog.setMessage("这是一个Alert的内容");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "确定", new OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.out.println(dialog.getClass());
                        System.out.println(which);
                    }
                });
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "取消", new OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.out.println(dialog.getClass());
                        System.out.println(which);
                    }
                });
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "应该是中间的键", new OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.out.println(dialog.getClass());
                        System.out.println(which);
                    }
                });
                alertDialog.show();
            }
        });

    }

    @Override
    public void cancel() {

    }

    @Override
    public void dismiss() {

    }
}

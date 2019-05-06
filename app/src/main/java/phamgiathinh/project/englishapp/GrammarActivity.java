package phamgiathinh.project.englishapp;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class GrammarActivity extends AppCompatActivity {
    private ImageView bai1;
    private ImageView bai2;
    private ImageView bai3;
    private ImageView bai4;
    private ImageView bai5;
    private ImageView bai6;
    private ImageView bai7;
    private ImageView bai8;
    private ImageView bai9;
    private ImageView bai10;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_grammer);

        bai1=findViewById(R.id.iVBai1);
        bai2=findViewById(R.id.iVBai2);
        bai3=findViewById(R.id.iVBai3);
        bai4=findViewById(R.id.iVBai4);
        bai5=findViewById(R.id.iVBai5);
        bai6=findViewById(R.id.iVBai6);
        bai7=findViewById(R.id.iVBai7);
        bai8=findViewById(R.id.iVBai8);
        bai9=findViewById(R.id.iVBai9);
        bai10=findViewById(R.id.iVBai10);

        bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFragment message=new MyDialogFragment();
                message.show(getSupportFragmentManager(),"MyDialogFragment");
            }
        });
        bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFragment message=new MyDialogFragment();
                message.show(getSupportFragmentManager(),"MyDialogFragment");
            }
        });
        bai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFragment message=new MyDialogFragment();
                message.show(getSupportFragmentManager(),"MyDialogFragment");
            }
        });
        bai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFragment message=new MyDialogFragment();
                message.show(getSupportFragmentManager(),"MyDialogFragment");
            }
        });
        bai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFragment message=new MyDialogFragment();
                message.show(getSupportFragmentManager(),"MyDialogFragment");
            }
        });
        bai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFragment message=new MyDialogFragment();
                message.show(getSupportFragmentManager(),"MyDialogFragment");
            }
        });
        bai7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFragment message=new MyDialogFragment();
                message.show(getSupportFragmentManager(),"MyDialogFragment");
            }
        });
        bai8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFragment message=new MyDialogFragment();
                message.show(getSupportFragmentManager(),"MyDialogFragment");
            }
        });
        bai9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFragment message=new MyDialogFragment();
                message.show(getSupportFragmentManager(),"MyDialogFragment");
            }
        });
        bai10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFragment message=new MyDialogFragment();
                message.show(getSupportFragmentManager(),"MyDialogFragment");
            }
        });

    }
}

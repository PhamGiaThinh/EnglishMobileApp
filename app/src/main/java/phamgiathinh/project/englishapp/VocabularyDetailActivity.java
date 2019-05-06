package phamgiathinh.project.englishapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class VocabularyDetailActivity extends AppCompatActivity {
    Switch anAnh;
    Switch anViet;
    TextView tvAnh1;
    TextView tvAnh2;
    TextView tvAnh3;
    TextView tvAnh4;
    TextView tvAnh5;
    TextView tvAnh6;
    TextView tvViet1;
    TextView tvViet2;
    TextView tvViet3;
    TextView tvViet4;
    TextView tvViet5;
    TextView tvViet6;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vocabularydetail);

        anAnh=findViewById(R.id.switchAnh);
        anViet=findViewById(R.id.switchViet);
        tvAnh1=findViewById(R.id.textView3);
        tvAnh2=findViewById(R.id.textView12);
        tvAnh3=findViewById(R.id.textView8);
        tvAnh4=findViewById(R.id.textView16);
        tvAnh5=findViewById(R.id.textView11);
        tvAnh6=findViewById(R.id.textView14);
        tvViet1=findViewById(R.id.textView4);
        tvViet2=findViewById(R.id.textView7);
        tvViet3=findViewById(R.id.textView9);
        tvViet4=findViewById(R.id.textView6);
        tvViet5=findViewById(R.id.textView10);
        tvViet6=findViewById(R.id.textView13);

        anAnh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(anAnh.isChecked()){
                    tvAnh1.setVisibility(View.INVISIBLE);
                    tvAnh2.setVisibility(View.INVISIBLE);
                    tvAnh3.setVisibility(View.INVISIBLE);
                    tvAnh4.setVisibility(View.INVISIBLE);
                    tvAnh5.setVisibility(View.INVISIBLE);
                    tvAnh6.setVisibility(View.INVISIBLE);
                }else {
                    tvAnh1.setVisibility(View.VISIBLE);
                    tvAnh2.setVisibility(View.VISIBLE);
                    tvAnh3.setVisibility(View.VISIBLE);
                    tvAnh4.setVisibility(View.VISIBLE);
                    tvAnh5.setVisibility(View.VISIBLE);
                    tvAnh6.setVisibility(View.VISIBLE);
                }
            }
        });
        anViet.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(anViet.isChecked()){
                    tvViet1.setVisibility(View.INVISIBLE);
                    tvViet2.setVisibility(View.INVISIBLE);
                    tvViet3.setVisibility(View.INVISIBLE);
                    tvViet4.setVisibility(View.INVISIBLE);
                    tvViet5.setVisibility(View.INVISIBLE);
                    tvViet6.setVisibility(View.INVISIBLE);
                }else {
                    tvViet1.setVisibility(View.VISIBLE);
                    tvViet2.setVisibility(View.VISIBLE);
                    tvViet3.setVisibility(View.VISIBLE);
                    tvViet4.setVisibility(View.VISIBLE);
                    tvViet5.setVisibility(View.VISIBLE);
                    tvViet6.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}

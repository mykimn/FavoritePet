package minyoung9913.kr.hs.emirim.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    CheckBox checkSelect;
    RadioGroup rg;
    TextView textQuest;
    RadioButton radioDog, radioHamster, radioRabbit;
    Button butOk;
    ImageView imgvPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect = (CheckBox)findViewById(R.id.check_select);
        rg = (RadioGroup)findViewById(R.id.rg);
        textQuest = (TextView)findViewById(R.id.text_question);
        radioDog = (RadioButton)findViewById(R.id.radio_dog);
        radioHamster = (RadioButton)findViewById(R.id.radio_hamster);
        radioRabbit = (RadioButton)findViewById(R.id.radio_rabbit);
        butOk = (Button)findViewById(R.id.but_ok);
        imgvPet = (ImageView)findViewById(R.id.imgv_pet);
        checkSelect.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(checkSelect.isChecked()){
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butOk.setVisibility(View.VISIBLE);
            imgvPet.setVisibility(View.VISIBLE);

        }else{
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butOk.setVisibility(View.INVISIBLE);
            imgvPet.setVisibility(View.INVISIBLE);
        }
    }
}

package com.rbdevv.calc.ptwister;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.text.format.Time;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class twister extends Activity{
    /** Called when the activity is first created. */

    public static int [][] BaseStats = new int [][] {{45,60,80,39,58,78,44,59,79,45,50,60,40,45,65,40,63,83,30,55,40,65,35,60,35,60,50,75,55,70,90,46,61,81,70,95,38,73,115,140,40,75,45,60,75,35,60,60,70,10,35,40,65,50,80,40,65,55,90,40,65,90,25,40,55,70,80,90,50,65,80,40,80,40,55,80,50,65,90,95,25,50,52,35,60,65,90,80,105,30,50,30,45,60,35,60,85,30,55,40,60,60,95,50,60,50,50,90,40,65,80,105,250,65,105,30,55,45,80,30,60,40,70,65,65,65,65,75,20,95,130,48,55,130,65,65,65,35,70,30,60,80,160,90,90,90,41,61,91,106,100,45,60,80,39,58,78,50,65,85,35,85,60,100,40,55,40,70,85,75,125,20,50,90,35,55,40,65,55,70,90,75,70,100,70,90,35,55,75,55,30,75,65,55,95,65,95,60,95,60,48,190,70,50,75,100,65,75,60,90,65,70,20,80,55,60,90,40,50,50,100,55,35,75,45,65,65,45,75,75,90,90,85,73,55,35,50,45,45,45,95,255,90,115,100,50,70,100,106,106,100,40,50,70,45,60,80,50,70,100,35,70,38,78,45,50,60,50,60,40,60,80,40,70,90,40,60,40,60,28,38,68,40,70,60,60,60,80,150,31,61,1,64,84,104,72,144,50,30,50,70,50,50,50,60,70,30,60,40,70,60,60,65,65,50,70,100,45,70,130,170,60,70,70,60,80,60,45,50,80,50,70,45,75,73,73,70,70,50,110,43,63,40,60,66,86,45,75,20,95,70,60,44,64,20,40,99,65,65,95,50,80,70,90,110,35,55,55,100,43,45,65,95,40,60,80,80,80,80,80,80,100,100,105,100,50,55,75,95,44,64,76,53,64,84,40,55,85,59,79,37,77,45,60,80,40,60,67,97,30,60,40,60,70,30,70,60,55,85,45,70,76,111,75,90,150,55,65,60,100,49,71,45,63,103,57,67,50,20,100,76,50,58,68,108,135,40,70,68,108,40,70,48,83,74,49,69,45,60,90,70,70,110,115,100,75,75,85,86,65,65,75,110,85,68,60,45,70,50,75,80,75,100,90,91,110,150,120,80,100,70,100,120},{49,62,82,52,64,84,48,63,83,30,20,45,35,25,80,45,60,80,56,81,60,90,60,85,55,90,75,100,47,62,82,57,72,92,45,70,41,76,45,70,45,80,50,65,80,70,95,55,65,55,80,45,70,52,82,80,105,70,110,50,65,85,20,35,50,80,100,130,75,90,105,40,70,80,95,110,85,100,65,75,35,60,65,85,110,45,70,80,105,65,95,35,50,65,45,48,73,105,130,30,50,40,95,50,80,120,105,55,65,90,85,130,5,55,95,40,65,67,92,45,75,45,110,50,83,95,125,100,10,125,85,48,55,65,65,130,60,40,60,80,115,105,110,85,90,100,64,84,134,110,100,49,62,82,52,64,84,65,80,105,46,76,30,50,20,35,60,90,90,38,58,40,25,30,20,40,50,75,40,55,75,80,20,50,100,75,35,45,55,70,30,75,65,45,85,65,65,85,75,60,72,33,80,65,90,70,75,85,80,120,95,130,10,125,95,80,130,40,50,50,100,55,65,105,55,40,80,60,90,95,60,120,80,95,20,35,95,30,63,75,80,10,85,115,75,64,84,134,90,130,100,45,65,85,60,85,120,70,85,110,55,90,30,70,45,35,70,35,50,30,50,70,40,70,100,55,85,30,50,25,35,65,30,60,40,130,60,80,160,45,90,90,51,71,91,60,120,20,45,45,65,75,85,70,90,110,40,60,45,75,50,40,73,47,60,43,73,90,120,70,90,60,100,85,25,45,60,100,70,100,85,115,40,70,115,100,55,95,48,78,80,120,40,70,41,81,95,125,15,60,70,90,75,115,40,70,68,50,130,23,50,80,40,60,80,64,104,84,90,30,75,95,135,55,75,135,100,50,75,80,90,100,150,150,100,150,68,89,109,58,78,104,51,66,86,55,75,120,45,85,25,85,65,85,120,30,70,125,165,42,52,29,59,94,30,80,45,65,105,35,60,48,83,100,50,80,66,76,60,125,55,82,30,63,93,24,89,80,25,5,65,92,70,90,130,85,70,110,72,112,50,90,61,106,100,49,69,20,62,92,120,70,85,140,100,123,95,50,76,110,60,95,130,80,125,55,100,80,50,75,105,125,120,120,90,160,100,70,80,100,90,100,120},{49,63,83,43,58,78,65,80,100,35,55,50,30,50,40,40,55,75,35,60,30,65,44,69,30,55,85,110,52,67,87,40,57,77,48,73,40,75,20,45,35,70,55,70,85,55,80,50,60,25,50,35,60,48,78,35,60,45,80,40,65,95,15,30,45,50,70,80,35,50,65,35,65,100,115,130,55,70,65,110,70,95,55,45,70,55,80,50,75,100,180,30,45,60,160,45,70,90,115,50,70,80,85,95,110,53,79,75,95,120,95,120,5,115,80,70,95,60,65,55,85,65,80,35,57,57,100,95,55,79,80,48,50,60,60,60,70,100,125,90,105,65,65,100,85,90,45,65,95,90,100,65,80,100,43,58,78,64,80,100,34,64,30,50,30,50,40,70,80,38,58,15,28,15,65,85,45,70,40,55,75,85,50,80,115,75,40,50,70,55,30,55,45,45,85,60,110,42,80,60,48,58,65,90,140,70,105,200,50,75,75,100,230,75,55,50,75,40,120,40,80,85,35,75,45,70,140,30,50,95,60,120,90,62,35,35,95,15,37,37,105,10,75,85,115,50,70,110,130,90,100,35,45,65,40,60,70,50,70,90,35,70,41,61,35,55,50,55,70,30,50,70,50,40,60,30,60,30,100,25,35,65,32,62,60,80,60,80,100,90,45,45,23,43,63,30,60,40,135,45,65,75,85,100,140,180,55,75,40,60,40,50,55,55,45,53,83,20,40,35,45,40,70,140,35,65,60,45,50,80,40,60,60,90,60,60,65,85,43,73,65,85,55,105,77,97,50,100,20,79,70,70,35,65,90,130,83,70,60,48,50,80,50,70,90,85,105,105,130,55,60,100,80,80,100,130,200,100,150,90,80,90,140,90,100,50,64,85,105,44,52,71,53,68,88,30,50,70,40,60,41,51,34,49,79,35,55,40,60,118,168,45,85,50,42,102,70,35,55,45,70,48,68,66,34,44,44,84,60,52,42,64,50,47,67,86,116,95,45,5,45,108,45,65,95,40,40,70,78,118,90,110,40,65,72,56,76,50,50,75,65,115,95,130,125,67,67,95,86,130,110,125,80,70,65,145,135,70,77,130,105,70,120,100,106,110,120,120,80,100,90,100,120},{65,80,100,60,80,109,50,65,85,20,25,80,20,25,45,35,50,70,25,50,31,61,40,65,50,90,20,45,40,55,75,40,55,85,60,85,50,81,45,75,30,65,75,85,100,45,60,40,90,35,50,40,65,65,95,35,60,70,100,40,50,70,105,120,135,35,50,65,70,85,100,50,80,30,45,55,65,80,40,100,95,120,58,35,60,45,70,40,65,45,85,100,115,130,30,43,73,25,50,55,80,60,125,40,50,35,35,60,60,85,30,45,35,100,40,70,95,35,65,70,100,100,55,115,95,100,55,40,15,60,85,48,45,110,110,95,85,90,115,55,65,60,65,95,125,125,50,70,100,154,100,49,63,83,60,80,109,44,59,79,35,45,36,76,40,55,40,60,70,56,76,35,45,40,40,80,70,95,65,80,115,90,20,50,30,90,35,45,55,40,30,105,75,25,65,130,60,85,100,85,72,33,90,35,60,65,35,55,40,60,55,55,10,40,35,50,75,70,80,30,60,65,65,105,65,80,40,80,110,95,40,60,105,85,20,35,35,85,65,70,40,75,115,90,90,45,65,95,90,110,100,65,85,105,70,85,110,50,60,85,30,60,30,50,20,25,90,25,50,40,60,90,30,60,90,30,50,55,85,45,65,125,50,80,40,60,35,55,95,30,50,30,51,71,91,20,40,20,45,35,55,65,55,40,50,60,40,60,65,105,85,75,47,73,100,43,73,65,95,70,90,65,105,85,70,90,60,45,50,80,85,115,40,70,60,100,95,55,46,76,50,90,40,70,61,81,40,70,10,100,70,60,63,83,30,60,72,95,75,23,50,80,55,75,95,74,94,114,45,40,40,60,110,35,55,95,50,100,75,110,130,150,100,150,100,150,45,55,75,58,78,104,61,81,111,30,40,50,35,55,25,55,40,60,95,50,125,30,65,42,47,29,79,94,30,80,45,60,85,62,87,57,92,60,60,90,44,54,105,105,42,64,65,41,71,24,79,10,70,15,92,92,40,50,80,40,35,115,38,68,30,60,61,86,90,49,69,60,62,92,45,130,80,55,110,95,125,120,116,60,130,45,70,135,65,75,65,80,95,75,105,125,150,150,130,80,100,75,80,100,135,100,120},{65,80,100,50,65,85,64,80,105,20,25,80,20,25,80,35,50,70,35,70,31,61,54,79,40,80,30,55,40,55,85,40,55,75,65,90,65,100,25,50,40,75,65,75,90,55,80,55,75,45,70,40,65,50,80,45,70,50,80,40,50,90,55,70,85,35,60,85,30,45,60,100,120,30,45,65,65,80,40,80,55,70,62,35,60,70,95,50,100,25,45,35,55,75,45,90,115,25,50,55,80,45,65,50,80,110,110,75,45,70,30,45,105,40,80,25,45,50,80,55,85,120,80,95,85,85,70,70,20,100,95,48,65,95,95,110,75,55,70,45,70,75,110,125,90,85,50,70,100,90,100,65,80,100,50,65,85,48,63,83,45,55,56,96,80,110,40,60,80,56,76,35,55,20,65,105,45,70,45,60,90,100,50,80,65,100,55,65,85,55,30,85,45,25,65,95,130,42,110,85,48,58,65,35,60,65,65,65,40,60,55,80,230,95,75,50,75,40,80,30,60,85,35,75,45,140,70,50,80,95,40,60,95,65,45,35,110,65,55,55,70,135,100,75,115,50,70,100,154,154,100,55,65,85,50,60,70,50,70,90,30,60,41,61,30,25,50,25,90,50,70,100,30,40,60,30,50,30,70,35,55,115,52,82,60,60,35,55,65,30,50,30,23,43,63,30,60,40,90,35,55,65,55,40,50,60,55,75,40,60,75,85,75,75,80,53,83,20,40,35,45,45,75,70,80,110,60,45,50,80,40,60,75,105,60,60,85,65,41,71,35,55,70,120,87,107,50,80,55,125,70,120,33,63,90,130,87,80,60,48,50,80,50,70,90,55,75,75,65,65,30,50,80,60,80,90,100,200,150,130,110,140,90,90,100,50,55,65,85,44,52,71,56,76,101,30,40,50,40,60,41,51,34,49,79,70,105,30,50,88,138,45,105,50,42,102,90,30,50,53,78,62,82,66,44,54,56,96,105,52,37,59,50,41,61,86,116,45,90,65,42,108,45,55,85,85,40,70,42,72,55,75,40,65,72,61,86,120,60,85,85,90,95,55,50,85,95,115,56,65,95,75,60,75,115,150,135,70,77,130,105,70,100,120,106,110,120,130,80,100,90,100,120},{45,60,80,65,80,100,43,58,78,45,30,70,50,35,75,56,71,91,72,97,70,100,55,80,90,100,40,65,41,56,76,50,65,85,35,60,65,100,20,45,55,90,30,40,50,25,30,45,90,95,120,90,115,55,85,70,95,60,95,90,90,70,90,105,120,35,45,55,40,55,70,70,100,20,35,45,90,105,15,30,45,70,60,75,100,45,70,25,50,40,70,80,95,110,70,42,67,50,75,100,140,40,55,35,45,87,76,30,35,60,25,40,50,60,90,60,85,63,68,85,115,90,105,95,105,93,85,110,80,81,60,48,55,65,130,65,40,35,55,55,80,130,30,85,100,90,50,70,80,130,100,45,60,80,65,80,100,43,58,78,20,90,50,70,55,85,30,40,130,67,67,60,15,15,20,40,70,95,35,45,55,50,40,50,30,70,50,80,110,85,30,30,95,15,35,110,65,91,30,85,48,33,85,15,40,45,85,30,30,45,85,65,5,85,115,40,55,20,30,50,50,35,65,45,75,70,70,65,95,85,40,50,60,85,75,35,70,65,95,83,100,55,115,100,85,41,51,61,110,90,100,70,95,120,45,55,80,40,50,60,35,70,60,100,20,15,65,15,65,30,50,70,30,60,80,85,125,85,65,40,50,80,65,60,35,70,30,90,100,40,160,40,28,48,68,25,50,20,30,50,70,50,50,30,40,50,60,80,65,105,95,95,85,85,65,40,55,65,95,60,60,35,40,20,60,80,60,10,70,100,35,55,50,80,90,65,70,70,60,60,35,55,55,75,23,43,75,45,80,81,70,40,45,65,25,25,51,65,75,23,50,80,25,45,65,32,52,52,55,97,50,50,100,30,50,70,50,50,50,110,110,90,90,95,100,150,31,36,56,61,81,108,40,50,60,60,80,100,31,71,25,65,45,60,70,55,90,58,58,30,30,36,36,66,70,40,95,85,115,35,85,34,39,115,70,80,85,105,105,71,85,112,45,74,84,23,33,10,60,30,91,35,42,82,102,5,60,90,32,47,65,95,50,85,46,66,91,50,40,60,125,60,50,40,50,95,83,80,95,95,65,95,80,90,80,40,45,110,91,95,80,115,90,100,77,100,90,85,80,100,125,100,120}};
    public static double [][] NatureMult = new double [][] {{ 1.1, 1, .9, 1, 1 },{ 1, 1, 1, 1, 1 },{ .9, 1.1, 1, 1, 1 },{ 1.1, 1, 1, 1, .9 },{ .9, 1, 1, 1.1, 1 },{ 1, 1, .9, 1.1, 1 },{ 1, 1, 1, 1, 1 },{ 1, .9, 1, 1.1, 1 },{ 1, 1, 1, 1, 1 },{ 1, .9, 1, 1, 1.1 },{ 1, 1.1, .9, 1, 1 },{ 1, 1, .9, 1, 1.1 },{ 1, 1.1, 1, .9, 1 },{ 1.1, .9, 1, 1, 1 },{ 1, .9, 1.1, 1, 1 },{ .9, 1, 1.1, 1, 1 },{ 1, 1, 1, .9, 1.1 },{ 1.1, 1, 1, .9, 1 },{ 1, 1, 1.1, 1, .9 },{ 1, 1, 1, 1, 1 },{ 1, 1, 1.1, .9, 1 },{ 1, 1.1, 1, 1, .9 },{ 1, 1, 1, 1.1, .9 },{ 1, 1, 1, 1, 1 },{ .9, 1, 1, 1, 1.1 }};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        String[] Natures={"Nature", "Adamant", "Bashful", "Bold", "Brave", "Calm", "Careful", "Docile", "Gentle", "Hardy", "Hasty", "Impish", "Jolly", "Lax", "Lonely", "Mild", "Modest", "Naive", "Naughty", "Quiet", "Quirky", "Rash", "Relaxed", "Sassy", "Serious", "Timid"};
        String[] Characteristics= {"Characteristic", "A little quick-tempered", "Alert to sounds", "Capable of taking hits", "Good endurance", "Good perseverence", "Hates to lose", "Highly curious", "Highly persistent", "Impetuous and silly", "Likes to fight", "Likes to relax", "Likes to run", "Likes to thrash about", "Loves to eat", "Mischievous", "Often dozes off", "Often lost in   thought", "Often scatters things", "Proud of its power", "Quick tempered", "Quick to flee", "Scatters things often", "Somewhat of a clown", "Somewhat stubborn", "Somewhat vain", "Strong willed", "Strongly defiant", "Sturdy body", "Thoroughly Cunning", "Very finicky"};
                
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button fillTimeButton = (Button) findViewById(R.id.AutoFillTime);
        fillTimeButton.setOnClickListener(new OnClickListener() {
        	@Override
			public void onClick(View v) {
        		fillTime();
        	}
        });
        
        Button CalculateButton = (Button) findViewById(R.id.Calculate);
        CalculateButton.setOnClickListener(new OnClickListener() {
        	@Override
			public void onClick(View v) {
        		EditText PokedexNoBox = (EditText) findViewById(R.id.PokedexNoBox);
        		EditText LevelBox = (EditText) findViewById(R.id.LevelBox);
        		EditText HPBox = (EditText) findViewById(R.id.HPBox);
        		EditText ATBox = (EditText) findViewById(R.id.AttackBox);
        		EditText DFBox = (EditText) findViewById(R.id.DefenseBox);
        		EditText SABox = (EditText) findViewById(R.id.SpecialAttackBox);
        		EditText SDBox = (EditText) findViewById(R.id.SpecialDefenseBox);
        		EditText SPBox = (EditText) findViewById(R.id.SpeedBox);
        		Spinner NaturePicker = (Spinner) findViewById(R.id.NaturePicker);
        		
        		if (PokedexNoBox.getText().toString().length()!=0 && LevelBox.getText().toString().length()!=0 && HPBox.getText().toString().length()!=0 && ATBox.getText().toString().length()!=0 && DFBox.getText().toString().length()!=0 && SABox.getText().toString().length()!=0 && SDBox.getText().toString().length()!=0 && SPBox.getText().toString().length()!=0 && NaturePicker.getLastVisiblePosition()!=0){
        		HandOffInput();
        		}
        	}
        });
        
        
        
        
        Spinner NaturePicker = (Spinner) findViewById(R.id.NaturePicker);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Natures);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        NaturePicker.setAdapter(aa);
        
        Spinner CharacteristicPicker = (Spinner) findViewById(R.id.CharacteristicPicker);
        ArrayAdapter<String> bb = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Characteristics);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CharacteristicPicker.setAdapter(bb);
        

        
             
 
        
        
    }

    public void fillTime(){
        Time rightNow = new Time();
        rightNow.set(System.currentTimeMillis());

    	EditText MonthBox = (EditText) findViewById(R.id.MonthBox);
    	EditText DayBox = (EditText) findViewById(R.id.DayBox);
    	EditText HourBox = (EditText) findViewById(R.id.HourBox);
    	EditText MinuteBox = (EditText) findViewById(R.id.MinuteBox);

    	    	
    	MonthBox.setText(String.valueOf(rightNow.month+1));
    	DayBox.setText(String.valueOf(rightNow.monthDay));
    	HourBox.setText(String.valueOf(rightNow.hour));
    	MinuteBox.setText(String.valueOf(rightNow.minute));
    	
    }
	public void HandOffInput() {
		CalculateIVs();
		
		
	}
	public void CalculateIVs(){
		

		
		//int testnature = 1;
		
		EditText PokedexNoBox = (EditText) findViewById(R.id.PokedexNoBox);
		EditText LevelBox = (EditText) findViewById(R.id.LevelBox);
		EditText HPBox = (EditText) findViewById(R.id.HPBox);
		EditText ATBox = (EditText) findViewById(R.id.AttackBox);
		EditText DFBox = (EditText) findViewById(R.id.DefenseBox);
		EditText SABox = (EditText) findViewById(R.id.SpecialAttackBox);
		EditText SDBox = (EditText) findViewById(R.id.SpecialDefenseBox);
		EditText SPBox = (EditText) findViewById(R.id.SpeedBox);
		Spinner NaturePicker = (Spinner) findViewById(R.id.NaturePicker);
		Log.i("Ptwister", "NatureSelected =" + NaturePicker.getLastVisiblePosition());
		int NatureSelected = NaturePicker.getLastVisiblePosition()-1;
		
	
	
		ArrayList<Integer> HPIV = new ArrayList<Integer>();
		ArrayList<Integer> ATIV = new ArrayList<Integer>();
		ArrayList<Integer> DFIV = new ArrayList<Integer>();
		ArrayList<Integer> SAIV = new ArrayList<Integer>();
		ArrayList<Integer> SDIV = new ArrayList<Integer>();
		ArrayList<Integer> SPIV = new ArrayList<Integer>();
		Integer PokedexNo = 0;
		PokedexNo = Integer.parseInt(PokedexNoBox.getText().toString())-1;
		int Level = Integer.parseInt((LevelBox.getText().toString()));
		for( int iv=1; iv<+31; iv++){
			if (Integer.parseInt((HPBox.getText().toString())) == Math.floor((((iv + (2*BaseStats[0][PokedexNo])+ 100)* Level) / 100) + 10)) {
				HPIV.add(iv); 
			}
		};
		for( int iv=1; iv<+31; iv++){
			if (Integer.parseInt((ATBox.getText().toString())) == Math.floor(((((iv + (2*BaseStats[1][PokedexNo]))*Level)/100)+5)*NatureMult[NatureSelected][0])){
				ATIV.add(iv);
			}
		};
		for( int iv=1; iv<+31; iv++){
			if (Integer.parseInt((DFBox.getText().toString())) == Math.floor(((((iv + (2*BaseStats[2][PokedexNo]))*Level)/100)+5)*NatureMult[NatureSelected][1])){
				DFIV.add(iv);
			}
		};
		for( int iv=1; iv<+31; iv++){
			if (Integer.parseInt((SABox.getText().toString())) == Math.floor(((((iv + (2*BaseStats[3][PokedexNo]))*Level)/100)+5)*NatureMult[NatureSelected][2])){
				SAIV.add(iv);
			}
		};
		for( int iv=1; iv<+31; iv++){
			if (Integer.parseInt((SDBox.getText().toString())) == Math.floor(((((iv + (2*BaseStats[4][PokedexNo]))*Level)/100)+5)*NatureMult[NatureSelected][3])){
				SDIV.add(iv);
			}
		};
		for( int iv=1; iv<+31; iv++){
			if (Integer.parseInt((SPBox.getText().toString())) == Math.floor(((((iv + (2*BaseStats[5][PokedexNo]))*Level)/100)+5)*NatureMult[NatureSelected][4])){
				SPIV.add(iv);
			}
		};
		
		Log.i("Ptwister", "IVs_Calculated_Successfully");
		new AlertDialog.Builder(this)
			.setTitle("IVs")
			.setMessage("HP IVs: " + HPIV + "\n" + "AT IVs: " + ATIV + "\n" + "DF IVs: " + DFIV + "\n" + "SA IVs: " + SAIV + "\n" + "SD IVs: " + SDIV + "\n" + "SP IVs: " + SPIV)
			.show();
		
		
		
	}
}

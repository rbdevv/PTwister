package com.rbdevv.calc.ptwister;

import java.util.ArrayList;
import java.util.Iterator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class twister extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Spinner NaturePicker = (Spinner) findViewById(R.id.NaturePicker);
        Spinner CharacteristicPicker = (Spinner) findViewById(R.id.CharacteristicPicker);
        
        
        //ArrayList<String> NatureTypes = new ArrayList<String>();
        
        
        
        
        
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Iterator<Integer> iter;
//        while (iter.hasNext()) {
//            adapter.add(ContactsContract.CommonDataKinds.Phone.getTypeLabel(
//                    this.getResources(),
//                    iter.next(),
//                    getString(R.string.undefinedTypeLabel)).toString());
//        }
 
        
        
    }
}
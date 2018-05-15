package com.example.fitnessappdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      
      GridView gridview = (GridView) findViewById(R.id.gridview);
      gridview.setAdapter(new ImageAdapter(this));
      
      gridview.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View v,
                  int position, long id) {
        	  
              // Send intent to SingleViewActivity
        	  
        	  
        	  switch (position) {
        	  case 0:
        		  Intent i = 
                  new Intent(getApplicationContext(), BmiCalculator.class);
                  // Pass image index
                  i.putExtra("id", position);
                  startActivity(i);
        	  break;
        	 case 1:
        		  Intent i1 = 
                  new Intent(getApplicationContext(), TipsQuoteReaderActivity.class);
                  // Pass image index
                  i1.putExtra("id", position);
                  startActivity(i1);
        	  break;
        	  
        	  case 5:
        		  Intent i2 = 
                  new Intent(getApplicationContext(), QuoteReaderActivity.class);
                  // Pass image index
        		  i2.putExtra("id", position);
                  startActivity(i2);
        	  break;
        	  
        	  case 2:
        		  Intent i4 = 
                  new Intent(getApplicationContext(), ActivityReader.class);
                  // Pass image index
        		  i4.putExtra("id", position);
                  startActivity(i4);
        	  break;
        	  case 3:
        		  Intent i3 = 
                  new Intent(getApplicationContext(), Tracker.class);
                  // Pass image index
        		  i3.putExtra("id", position);
                  startActivity(i3);
        	  break;
        	  case 4:
        		  Intent i6 = 
                  new Intent(getApplicationContext(), ContactActivity.class);
                  // Pass image index
        		  i6.putExtra("id", position);
                  startActivity(i6);
        	  break;
        	  
        	  } 
             /* Intent i = 
              new Intent(getApplicationContext(), BmiCalculator.class);
              // Pass image index
              i.putExtra("id", position);
              startActivity(i);*/
          }
      });
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }
   
}

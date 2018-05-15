package com.example.fitnessappdemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ActivityReader extends Activity {

	private ListView mListView;
	public class QuoteAdapter extends BaseAdapter {
		private Context mContext;
		private LayoutInflater mInflator;
		private ActivitySource mDataSource;
		/**
		 * 
		 * body of class quote adapter
		 */
		public QuoteAdapter(Context c) {
			mContext = c;
			mInflator = (LayoutInflater)
			mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			mDataSource = new ActivitySource();
			}
	
/**
 * Returns the number of items present in the data set.
 */
		@Override
		public int getCount() 
		{
		return mDataSource.getDataSourceLength();
		}
		
		/**
		 * Gets the data item associated with the specified position in the data
set.
		 */
		@Override
		public Object getItem(int position) {
			return position;
			}
		/**
		 * Gets the row id associated with the specified position.
		 */
		
		@Override
		public long getItemId(int position) {
			return position;
			}
		
		/**
		 * This is used to get a
view that displays the data at the specified position in the data set.
It is responsible for binding the data source with the list view item.
In it we first check if the convert view is null, the reason we do this is to check if the
convertView returned is not a recycled view.
		 */
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView thumbnail;
			TextView quote;
			if(convertView == null) {
			convertView = mInflator.inflate(R.layout.act_list_item_layout, parent,
			false);
			}
			thumbnail = (ImageView) convertView.findViewById(R.id.thumb);
		//	thumbnail.setImageResource(mDataSource.getmPhotoPool().get(position));
			quote = (TextView) convertView.findViewById(R.id.text);
			quote.setText(mDataSource.getmQuotePool().get(position));
			return convertView;
			}
		
		}

	/**
	 * setting an item click listener and every time an item is clicked we
create an Intent!
we pass the position variable to the intent, this is used to represent the
position in the data source for the item clicked.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_main);
		mListView = (ListView) findViewById(R.id.quotes_list);
		mListView.setAdapter(new QuoteAdapter(this));
		mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView arg0, View arg1, int position,
			long arg3) {
			Intent i = new Intent(ActivityReader.this, ActivityDetail.class);
			i.putExtra("position", position);
			startActivity(i);
			}
			});
		
	}
}

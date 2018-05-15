package com.example.fitnessappdemo;

import java.util.ArrayList;

public class DataSource {

	private ArrayList<Integer> mPhotoPool;
	private ArrayList<Integer> mQuotePool;
	private ArrayList<Integer> mPhotoHdPool;
	/**
	 * we have defined our array list to contain integers
	 * @return
	 */
	public ArrayList<Integer> getmPhotoHdPool() {
		return mPhotoHdPool;
		}
		public ArrayList<Integer> getmPhotoPool() {
		return mPhotoPool;
		}
		public ArrayList<Integer> getmQuotePool() {
		return mQuotePool;
		}
		/**
		 * we have defined images 
		 */

		private void setupPhotoPool() {
			mPhotoPool.add(R.drawable.f1);
			mPhotoPool.add(R.drawable.f2);
			mPhotoPool.add(R.drawable.f3);
			mPhotoPool.add(R.drawable.f4);
			mPhotoPool.add(R.drawable.f5);
			mPhotoPool.add(R.drawable.f6);
			mPhotoPool.add(R.drawable.f7);
			}
		
		private void setupQuotePool() {
			mQuotePool.add(R.string.Diet_1);
			mQuotePool.add(R.string.Diet_2);
			mQuotePool.add(R.string.Diet_3);
			mQuotePool.add(R.string.Diet_4);
			mQuotePool.add(R.string.Diet_5);
			mQuotePool.add(R.string.Diet_6);
			mQuotePool.add(R.string.Diet_7);
			
			
			}
			private void setupPhotoHDPool() {
			mPhotoHdPool.add(R.drawable.f1);
			mPhotoHdPool.add(R.drawable.f2);
			mPhotoHdPool.add(R.drawable.f3);
			mPhotoHdPool.add(R.drawable.f4);
			mPhotoHdPool.add(R.drawable.f5);
			mPhotoHdPool.add(R.drawable.f6);
			mPhotoHdPool.add(R.drawable.f7);
			}
			
			public int getDataSourceLength() {
				return mPhotoPool.size();
				}
			
		public DataSource() {
		mPhotoPool = new ArrayList();
		mQuotePool = new ArrayList();
		mPhotoHdPool = new ArrayList();
		setupPhotoPool();
		setupQuotePool();
		setupPhotoHDPool();
		}

}

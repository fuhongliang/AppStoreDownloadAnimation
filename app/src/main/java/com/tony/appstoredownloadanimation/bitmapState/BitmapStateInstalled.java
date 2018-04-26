package com.tony.appstoredownloadanimation.bitmapState;

import android.graphics.Bitmap;

import com.tony.appstoredownloadanimation.BitmapInfo;


public class BitmapStateInstalled extends BaseBitmapSateProgress{
    public BitmapStateInstalled(BitmapInfo bitmapInfo) {
        super(bitmapInfo);
    }

    @Override
    public Bitmap decodeBitmap() {
        mCircleSchedule = 0;
        return super.decodeBitmap();
    }
}

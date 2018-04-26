package com.tony.appstoredownloadanimation.bitmapState;

import android.graphics.Bitmap;

import com.tony.appstoredownloadanimation.BitmapInfo;

public class BitmapStateInstalling extends BaseBitmapSateProgress{
    public BitmapStateInstalling(BitmapInfo bitmapInfo) {
        super(bitmapInfo);

    }

    @Override
    public Bitmap decodeBitmap() {
        mCircleSchedule = -90 + mBitmapInfo.getCircleSchedule() * 18;
        return super.decodeBitmap();
    }
}

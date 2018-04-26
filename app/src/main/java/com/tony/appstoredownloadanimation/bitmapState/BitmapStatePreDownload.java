package com.tony.appstoredownloadanimation.bitmapState;

import android.graphics.Bitmap;

import com.tony.appstoredownloadanimation.BitmapInfo;


public class BitmapStatePreDownload extends BaseBitmapSateProgress{

    public BitmapStatePreDownload(BitmapInfo bitmapInfo) {
        super(bitmapInfo);
    }

    @Override
    public Bitmap decodeBitmap() {
        return super.decodeBitmap();
    }
}

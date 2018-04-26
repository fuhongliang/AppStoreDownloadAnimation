package com.tony.appstoredownloadanimation.bitmapState;

import android.graphics.Bitmap;
import android.graphics.Paint;

import com.tony.appstoredownloadanimation.BitmapInfo;


public abstract class BaseBitmapState {
    protected BitmapInfo mBitmapInfo;
    protected Bitmap mRendererBitmap;
    protected Paint mDrawPaint;

    public BaseBitmapState(BitmapInfo bitmapInfo) {
        mRendererBitmap = bitmapInfo.createRendererBitmap();
        mBitmapInfo = bitmapInfo;

        mDrawPaint = new Paint();
        mDrawPaint.setAntiAlias(true);
        mDrawPaint.setStyle(Paint.Style.FILL);
    }

    public Bitmap decodeBitmap() {
        return mRendererBitmap;
    }
}

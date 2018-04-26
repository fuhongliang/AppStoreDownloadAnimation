package com.tony.appstoredownloadanimation;

import android.graphics.Bitmap;

import com.tony.appstoredownloadanimation.bitmapState.BaseBitmapState;

public class DecodeBitmap {
    BaseBitmapState mBitmapState;

    public DecodeBitmap(BaseBitmapState bitmapState) {
        mBitmapState = bitmapState;
    }

    public Bitmap decode() {
        if (mBitmapState == null) {
            return null;
        }
        return mBitmapState.decodeBitmap();
    }
}

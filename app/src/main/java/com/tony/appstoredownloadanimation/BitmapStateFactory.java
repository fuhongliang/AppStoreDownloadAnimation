package com.tony.appstoredownloadanimation;


import com.tony.appstoredownloadanimation.bitmapState.BaseBitmapState;
import com.tony.appstoredownloadanimation.bitmapState.BitmapStateDownloaded;
import com.tony.appstoredownloadanimation.bitmapState.BitmapStateDownloading;
import com.tony.appstoredownloadanimation.bitmapState.BitmapStateInstalled;
import com.tony.appstoredownloadanimation.bitmapState.BitmapStateInstalling;
import com.tony.appstoredownloadanimation.bitmapState.BitmapStatePreDownload;
import com.tony.appstoredownloadanimation.bitmapState.BitmapStatePreInstall;

public class BitmapStateFactory {
    public static BitmapStateFactory sBitmapStateFactory;

    public static BitmapStateFactory getInstance() {
        if (null == sBitmapStateFactory) {
            sBitmapStateFactory = new BitmapStateFactory();
        }
        return sBitmapStateFactory;
    }

     public BaseBitmapState createBitmapState(BitmapInfo bitmapInfo) {
         if (bitmapInfo == null) {
             return null;
         }

         BaseBitmapState bitmapState = null;
         switch (bitmapInfo.getStatus()) {
             case BitmapInfo.PRE_DOWNLOAD:
                 bitmapState = new BitmapStatePreDownload(bitmapInfo);
                 break;

             case BitmapInfo.DOWNLOADING:
                 bitmapState = new BitmapStateDownloading(bitmapInfo);
                 break;

             case BitmapInfo.DOWNLOADED:
                 bitmapState = new BitmapStateDownloaded(bitmapInfo);
                 break;


             case BitmapInfo.PRE_INSTALL:
                 bitmapState = new BitmapStatePreInstall(bitmapInfo);
                 break;

             case BitmapInfo.INSTALLING:
                 bitmapState = new BitmapStateInstalling(bitmapInfo);
                 break;

             case BitmapInfo.INSTALLED:
                 bitmapState = new BitmapStateInstalled(bitmapInfo);
                 break;

             default:
                 break;
         }

         return bitmapState;
     }
}

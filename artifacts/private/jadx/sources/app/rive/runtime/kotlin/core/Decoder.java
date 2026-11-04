package app.rive.runtime.kotlin.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: loaded from: classes3.dex */
public class Decoder {
    static int[] decodeToPixels(byte[] bArr) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            options.inScaled = false;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int[] iArr = new int[(width * height) + 2];
            bitmapDecodeByteArray.getPixels(iArr, 2, width, 0, 0, width, height);
            iArr[0] = width;
            iArr[1] = height;
            return iArr;
        } catch (Exception unused) {
            return new int[0];
        }
    }
}

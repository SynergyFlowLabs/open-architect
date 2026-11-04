package io.intercom.android.sdk.utilities;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public class ImageUtils {
    public static int getAspectHeight(int i10, double d10) {
        return (int) (((double) i10) * d10);
    }

    public static double getAspectRatio(int i10, int i11) {
        if (i11 == 0 || i10 == 0) {
            return 1.0d;
        }
        double d10 = (((double) i11) * 1.0d) / ((double) i10);
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        return d10;
    }

    public static int getAspectWidth(int i10, double d10) {
        return (int) (((double) i10) / d10);
    }

    public static boolean isGif(String str) {
        return !TextUtils.isEmpty(str) && str.endsWith(".gif");
    }
}

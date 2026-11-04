package io.intercom.android.sdk.utilities.commons;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes13.dex */
public class ScreenUtils {
    public static int dpToPx(float f10, Context context) {
        return (int) (f10 * context.getResources().getDisplayMetrics().density);
    }

    public static Point getScreenDimensions(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }
}

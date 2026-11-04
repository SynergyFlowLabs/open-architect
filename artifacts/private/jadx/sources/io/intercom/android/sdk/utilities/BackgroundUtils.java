package io.intercom.android.sdk.utilities;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.l;

/* JADX INFO: loaded from: classes13.dex */
public class BackgroundUtils {
    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setButtonColor(TextView textView, @l int i10) {
        int iButtonTextColorVariant = ColorUtils.buttonTextColorVariant(i10);
        int iButtonBackgroundColorVariant = ColorUtils.buttonBackgroundColorVariant(i10);
        textView.setTextColor(iButtonTextColorVariant);
        textView.getBackground().setColorFilter(iButtonBackgroundColorVariant, PorterDuff.Mode.SRC_ATOP);
    }
}

package io.intercom.android.sdk.views;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.StateListDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class ButtonSelector extends StateListDrawable {
    private final int color;

    public ButtonSelector(Context context, int i10, int i11) {
        this.color = i11;
        addState(new int[]{R.attr.state_enabled}, context.getResources().getDrawable(i10));
        addState(new int[]{R.attr.state_focused}, context.getResources().getDrawable(i10));
        addState(new int[]{R.attr.state_pressed}, context.getResources().getDrawable(i10));
    }

    private static int darken(int i10, double d10) {
        return Color.argb(255, (int) (((double) Color.red(i10)) * d10), (int) (((double) Color.green(i10)) * d10), (int) (((double) Color.blue(i10)) * d10));
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10 = false;
        for (int i10 : iArr) {
            if (i10 == 16842919 || i10 == 16842908) {
                z10 = true;
            }
        }
        if (z10) {
            setColorFilter(darken(this.color, 0.9d), PorterDuff.Mode.SRC);
        } else {
            setColorFilter(this.color, PorterDuff.Mode.SRC);
        }
        return super.onStateChange(iArr);
    }
}

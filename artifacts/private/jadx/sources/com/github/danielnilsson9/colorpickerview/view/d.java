package com.github.danielnilsson9.colorpickerview.view;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static int a(Context context, float f10) {
        float fApplyDimension = TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
        int i10 = (int) (((double) fApplyDimension) + 0.5d);
        if (i10 != 0 || fApplyDimension <= 0.0f) {
            return i10;
        }
        return 1;
    }
}

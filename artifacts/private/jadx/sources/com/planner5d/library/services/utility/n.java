package com.planner5d.library.services.utility;

import android.graphics.Color;

/* JADX INFO: loaded from: classes10.dex */
public class n {
    public static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.rgb((int) ((Color.red(i10) * f10) + (Color.red(i11) * f11)), (int) ((Color.green(i10) * f10) + (Color.green(i11) * f11)), (int) ((Color.blue(i10) * f10) + (Color.blue(i11) * f11)));
    }

    public static int b(int i10) {
        return (i10 | (-16777216)) > -6710887 ? -16777216 : -1;
    }
}

package com.superwall.sdk.misc;

import android.graphics.Color;

/* JADX INFO: loaded from: classes13.dex */
public final class Color_HelpersKt {
    public static final int inverseReadableOverlayColor(int i10) {
        return isDarkColor(i10) ? -16777216 : -1;
    }

    public static final boolean isDarkColor(int i10) {
        return ((((double) 0.2126f) * (((double) Color.red(i10)) / 255.0d)) + (((double) 0.7152f) * (((double) Color.green(i10)) / 255.0d))) + (((double) 0.0722f) * (((double) Color.blue(i10)) / 255.0d)) < 0.5d;
    }

    public static final boolean isLightColor(int i10) {
        return !isDarkColor(i10);
    }

    public static final int readableOverlayColor(int i10) {
        return isDarkColor(i10) ? -1 : -16777216;
    }
}

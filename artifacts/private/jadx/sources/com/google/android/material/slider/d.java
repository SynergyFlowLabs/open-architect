package com.google.android.material.slider;

import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f113847e = 1000000000000L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f113848f = 1000000000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f113849g = 1000000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f113850h = 1000;

    @Override // com.google.android.material.slider.e
    @NonNull
    public String a(float f10) {
        if (f10 >= 1.0E12f) {
            return String.format(Locale.US, "%.1fT", Float.valueOf(f10 / 1.0E12f));
        }
        if (f10 >= 1.0E9f) {
            return String.format(Locale.US, "%.1fB", Float.valueOf(f10 / 1.0E9f));
        }
        if (f10 >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", Float.valueOf(f10 / 1000000.0f));
        }
        return f10 >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f10 / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f10));
    }
}

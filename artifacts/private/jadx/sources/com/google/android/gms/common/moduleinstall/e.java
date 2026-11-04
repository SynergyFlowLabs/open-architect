package com.google.android.gms.common.moduleinstall;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends com.google.android.gms.common.api.h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f106754t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f106755u = 46000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f106756v = 46001;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f106757w = 46002;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f106758x = 46003;

    private e() {
    }

    @NonNull
    public static String a(int i10) {
        switch (i10) {
            case f106755u /* 46000 */:
                return "UNKNOWN_MODULE";
            case f106756v /* 46001 */:
                return "NOT_ALLOWED_MODULE";
            case f106757w /* 46002 */:
                return "MODULE_NOT_FOUND";
            case f106758x /* 46003 */:
                return "INSUFFICIENT_STORAGE";
            default:
                return com.google.android.gms.common.api.h.a(i10);
        }
    }
}

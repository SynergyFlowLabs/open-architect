package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f121200a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f121201b = 1;

    public static int a(int i10) {
        if (i10 < 200 || i10 > 299) {
            return ((i10 < 300 || i10 > 399) && i10 >= 400 && i10 <= 499) ? 0 : 1;
        }
        return 0;
    }
}

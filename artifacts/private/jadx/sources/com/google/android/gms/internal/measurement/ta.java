package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public class ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f108877a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f108878b = 0;

    /* synthetic */ ta(byte[] bArr) {
    }

    public static int a(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long b(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }
}

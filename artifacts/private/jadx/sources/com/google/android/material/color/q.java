package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.g1;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f112056c = {r6.a.c.f359533s3, r6.a.c.f359643x3, r6.a.c.f359555t3, r6.a.c.f359665y3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f112057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g1
    private final int f112058b;

    private q(@NonNull @androidx.annotation.f int[] iArr, @g1 int i10) {
        if (i10 != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.f112057a = iArr;
        this.f112058b = i10;
    }

    @NonNull
    public static q a(@NonNull @androidx.annotation.f int[] iArr) {
        return new q(iArr, 0);
    }

    @NonNull
    public static q b(@NonNull @androidx.annotation.f int[] iArr, @g1 int i10) {
        return new q(iArr, i10);
    }

    @NonNull
    public static q c() {
        return b(f112056c, r6.a.n.f361037aa);
    }

    @NonNull
    public int[] d() {
        return this.f112057a;
    }

    @g1
    public int e() {
        return this.f112058b;
    }
}

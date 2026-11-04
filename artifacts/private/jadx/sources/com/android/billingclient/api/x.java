package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f89283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f89284b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final int C0 = 0;
        public static final int D0 = 1;
    }

    public x(int i10, @androidx.annotation.p0 String str) {
        this.f89283a = i10;
        this.f89284b = str;
    }

    @androidx.annotation.p0
    public String a() {
        return this.f89284b;
    }

    public int b() {
        return this.f89283a;
    }
}

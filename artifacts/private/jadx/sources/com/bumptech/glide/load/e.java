package com.bumptech.glide.load;

import androidx.annotation.p0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f96366b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f96367c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f96368a;

    public e(int i10) {
        this("Http request failed with status code: " + i10, i10);
    }

    public int a() {
        return this.f96368a;
    }

    public e(String str) {
        this(str, -1);
    }

    public e(String str, int i10) {
        this(str, i10, null);
    }

    public e(String str, int i10, @p0 Throwable th2) {
        super(str, th2);
        this.f96368a = i10;
    }
}

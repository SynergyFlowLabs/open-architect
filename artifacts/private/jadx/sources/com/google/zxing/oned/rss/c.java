package com.google.zxing.oned.rss;

import com.google.zxing.t;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f130645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f130646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t[] f130647c;

    public c(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f130645a = i10;
        this.f130646b = iArr;
        float f10 = i11;
        float f11 = i13;
        this.f130647c = new t[]{new t(f10, f11), new t(i12, f11)};
    }

    public t[] a() {
        return this.f130647c;
    }

    public int[] b() {
        return this.f130646b;
    }

    public int c() {
        return this.f130645a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f130645a == ((c) obj).f130645a;
    }

    public int hashCode() {
        return this.f130645a;
    }
}

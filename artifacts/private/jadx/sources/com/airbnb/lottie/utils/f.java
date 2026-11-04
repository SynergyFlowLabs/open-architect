package com.airbnb.lottie.utils;

import androidx.core.os.q0;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f88837e = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f88838a = new String[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f88839b = new long[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f88840c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f88841d = 0;

    public void a(String str) {
        int i10 = this.f88840c;
        if (i10 == 5) {
            this.f88841d++;
            return;
        }
        this.f88838a[i10] = str;
        this.f88839b[i10] = System.nanoTime();
        q0.b(str);
        this.f88840c++;
    }

    public float b(String str) {
        int i10 = this.f88841d;
        if (i10 > 0) {
            this.f88841d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f88840c - 1;
        this.f88840c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f88838a[i11])) {
            q0.d();
            return (System.nanoTime() - this.f88839b[this.f88840c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f88838a[this.f88840c] + ".");
    }
}

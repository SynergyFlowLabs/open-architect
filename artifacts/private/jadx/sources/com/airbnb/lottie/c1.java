package com.airbnb.lottie;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final V f88181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final Throwable f88182b;

    public c1(V v10) {
        this.f88181a = v10;
        this.f88182b = null;
    }

    @androidx.annotation.p0
    public Throwable a() {
        return this.f88182b;
    }

    @androidx.annotation.p0
    public V b() {
        return this.f88181a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (b() != null && b().equals(c1Var.b())) {
            return true;
        }
        if (a() == null || c1Var.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public c1(Throwable th2) {
        this.f88182b = th2;
        this.f88181a = null;
    }
}

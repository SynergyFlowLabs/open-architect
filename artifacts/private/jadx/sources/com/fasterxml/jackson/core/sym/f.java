package com.fasterxml.jackson.core.sym;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f102750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f102751b;

    protected f(String str, int i10) {
        this.f102750a = str;
        this.f102751b = i10;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10, int i11);

    public abstract boolean c(int i10, int i11, int i12);

    public abstract boolean d(int[] iArr, int i10);

    public String e() {
        return this.f102750a;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.f102751b;
    }

    public String toString() {
        return this.f102750a;
    }
}

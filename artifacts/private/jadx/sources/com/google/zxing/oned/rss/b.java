package com.google.zxing.oned.rss;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f130643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f130644b;

    public b(int i10, int i11) {
        this.f130643a = i10;
        this.f130644b = i11;
    }

    public final int a() {
        return this.f130644b;
    }

    public final int b() {
        return this.f130643a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f130643a == bVar.f130643a && this.f130644b == bVar.f130644b;
    }

    public final int hashCode() {
        return this.f130644b ^ this.f130643a;
    }

    public final String toString() {
        return this.f130643a + "(" + this.f130644b + ')';
    }
}

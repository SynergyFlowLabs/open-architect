package com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f130476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f130477b;

    public f(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException();
        }
        this.f130476a = i10;
        this.f130477b = i11;
    }

    public int a() {
        return this.f130477b;
    }

    public int b() {
        return this.f130476a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f130476a == fVar.f130476a && this.f130477b == fVar.f130477b) {
                int i10 = 7 >> 1;
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f130476a * 32713) + this.f130477b;
    }

    public String toString() {
        return this.f130476a + "x" + this.f130477b;
    }
}

package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
final class t3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f118125a;

    t3(int value) {
        this.f118125a = value;
    }

    public void a(int delta) {
        this.f118125a += delta;
    }

    public int b(int delta) {
        int i10 = this.f118125a + delta;
        this.f118125a = i10;
        return i10;
    }

    public int c() {
        return this.f118125a;
    }

    public int d(int newValue) {
        int i10 = this.f118125a;
        this.f118125a = newValue;
        return i10;
    }

    public void e(int newValue) {
        this.f118125a = newValue;
    }

    public boolean equals(@fj.a Object obj) {
        return (obj instanceof t3) && ((t3) obj).f118125a == this.f118125a;
    }

    public int hashCode() {
        return this.f118125a;
    }

    public String toString() {
        return Integer.toString(this.f118125a);
    }
}

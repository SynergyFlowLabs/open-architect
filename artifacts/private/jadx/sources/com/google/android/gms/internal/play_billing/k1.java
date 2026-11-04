package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class k1 extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f109155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f109156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f109157c;

    k1(int i10) {
        y0.a(i10, "initialCapacity");
        this.f109155a = new Object[i10];
        this.f109156b = 0;
    }

    private final void d(int i10) {
        int length = this.f109155a.length;
        int iA = l1.a(length, this.f109156b + i10);
        if (iA <= length && !this.f109157c) {
            return;
        }
        this.f109155a = Arrays.copyOf(this.f109155a, iA);
        this.f109157c = false;
    }

    public final k1 b(Object obj) {
        obj.getClass();
        d(1);
        Object[] objArr = this.f109155a;
        int i10 = this.f109156b;
        this.f109156b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    final void c(Object[] objArr, int i10) {
        h2.b(objArr, i10);
        d(i10);
        System.arraycopy(objArr, 0, this.f109155a, this.f109156b, i10);
        this.f109156b += i10;
    }
}

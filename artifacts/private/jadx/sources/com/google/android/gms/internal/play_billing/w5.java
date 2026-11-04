package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class w5 extends x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f109375a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f109376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d6 f109377c;

    w5(d6 d6Var) {
        this.f109377c = d6Var;
        this.f109376b = d6Var.i();
    }

    @Override // com.google.android.gms.internal.play_billing.z5
    public final byte a() {
        int i10 = this.f109375a;
        if (i10 >= this.f109376b) {
            throw new NoSuchElementException();
        }
        this.f109375a = i10 + 1;
        return this.f109377c.d(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f109375a < this.f109376b;
    }
}

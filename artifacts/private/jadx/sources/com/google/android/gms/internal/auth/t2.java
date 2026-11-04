package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class t2 extends v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107799a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f107800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d3 f107801c;

    t2(d3 d3Var) {
        this.f107801c = d3Var;
        this.f107800b = d3Var.i();
    }

    @Override // com.google.android.gms.internal.auth.y2
    public final byte a() {
        int i10 = this.f107799a;
        if (i10 >= this.f107800b) {
            throw new NoSuchElementException();
        }
        this.f107799a = i10 + 1;
        return this.f107801c.d(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f107799a < this.f107800b;
    }
}

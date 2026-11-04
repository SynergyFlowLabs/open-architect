package com.google.vr.sdk.deps;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
final class l2 extends n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f129474a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f129475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ k2 f129476c;

    l2(k2 k2Var) {
        this.f129476c = k2Var;
        this.f129475b = k2Var.v();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f129474a < this.f129475b;
    }

    @Override // com.google.vr.sdk.deps.q2
    public final byte y() {
        int i10 = this.f129474a;
        if (i10 >= this.f129475b) {
            throw new NoSuchElementException();
        }
        this.f129474a = i10 + 1;
        return this.f129476c.u(i10);
    }
}

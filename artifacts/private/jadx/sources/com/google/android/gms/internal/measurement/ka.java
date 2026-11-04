package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ka extends la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f108602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f108603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ra f108604c;

    ka(ra raVar) {
        Objects.requireNonNull(raVar);
        this.f108604c = raVar;
        this.f108602a = 0;
        this.f108603b = raVar.i();
    }

    @Override // com.google.android.gms.internal.measurement.na
    public final byte a() {
        int i10 = this.f108602a;
        if (i10 >= this.f108603b) {
            throw new NoSuchElementException();
        }
        this.f108602a = i10 + 1;
        return this.f108604c.d(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f108602a >= this.f108603b) {
            return false;
        }
        boolean z10 = true & true;
        return true;
    }
}

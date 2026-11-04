package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f108373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f108374b;

    e(f fVar) {
        Objects.requireNonNull(fVar);
        this.f108374b = fVar;
        this.f108373a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f108373a < this.f108374b.t();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        f fVar = this.f108374b;
        if (this.f108373a < fVar.t()) {
            int i10 = this.f108373a;
            this.f108373a = i10 + 1;
            return fVar.v(i10);
        }
        int i11 = this.f108373a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class pd implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f108740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f108741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f108742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ rd f108743d;

    /* synthetic */ pd(rd rdVar, byte[] bArr) {
        Objects.requireNonNull(rdVar);
        this.f108743d = rdVar;
        this.f108740a = -1;
    }

    private final Iterator b() {
        if (this.f108742c == null) {
            this.f108742c = this.f108743d.k().entrySet().iterator();
        }
        return this.f108742c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f108740a + 1;
        rd rdVar = this.f108743d;
        if (i10 >= rdVar.j()) {
            return !rdVar.k().isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f108741b = true;
        int i10 = this.f108740a + 1;
        this.f108740a = i10;
        rd rdVar = this.f108743d;
        return i10 < rdVar.j() ? (od) rdVar.i()[i10] : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f108741b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f108741b = false;
        rd rdVar = this.f108743d;
        rdVar.h();
        int i10 = this.f108740a;
        if (i10 >= rdVar.j()) {
            b().remove();
        } else {
            this.f108740a = i10 - 1;
            rdVar.g(i10);
        }
    }
}

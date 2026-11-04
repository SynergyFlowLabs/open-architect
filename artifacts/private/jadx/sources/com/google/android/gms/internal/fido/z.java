package com.google.android.gms.internal.fido;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class z extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object f108078c;

    z(Object obj) {
        obj.getClass();
        this.f108078c = obj;
    }

    @Override // com.google.android.gms.internal.fido.r
    final int c(Object[] objArr, int i10) {
        objArr[0] = this.f108078c;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@fj.a Object obj) {
        return this.f108078c.equals(obj);
    }

    @Override // com.google.android.gms.internal.fido.v, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f108078c.hashCode();
    }

    @Override // com.google.android.gms.internal.fido.v, com.google.android.gms.internal.fido.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new w(this.f108078c);
    }

    @Override // com.google.android.gms.internal.fido.v, com.google.android.gms.internal.fido.r
    /* JADX INFO: renamed from: l */
    public final a0 iterator() {
        return new w(this.f108078c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f108078c.toString() + "]";
    }
}

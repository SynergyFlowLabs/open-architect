package com.google.android.gms.internal.location;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class v3 extends w3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient int f108203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f108204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ w3 f108205e;

    v3(w3 w3Var, int i10, int i11) {
        this.f108205e = w3Var;
        this.f108203c = i10;
        this.f108204d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        q3.c(i10, this.f108204d, FirebaseAnalytics.d.f120644b0);
        return this.f108205e.get(i10 + this.f108203c);
    }

    @Override // com.google.android.gms.internal.location.t3
    @fj.a
    final Object[] i() {
        return this.f108205e.i();
    }

    @Override // com.google.android.gms.internal.location.t3
    final int k() {
        return this.f108205e.k() + this.f108203c;
    }

    @Override // com.google.android.gms.internal.location.t3
    final int l() {
        return this.f108205e.k() + this.f108203c + this.f108204d;
    }

    @Override // com.google.android.gms.internal.location.t3
    final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.w3
    /* JADX INFO: renamed from: r */
    public final w3 subList(int i10, int i11) {
        q3.e(i10, i11, this.f108204d);
        int i12 = this.f108203c;
        return this.f108205e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f108204d;
    }

    @Override // com.google.android.gms.internal.location.w3, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}

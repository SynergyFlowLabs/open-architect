package com.google.android.gms.internal.fido;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class t extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f108059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f108060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ u f108061f;

    t(u uVar, int i10, int i11) {
        this.f108061f = uVar;
        this.f108059d = i10;
        this.f108060e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        n.a(i10, this.f108060e, FirebaseAnalytics.d.f120644b0);
        return this.f108061f.get(i10 + this.f108059d);
    }

    @Override // com.google.android.gms.internal.fido.r
    final int i() {
        return this.f108061f.k() + this.f108059d + this.f108060e;
    }

    @Override // com.google.android.gms.internal.fido.r
    final int k() {
        return this.f108061f.k() + this.f108059d;
    }

    @Override // com.google.android.gms.internal.fido.r
    @fj.a
    final Object[] m() {
        return this.f108061f.m();
    }

    @Override // com.google.android.gms.internal.fido.u
    /* JADX INFO: renamed from: n */
    public final u subList(int i10, int i11) {
        n.e(i10, i11, this.f108060e);
        u uVar = this.f108061f;
        int i12 = this.f108059d;
        return uVar.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f108060e;
    }

    @Override // com.google.android.gms.internal.fido.u, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}

package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class p1 extends r1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient r1 f109246d;

    p1(r1 r1Var) {
        this.f109246d = r1Var;
    }

    private final int C(int i10) {
        return (this.f109246d.size() - 1) - i10;
    }

    @Override // com.google.android.gms.internal.play_billing.r1, com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@fj.a Object obj) {
        return this.f109246d.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        g0.a(i10, this.f109246d.size(), FirebaseAnalytics.d.f120644b0);
        return this.f109246d.get(C(i10));
    }

    @Override // com.google.android.gms.internal.play_billing.r1, java.util.List
    public final int indexOf(@fj.a Object obj) {
        int iLastIndexOf = this.f109246d.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return C(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.r1, java.util.List
    public final int lastIndexOf(@fj.a Object obj) {
        int iIndexOf = this.f109246d.indexOf(obj);
        if (iIndexOf >= 0) {
            return C(iIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final boolean n() {
        return this.f109246d.n();
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final r1 r() {
        return this.f109246d;
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    /* JADX INFO: renamed from: s */
    public final r1 subList(int i10, int i11) {
        g0.e(i10, i11, this.f109246d.size());
        r1 r1Var = this.f109246d;
        return r1Var.subList(r1Var.size() - i11, this.f109246d.size() - i10).r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109246d.size();
    }

    @Override // com.google.android.gms.internal.play_billing.r1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}

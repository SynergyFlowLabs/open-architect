package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class q1 extends r1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f109261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f109262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ r1 f109263f;

    q1(r1 r1Var, int i10, int i11) {
        this.f109263f = r1Var;
        this.f109261d = i10;
        this.f109262e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        g0.a(i10, this.f109262e, FirebaseAnalytics.d.f120644b0);
        return this.f109263f.get(i10 + this.f109261d);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final int i() {
        return this.f109263f.k() + this.f109261d + this.f109262e;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final int k() {
        return this.f109263f.k() + this.f109261d;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    @fj.a
    final Object[] p() {
        return this.f109263f.p();
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    /* JADX INFO: renamed from: s */
    public final r1 subList(int i10, int i11) {
        g0.e(i10, i11, this.f109262e);
        int i12 = this.f109261d;
        return this.f109263f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109262e;
    }

    @Override // com.google.android.gms.internal.play_billing.r1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}

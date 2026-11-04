package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class l extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f107976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f107977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ m f107978f;

    l(m mVar, int i10, int i11) {
        this.f107978f = mVar;
        this.f107976d = i10;
        this.f107977e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        l0.a(i10, this.f107977e, FirebaseAnalytics.d.f120644b0);
        return this.f107978f.get(i10 + this.f107976d);
    }

    @Override // com.google.android.gms.internal.common.h
    final int i() {
        return this.f107978f.k() + this.f107976d + this.f107977e;
    }

    @Override // com.google.android.gms.internal.common.h
    final int k() {
        return this.f107978f.k() + this.f107976d;
    }

    @Override // com.google.android.gms.internal.common.h
    final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.h
    final Object[] p() {
        return this.f107978f.p();
    }

    @Override // com.google.android.gms.internal.common.m
    /* JADX INFO: renamed from: s */
    public final m subList(int i10, int i11) {
        l0.c(i10, i11, this.f107977e);
        int i12 = this.f107976d;
        return this.f107978f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107977e;
    }

    @Override // com.google.android.gms.internal.common.m, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}

package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class k extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient m f107975d;

    k(m mVar) {
        this.f107975d = mVar;
    }

    private final int F(int i10) {
        return (this.f107975d.size() - 1) - i10;
    }

    @Override // com.google.android.gms.internal.common.m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f107975d.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        l0.a(i10, this.f107975d.size(), FirebaseAnalytics.d.f120644b0);
        return this.f107975d.get(F(i10));
    }

    @Override // com.google.android.gms.internal.common.m, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f107975d.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return F(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.m, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f107975d.indexOf(obj);
        if (iIndexOf >= 0) {
            return F(iIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.h
    final boolean n() {
        return this.f107975d.n();
    }

    @Override // com.google.android.gms.internal.common.m
    public final m r() {
        return this.f107975d;
    }

    @Override // com.google.android.gms.internal.common.m
    /* JADX INFO: renamed from: s */
    public final m subList(int i10, int i11) {
        l0.c(i10, i11, this.f107975d.size());
        m mVar = this.f107975d;
        return mVar.subList(mVar.size() - i11, this.f107975d.size() - i10).r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107975d.size();
    }

    @Override // com.google.android.gms.internal.common.m, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}

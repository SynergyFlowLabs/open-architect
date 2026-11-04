package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class p2 extends r1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ q2 f109247d;

    p2(q2 q2Var) {
        this.f109247d = q2Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        g0.a(i10, this.f109247d.f109266e, FirebaseAnalytics.d.f120644b0);
        int i11 = i10 + i10;
        Object obj = this.f109247d.f109265d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f109247d.f109265d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109247d.f109266e;
    }
}

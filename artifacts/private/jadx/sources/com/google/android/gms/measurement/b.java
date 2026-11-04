package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.measurement.internal.h7;
import com.google.android.gms.measurement.internal.ta;
import com.google.android.gms.measurement.internal.v8;
import com.google.android.gms.measurement.internal.w8;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h7 f109722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ta f109723b;

    public b(@NonNull h7 h7Var) {
        super(null);
        w.r(h7Var);
        this.f109722a = h7Var;
        this.f109723b = h7Var.B();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final String R() {
        return this.f109723b.R();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final String T() {
        return this.f109723b.E();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void a(String str, String str2, Bundle bundle) {
        this.f109723b.p(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final long b() {
        return this.f109722a.C().p0();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void c(String str) {
        h7 h7Var = this.f109722a;
        h7Var.M().j(str, h7Var.e().b());
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final String d() {
        return this.f109723b.T();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void e(String str, String str2, Bundle bundle, long j10) {
        this.f109723b.q(str, str2, bundle, true, false, j10);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final String f() {
        return this.f109723b.S();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void g(String str) {
        h7 h7Var = this.f109722a;
        h7Var.M().i(str, h7Var.e().b());
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final int h(String str) {
        this.f109723b.M(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void i(v8 v8Var) {
        this.f109723b.J(v8Var);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void j(w8 w8Var) {
        this.f109723b.L(w8Var);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void k(w8 w8Var) {
        this.f109723b.K(w8Var);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void l(Bundle bundle) {
        this.f109723b.N(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final Object m(int i10) {
        if (i10 == 0) {
            return this.f109723b.k0();
        }
        if (i10 == 1) {
            return this.f109723b.l0();
        }
        if (i10 != 2) {
            return i10 != 3 ? this.f109723b.j0() : this.f109723b.m0();
        }
        return this.f109723b.n0();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final Map n(String str, String str2, boolean z10) {
        return this.f109723b.D(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void o(String str, String str2, Bundle bundle) {
        this.f109722a.B().P(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final List p(String str, String str2) {
        return this.f109723b.Q(str, str2);
    }

    @Override // com.google.android.gms.measurement.d
    public final Map q(boolean z10) {
        List<zzpl> listC = this.f109723b.C(z10);
        androidx.collection.a aVar = new androidx.collection.a(listC.size());
        for (zzpl zzplVar : listC) {
            Object objO1 = zzplVar.O1();
            if (objO1 != null) {
                aVar.put(zzplVar.f110875b, objO1);
            }
        }
        return aVar;
    }

    @Override // com.google.android.gms.measurement.d
    public final Boolean r() {
        return this.f109723b.j0();
    }

    @Override // com.google.android.gms.measurement.d
    public final Integer s() {
        return this.f109723b.m0();
    }

    @Override // com.google.android.gms.measurement.d
    public final String t() {
        return this.f109723b.k0();
    }

    @Override // com.google.android.gms.measurement.d
    public final Long u() {
        return this.f109723b.l0();
    }

    @Override // com.google.android.gms.measurement.d
    public final Double v() {
        return this.f109723b.n0();
    }
}

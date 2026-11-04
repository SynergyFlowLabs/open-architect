package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.p0;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.measurement.internal.ua;
import com.google.android.gms.measurement.internal.v8;
import com.google.android.gms.measurement.internal.w8;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class h implements ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f4 f120734a;

    h(f4 f4Var) {
        this.f120734a = f4Var;
    }

    @Override // com.google.android.gms.measurement.internal.ua
    @p0
    public final String R() {
        return this.f120734a.a();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    @p0
    public final String T() {
        return this.f120734a.T();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void a(String str, String str2, Bundle bundle) {
        this.f120734a.D(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final long b() {
        return this.f120734a.U();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void c(String str) {
        this.f120734a.Q(str);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    @p0
    public final String d() {
        return this.f120734a.S();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void e(String str, String str2, Bundle bundle, long j10) {
        this.f120734a.E(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    @p0
    public final String f() {
        return this.f120734a.b();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void g(String str) {
        this.f120734a.P(str);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final int h(String str) {
        return this.f120734a.f(str);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void i(v8 v8Var) {
        this.f120734a.y(v8Var);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void j(w8 w8Var) {
        this.f120734a.B(w8Var);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void k(w8 w8Var) {
        this.f120734a.A(w8Var);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void l(Bundle bundle) {
        this.f120734a.G(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    @p0
    public final Object m(int i10) {
        return this.f120734a.j(i10);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final Map n(@p0 String str, @p0 String str2, boolean z10) {
        return this.f120734a.c(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void o(String str, @p0 String str2, @p0 Bundle bundle) {
        this.f120734a.H(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final List p(@p0 String str, @p0 String str2) {
        return this.f120734a.I(str, str2);
    }
}

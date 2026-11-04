package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.measurement.internal.ua;
import com.google.android.gms.measurement.internal.v8;
import com.google.android.gms.measurement.internal.w8;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ua f109724a;

    public c(ua uaVar) {
        super(null);
        w.r(uaVar);
        this.f109724a = uaVar;
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final String R() {
        return this.f109724a.R();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final String T() {
        return this.f109724a.T();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void a(String str, String str2, Bundle bundle) {
        this.f109724a.a(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final long b() {
        return this.f109724a.b();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void c(String str) {
        this.f109724a.c(str);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final String d() {
        return this.f109724a.d();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void e(String str, String str2, Bundle bundle, long j10) {
        this.f109724a.e(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final String f() {
        return this.f109724a.f();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void g(String str) {
        this.f109724a.g(str);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final int h(String str) {
        return this.f109724a.h(str);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void i(v8 v8Var) {
        this.f109724a.i(v8Var);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void j(w8 w8Var) {
        this.f109724a.j(w8Var);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void k(w8 w8Var) {
        this.f109724a.k(w8Var);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void l(Bundle bundle) {
        this.f109724a.l(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final Object m(int i10) {
        return this.f109724a.m(i10);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final Map n(String str, String str2, boolean z10) {
        return this.f109724a.n(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final void o(String str, String str2, Bundle bundle) {
        this.f109724a.o(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    public final List p(String str, String str2) {
        return this.f109724a.p(str, str2);
    }

    @Override // com.google.android.gms.measurement.d
    public final Map q(boolean z10) {
        return this.f109724a.n(null, null, z10);
    }

    @Override // com.google.android.gms.measurement.d
    public final Boolean r() {
        return (Boolean) this.f109724a.m(4);
    }

    @Override // com.google.android.gms.measurement.d
    public final Integer s() {
        return (Integer) this.f109724a.m(3);
    }

    @Override // com.google.android.gms.measurement.d
    public final String t() {
        return (String) this.f109724a.m(0);
    }

    @Override // com.google.android.gms.measurement.d
    public final Long u() {
        return (Long) this.f109724a.m(1);
    }

    @Override // com.google.android.gms.measurement.d
    public final Double v() {
        return (Double) this.f109724a.m(2);
    }
}

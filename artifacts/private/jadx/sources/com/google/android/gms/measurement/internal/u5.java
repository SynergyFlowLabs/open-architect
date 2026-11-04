package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f110576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f110577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f110578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ w5 f110579d;

    u5(w5 w5Var, int i10, boolean z10, boolean z11) {
        Objects.requireNonNull(w5Var);
        this.f110579d = w5Var;
        this.f110576a = i10;
        this.f110577b = z10;
        this.f110578c = z11;
    }

    public final void a(String str) {
        this.f110579d.y(this.f110576a, this.f110577b, this.f110578c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f110579d.y(this.f110576a, this.f110577b, this.f110578c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f110579d.y(this.f110576a, this.f110577b, this.f110578c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f110579d.y(this.f110576a, this.f110577b, this.f110578c, str, obj, obj2, obj3);
    }
}

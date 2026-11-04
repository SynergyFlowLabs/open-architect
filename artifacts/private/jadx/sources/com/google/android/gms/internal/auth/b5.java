package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class b5 implements i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w4 f107587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z5 f107588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k3 f107589c;

    private b5(z5 z5Var, k3 k3Var, w4 w4Var) {
        this.f107588b = z5Var;
        this.f107589c = k3Var;
        this.f107587a = w4Var;
    }

    static b5 a(z5 z5Var, k3 k3Var, w4 w4Var) {
        return new b5(z5Var, k3Var, w4Var);
    }

    @Override // com.google.android.gms.internal.auth.i5
    public final void b(Object obj) {
        this.f107588b.e(obj);
        this.f107589c.b(obj);
    }

    @Override // com.google.android.gms.internal.auth.i5
    public final int c(Object obj) {
        return this.f107588b.b(obj).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.i5
    public final boolean d(Object obj, Object obj2) {
        return this.f107588b.b(obj).equals(this.f107588b.b(obj2));
    }

    @Override // com.google.android.gms.internal.auth.i5
    public final void e(Object obj, byte[] bArr, int i10, int i11, q2 q2Var) throws IOException {
        t3 t3Var = (t3) obj;
        if (t3Var.zzc == b6.a()) {
            t3Var.zzc = b6.d();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.i5
    public final void f(Object obj, Object obj2) {
        k5.d(this.f107588b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.i5
    public final boolean g(Object obj) {
        this.f107589c.a(obj);
        int i10 = 2 >> 0;
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.i5
    public final Object m() {
        w4 w4Var = this.f107587a;
        return w4Var instanceof t3 ? ((t3) w4Var).c() : ((r3) ((t3) w4Var).o(5, null, null)).m();
    }
}

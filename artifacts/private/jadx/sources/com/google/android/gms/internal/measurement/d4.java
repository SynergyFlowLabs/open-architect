package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    final x f108353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    final e5 f108354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.common.annotations.e
    final e5 f108355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.google.common.annotations.e
    final h8 f108356d;

    public d4() {
        x xVar = new x();
        this.f108353a = xVar;
        e5 e5Var = new e5(null, xVar);
        this.f108355c = e5Var;
        this.f108354b = e5Var.c();
        h8 h8Var = new h8();
        this.f108356d = h8Var;
        e5Var.e("require", new oh(h8Var));
        h8Var.a("internal.platform", c3.f108328a);
        e5Var.e("runtime.counter", new i(Double.valueOf(0.0d)));
    }

    public final p a(e5 e5Var, m8... m8VarArr) {
        p pVarB = p.S1;
        for (m8 m8Var : m8VarArr) {
            pVarB = g7.b(m8Var);
            f6.l(this.f108355c);
            if ((pVarB instanceof q) || (pVarB instanceof o)) {
                pVarB = this.f108353a.b(e5Var, pVarB);
            }
        }
        return pVarB;
    }
}

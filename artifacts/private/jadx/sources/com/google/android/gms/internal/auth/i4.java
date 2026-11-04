package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class i4 extends k4 {
    /* synthetic */ i4(h4 h4Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.k4
    final void a(Object obj, long j10) {
        ((x3) k6.f(obj, j10)).g();
    }

    @Override // com.google.android.gms.internal.auth.k4
    final void b(Object obj, Object obj2, long j10) {
        x3 x3VarE = (x3) k6.f(obj, j10);
        x3 x3Var = (x3) k6.f(obj2, j10);
        int size = x3VarE.size();
        int size2 = x3Var.size();
        if (size > 0 && size2 > 0) {
            if (!x3VarE.h()) {
                x3VarE = x3VarE.e(size2 + size);
            }
            x3VarE.addAll(x3Var);
        }
        if (size > 0) {
            x3Var = x3VarE;
        }
        k6.p(obj, j10, x3Var);
    }

    private i4() {
        super(null);
    }
}

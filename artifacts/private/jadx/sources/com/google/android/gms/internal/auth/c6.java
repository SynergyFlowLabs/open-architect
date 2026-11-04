package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class c6 extends z5 {
    c6() {
    }

    @Override // com.google.android.gms.internal.auth.z5
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        t3 t3Var = (t3) obj;
        b6 b6Var = t3Var.zzc;
        if (b6Var != b6.a()) {
            return b6Var;
        }
        b6 b6VarD = b6.d();
        t3Var.zzc = b6VarD;
        return b6VarD;
    }

    @Override // com.google.android.gms.internal.auth.z5
    final /* synthetic */ Object b(Object obj) {
        return ((t3) obj).zzc;
    }

    @Override // com.google.android.gms.internal.auth.z5
    final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2) {
        if (!b6.a().equals(obj2)) {
            if (b6.a().equals(obj)) {
                return b6.c((b6) obj, (b6) obj2);
            }
            ((b6) obj).b((b6) obj2);
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.z5
    final /* bridge */ /* synthetic */ void d(Object obj, int i10, long j10) {
        ((b6) obj).h(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.auth.z5
    final void e(Object obj) {
        ((t3) obj).zzc.f();
    }

    @Override // com.google.android.gms.internal.auth.z5
    final /* synthetic */ void f(Object obj, Object obj2) {
        ((t3) obj).zzc = (b6) obj2;
    }
}

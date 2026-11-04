package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes4.dex */
final class c3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.v f105977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e3 f105978b;

    c3(e3 e3Var, com.google.android.gms.common.api.v vVar) {
        this.f105977a = vVar;
        this.f105978b = e3Var;
    }

    @Override // java.lang.Runnable
    @androidx.annotation.m1
    public final void run() {
        com.google.android.gms.common.api.l lVar;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.f105940p;
                threadLocal.set(Boolean.TRUE);
                com.google.android.gms.common.api.p pVarC = ((com.google.android.gms.common.api.y) com.google.android.gms.common.internal.w.r(this.f105978b.f106008a)).c(this.f105977a);
                e3 e3Var = this.f105978b;
                e3Var.f106015h.sendMessage(e3Var.f106015h.obtainMessage(0, pVarC));
                threadLocal.set(Boolean.FALSE);
                e3 e3Var2 = this.f105978b;
                e3.q(this.f105977a);
                lVar = (com.google.android.gms.common.api.l) this.f105978b.f106014g.get();
                if (lVar == null) {
                    return;
                }
            } catch (RuntimeException e10) {
                e3 e3Var3 = this.f105978b;
                e3Var3.f106015h.sendMessage(e3Var3.f106015h.obtainMessage(1, e10));
                BasePendingResult.f105940p.set(Boolean.FALSE);
                e3 e3Var4 = this.f105978b;
                e3.q(this.f105977a);
                lVar = (com.google.android.gms.common.api.l) this.f105978b.f106014g.get();
                if (lVar == null) {
                    return;
                }
            }
            lVar.I(this.f105978b);
        } catch (Throwable th2) {
            BasePendingResult.f105940p.set(Boolean.FALSE);
            e3 e3Var5 = this.f105978b;
            e3.q(this.f105977a);
            com.google.android.gms.common.api.l lVar2 = (com.google.android.gms.common.api.l) this.f105978b.f106014g.get();
            if (lVar2 != null) {
                lVar2.I(this.f105978b);
            }
            throw th2;
        }
    }
}

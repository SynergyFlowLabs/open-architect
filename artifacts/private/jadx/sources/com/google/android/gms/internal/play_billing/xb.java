package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class xb extends r4 {
    xb() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.r4
    final void a(yb ybVar, yb ybVar2) {
        ybVar.f109454b = ybVar2;
    }

    @Override // com.google.android.gms.internal.play_billing.r4
    final void b(yb ybVar, Thread thread) {
        ybVar.f109453a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.r4
    final boolean c(ac acVar, v8 v8Var, v8 v8Var2) {
        synchronized (acVar) {
            try {
                if (acVar.f109049b != v8Var) {
                    return false;
                }
                acVar.f109049b = v8Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.r4
    final boolean d(ac acVar, Object obj, Object obj2) {
        synchronized (acVar) {
            try {
                if (acVar.f109048a != obj) {
                    return false;
                }
                acVar.f109048a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.r4
    final boolean e(ac acVar, yb ybVar, yb ybVar2) {
        synchronized (acVar) {
            try {
                if (acVar.f109050c != ybVar) {
                    return false;
                }
                acVar.f109050c = ybVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

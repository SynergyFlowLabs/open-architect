package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class i3 extends c3 {
    private i3() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final f3 a(n3 n3Var, f3 f3Var) {
        f3 f3Var2;
        synchronized (n3Var) {
            try {
                f3Var2 = n3Var.f109234b;
                if (f3Var2 != f3Var) {
                    n3Var.f109234b = f3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f3Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final m3 b(n3 n3Var, m3 m3Var) {
        m3 m3Var2;
        synchronized (n3Var) {
            try {
                m3Var2 = n3Var.f109235c;
                if (m3Var2 != m3Var) {
                    n3Var.f109235c = m3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m3Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final void c(m3 m3Var, @fj.a m3 m3Var2) {
        m3Var.f109204b = m3Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final void d(m3 m3Var, Thread thread) {
        m3Var.f109203a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final boolean e(n3 n3Var, @fj.a f3 f3Var, f3 f3Var2) {
        synchronized (n3Var) {
            try {
                if (n3Var.f109234b != f3Var) {
                    return false;
                }
                n3Var.f109234b = f3Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final boolean f(n3 n3Var, @fj.a Object obj, Object obj2) {
        synchronized (n3Var) {
            try {
                if (n3Var.f109233a != obj) {
                    return false;
                }
                n3Var.f109233a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final boolean g(n3 n3Var, @fj.a m3 m3Var, @fj.a m3 m3Var2) {
        synchronized (n3Var) {
            try {
                if (n3Var.f109235c != m3Var) {
                    return false;
                }
                n3Var.f109235c = m3Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* synthetic */ i3(s3 s3Var) {
        super(null);
    }
}

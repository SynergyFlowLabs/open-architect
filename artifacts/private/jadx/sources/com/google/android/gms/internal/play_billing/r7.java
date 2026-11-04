package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public class r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile h8 f109304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile d6 f109305b;

    public final int a() {
        if (this.f109305b != null) {
            return ((b6) this.f109305b).f109056c.length;
        }
        if (this.f109304a != null) {
            return this.f109304a.d();
        }
        return 0;
    }

    public final d6 b() {
        if (this.f109305b != null) {
            return this.f109305b;
        }
        synchronized (this) {
            try {
                if (this.f109305b != null) {
                    return this.f109305b;
                }
                if (this.f109304a == null) {
                    this.f109305b = d6.f109102b;
                } else {
                    this.f109305b = this.f109304a.c();
                }
                return this.f109305b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final h8 c(h8 h8Var) {
        h8 h8Var2 = this.f109304a;
        this.f109305b = null;
        this.f109304a = h8Var;
        return h8Var2;
    }

    protected final void d(h8 h8Var) {
        if (this.f109304a != null) {
            return;
        }
        synchronized (this) {
            if (this.f109304a != null) {
                return;
            }
            try {
                this.f109304a = h8Var;
                this.f109305b = d6.f109102b;
            } catch (l7 unused) {
                this.f109304a = h8Var;
                this.f109305b = d6.f109102b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        h8 h8Var = this.f109304a;
        h8 h8Var2 = r7Var.f109304a;
        if (h8Var == null && h8Var2 == null) {
            return b().equals(r7Var.b());
        }
        if (h8Var != null && h8Var2 != null) {
            return h8Var.equals(h8Var2);
        }
        if (h8Var != null) {
            r7Var.d(h8Var.f());
            return h8Var.equals(r7Var.f109304a);
        }
        d(h8Var2.f());
        return this.f109304a.equals(h8Var2);
    }

    public int hashCode() {
        return 1;
    }
}

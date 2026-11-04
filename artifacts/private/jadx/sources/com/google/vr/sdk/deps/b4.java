package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
public class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k2 f127710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile t4 f127711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile k2 f127712c;

    static {
        x2.b();
    }

    public final t4 a(t4 t4Var) {
        if (this.f127711b == null) {
            synchronized (this) {
                try {
                    if (this.f127711b == null) {
                        try {
                            this.f127711b = t4Var;
                            this.f127712c = k2.f129465b;
                        } catch (v3 unused) {
                            this.f127711b = t4Var;
                            this.f127712c = k2.f129465b;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f127711b;
    }

    public final int b() {
        if (this.f127712c != null) {
            return this.f127712c.v();
        }
        if (this.f127711b != null) {
            return this.f127711b.w1();
        }
        return 0;
    }

    public final t4 c(t4 t4Var) {
        t4 t4Var2 = this.f127711b;
        this.f127710a = null;
        this.f127712c = null;
        this.f127711b = t4Var;
        return t4Var2;
    }

    public final k2 d() {
        if (this.f127712c != null) {
            return this.f127712c;
        }
        synchronized (this) {
            try {
                if (this.f127712c != null) {
                    return this.f127712c;
                }
                if (this.f127711b == null) {
                    this.f127712c = k2.f129465b;
                } else {
                    this.f127712c = this.f127711b.u1();
                }
                return this.f127712c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        t4 t4Var = this.f127711b;
        t4 t4Var2 = b4Var.f127711b;
        if (t4Var == null && t4Var2 == null) {
            return d().equals(b4Var.d());
        }
        if (t4Var == null || t4Var2 == null) {
            return t4Var != null ? t4Var.equals(b4Var.a(t4Var.g1())) : a(t4Var2.g1()).equals(t4Var2);
        }
        return t4Var.equals(t4Var2);
    }

    public int hashCode() {
        return 1;
    }
}

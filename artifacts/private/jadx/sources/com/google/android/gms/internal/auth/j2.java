package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class j2 implements g2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g2 f107666c = new g2() { // from class: com.google.android.gms.internal.auth.i2
        @Override // com.google.android.gms.internal.auth.g2
        public final Object a() {
            throw new IllegalStateException();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile g2 f107667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private Object f107668b;

    j2(g2 g2Var) {
        this.f107667a = g2Var;
    }

    @Override // com.google.android.gms.internal.auth.g2
    public final Object a() {
        g2 g2Var = this.f107667a;
        g2 g2Var2 = f107666c;
        if (g2Var != g2Var2) {
            synchronized (this) {
                try {
                    if (this.f107667a != g2Var2) {
                        Object objA = this.f107667a.a();
                        this.f107668b = objA;
                        this.f107667a = g2Var2;
                        return objA;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f107668b;
    }

    public final String toString() {
        Object obj = this.f107667a;
        if (obj == f107666c) {
            obj = "<supplier that returned " + String.valueOf(this.f107668b) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }
}

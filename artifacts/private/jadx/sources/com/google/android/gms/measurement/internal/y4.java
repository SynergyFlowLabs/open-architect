package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class y4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f110715g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f110716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0 f110717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f110718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f110719d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("overrideLock")
    private volatile Object f110720e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0("cachingLock")
    private volatile Object f110721f = null;

    /* synthetic */ y4(String str, Object obj, Object obj2, k0 k0Var, byte[] bArr) {
        this.f110716a = str;
        this.f110718c = obj;
        this.f110717b = k0Var;
    }

    public final String a() {
        return this.f110716a;
    }

    public final Object b(Object obj) {
        Object objA;
        synchronized (this.f110719d) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj != null) {
            return obj;
        }
        if (s4.f110466a == null) {
            return this.f110718c;
        }
        synchronized (f110715g) {
            try {
                if (f.a()) {
                    return this.f110721f == null ? this.f110718c : this.f110721f;
                }
                try {
                    for (y4 y4Var : z4.f110745a) {
                        if (f.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objA2 = null;
                        try {
                            k0 k0Var = y4Var.f110717b;
                            if (k0Var != null) {
                                objA2 = k0Var.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f110715g) {
                            try {
                                y4Var.f110721f = objA2;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (SecurityException unused2) {
                }
                k0 k0Var2 = this.f110717b;
                if (k0Var2 == null) {
                    objA = this.f110718c;
                } else {
                    try {
                        objA = k0Var2.a();
                    } catch (IllegalStateException | SecurityException unused3) {
                        objA = this.f110718c;
                    }
                }
                return objA;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}

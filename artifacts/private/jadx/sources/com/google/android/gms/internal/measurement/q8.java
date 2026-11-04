package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("GservicesDelegateSupplier.class")
    @androidx.annotation.p0
    private static p8 f108751a;

    public static synchronized void a(p8 p8Var) {
        if (f108751a != null) {
            throw new IllegalStateException("init() already called");
        }
        f108751a = p8Var;
    }

    public static synchronized p8 b() {
        try {
            if (f108751a == null) {
                a(new t8());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f108751a;
    }
}

package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class z6 implements f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z6 f109458a = new z6();

    private z6() {
    }

    public static z6 c() {
        return f109458a;
    }

    @Override // com.google.android.gms.internal.play_billing.f8
    public final e8 a(Class cls) {
        if (!e7.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (e8) e7.q(cls.asSubclass(e7.class)).m(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.f8
    public final boolean b(Class cls) {
        return e7.class.isAssignableFrom(cls);
    }
}

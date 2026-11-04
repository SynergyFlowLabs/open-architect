package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class q3 implements u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q3 f107766a = new q3();

    private q3() {
    }

    public static q3 c() {
        return f107766a;
    }

    @Override // com.google.android.gms.internal.auth.u4
    public final t4 a(Class cls) {
        if (!t3.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (t4) t3.b(cls.asSubclass(t3.class)).o(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.auth.u4
    public final boolean b(Class cls) {
        return t3.class.isAssignableFrom(cls);
    }
}

package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
final class h3 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h3 f129418a = new h3();

    private h3() {
    }

    public static h3 c() {
        return f129418a;
    }

    @Override // com.google.vr.sdk.deps.s4
    public final boolean a(Class<?> cls) {
        return i3.class.isAssignableFrom(cls);
    }

    @Override // com.google.vr.sdk.deps.s4
    public final r4 b(Class<?> cls) {
        if (!i3.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (r4) i3.p(cls.asSubclass(i3.class)).i();
        } catch (Exception e10) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
        }
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class lb implements wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final lb f108619a = new lb();

    private lb() {
    }

    public static lb c() {
        return f108619a;
    }

    @Override // com.google.android.gms.internal.measurement.wc
    public final boolean a(Class cls) {
        return qb.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.wc
    public final vc b(Class cls) {
        if (!qb.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (vc) qb.s(cls.asSubclass(qb.class)).D(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}

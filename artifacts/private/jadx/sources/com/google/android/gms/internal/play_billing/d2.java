package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
enum d2 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final u1 f109095t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f109097a;

    static {
        t1 t1Var = new t1();
        for (d2 d2Var : values()) {
            t1Var.a(Integer.valueOf(d2Var.f109097a), d2Var);
        }
        f109095t = t1Var.b();
    }

    d2(int i10) {
        this.f109097a = i10;
    }

    static d2 b(int i10) {
        u1 u1Var = f109095t;
        Integer numValueOf = Integer.valueOf(i10);
        return !u1Var.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (d2) u1Var.get(numValueOf);
    }
}

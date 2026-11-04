package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public enum ka {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f109184a;

    ka(int i10) {
        this.f109184a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f109184a);
    }
}

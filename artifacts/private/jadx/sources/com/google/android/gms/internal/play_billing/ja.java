package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class ja implements g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final g7 f109154a = new ja();

    private ja() {
    }

    @Override // com.google.android.gms.internal.play_billing.g7
    public final boolean o(int i10) {
        ka kaVar;
        if (i10 == 0) {
            kaVar = ka.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i10 == 1) {
            kaVar = ka.PURCHASES_UPDATED_ACTION;
        } else if (i10 != 2) {
            kaVar = i10 != 3 ? null : ka.ALTERNATIVE_BILLING_ACTION;
        } else {
            kaVar = ka.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        return kaVar != null;
    }
}

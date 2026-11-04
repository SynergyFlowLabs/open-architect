package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class ve implements ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f108930a;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        boolean z10 = true | true;
        p9VarB.d("measurement.client.3p_consent_state_v1", true);
        f108930a = p9VarB.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.ue
    public final long a() {
        return ((Long) f108930a.d()).longValue();
    }
}

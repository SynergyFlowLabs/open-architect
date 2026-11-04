package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class vf implements uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f108931a;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        p9VarB.d("measurement.gbraid_campaign.gbraid.client", true);
        f108931a = p9VarB.d("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.uf
    public final boolean a() {
        return ((Boolean) f108931a.d()).booleanValue();
    }
}

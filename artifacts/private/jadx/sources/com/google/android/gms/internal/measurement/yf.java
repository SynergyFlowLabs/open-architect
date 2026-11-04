package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class yf implements xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f109002a;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        p9VarB.d("measurement.gmscore_feature_tracking", true);
        f109002a = p9VarB.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.xf
    public final boolean a() {
        return ((Boolean) f109002a.d()).booleanValue();
    }
}

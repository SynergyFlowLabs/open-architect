package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class xg implements wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f108974a;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        f108974a = p9VarB.d("measurement.client.sessions.enable_fix_background_engagement", false);
        p9VarB.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        p9VarB.c("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.wg
    public final boolean a() {
        return ((Boolean) f108974a.d()).booleanValue();
    }
}

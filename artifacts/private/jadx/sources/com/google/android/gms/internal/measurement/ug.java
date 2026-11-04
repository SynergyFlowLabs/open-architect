package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class ug implements tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f108907a;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        f108907a = p9VarB.d("measurement.session_stitching_token_enabled", false);
        p9VarB.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.tg
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.tg
    public final boolean g() {
        return ((Boolean) f108907a.d()).booleanValue();
    }
}

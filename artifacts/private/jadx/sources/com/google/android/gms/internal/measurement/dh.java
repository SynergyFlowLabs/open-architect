package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class dh implements ch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f108372a;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        f108372a = p9VarB.d("measurement.tcf.consent_fix", true);
        p9VarB.d("measurement.tcf.client", true);
        p9VarB.d("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.ch
    public final boolean a() {
        return ((Boolean) f108372a.d()).booleanValue();
    }
}

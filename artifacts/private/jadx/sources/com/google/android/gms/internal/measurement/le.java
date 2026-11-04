package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class le implements ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f108622a;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        f108622a = p9VarB.d("measurement.service.ad_impression.convert_value_to_double", true);
        p9VarB.d("measurement.service.separate_public_internal_event_blacklisting", true);
        p9VarB.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final boolean a() {
        return ((Boolean) f108622a.d()).booleanValue();
    }
}

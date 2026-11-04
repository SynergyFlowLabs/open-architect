package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class bf implements af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f108316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v9 f108317b;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        f108316a = p9VarB.d("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        f108317b = p9VarB.d("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.af
    public final boolean a() {
        return ((Boolean) f108316a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.af
    public final boolean g() {
        return ((Boolean) f108317b.d()).booleanValue();
    }
}

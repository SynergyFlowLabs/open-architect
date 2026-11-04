package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class ye implements xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f109000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v9 f109001b;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        p9VarB.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        p9VarB.d("measurement.set_default_event_parameters_with_backfill.service", true);
        p9VarB.c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f109000a = p9VarB.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f109001b = p9VarB.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        p9VarB.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.xe
    public final boolean a() {
        return ((Boolean) f109000a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.xe
    public final boolean g() {
        return ((Boolean) f109001b.d()).booleanValue();
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class kg implements jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f108607a;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        f108607a = p9VarB.d("measurement.add_first_launch_logging_timestamp.service", false);
        p9VarB.c("measurement.id.add_first_launch_logging_timestamp.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.jg
    public final boolean a() {
        return ((Boolean) f108607a.d()).booleanValue();
    }
}

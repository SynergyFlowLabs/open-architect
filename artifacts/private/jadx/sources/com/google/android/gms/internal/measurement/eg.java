package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class eg implements dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f108394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v9 f108395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v9 f108396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v9 f108397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v9 f108398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9 f108399f;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        f108394a = p9VarB.d("measurement.test.boolean_flag", false);
        f108395b = p9VarB.c("measurement.test.cached_long_flag", -1L);
        f108396c = p9VarB.e("measurement.test.double_flag", -3.0d);
        f108397d = p9VarB.c("measurement.test.int_flag", -2L);
        f108398e = p9VarB.c("measurement.test.long_flag", -1L);
        f108399f = p9VarB.f("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.dg
    public final boolean a() {
        return ((Boolean) f108394a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.dg
    public final String c() {
        return (String) f108399f.d();
    }

    @Override // com.google.android.gms.internal.measurement.dg
    public final long g() {
        return ((Long) f108395b.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.dg
    public final double h() {
        return ((Double) f108396c.d()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.dg
    public final long j() {
        return ((Long) f108398e.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.dg
    public final long m() {
        return ((Long) f108397d.d()).longValue();
    }
}

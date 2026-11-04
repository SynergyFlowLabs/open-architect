package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class lf implements kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f108623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v9 f108624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v9 f108625c;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        p9VarB.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f108623a = p9VarB.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f108624b = p9VarB.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f108625c = p9VarB.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.kf
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.kf
    public final boolean g() {
        return ((Boolean) f108623a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kf
    public final boolean h() {
        return ((Boolean) f108624b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kf
    public final boolean m() {
        return ((Boolean) f108625c.d()).booleanValue();
    }
}

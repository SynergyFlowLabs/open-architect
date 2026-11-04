package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class hg implements gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f108548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v9 f108549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v9 f108550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v9 f108551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v9 f108552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9 f108553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9 f108554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9 f108555h;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        p9VarB.d("measurement.rb.attribution.ad_campaign_info", true);
        p9VarB.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f108548a = p9VarB.d("measurement.rb.attribution.client2", true);
        f108549b = p9VarB.d("measurement.rb.attribution.followup1.service", false);
        p9VarB.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f108550c = p9VarB.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        p9VarB.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f108551d = p9VarB.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f108552e = p9VarB.d("measurement.rb.attribution.retry_disposition", false);
        f108553f = p9VarB.d("measurement.rb.attribution.service", true);
        f108554g = p9VarB.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f108555h = p9VarB.d("measurement.rb.attribution.uuid_generation", true);
        p9VarB.c("measurement.id.rb.attribution.retry_disposition", 0L);
        p9VarB.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final boolean R() {
        return ((Boolean) f108554g.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final boolean c() {
        return ((Boolean) f108552e.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final boolean f() {
        return ((Boolean) f108555h.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final boolean g() {
        return ((Boolean) f108548a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final boolean h() {
        return ((Boolean) f108549b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final boolean j() {
        return ((Boolean) f108551d.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final boolean m() {
        return ((Boolean) f108550c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final boolean q() {
        return ((Boolean) f108553f.d()).booleanValue();
    }
}

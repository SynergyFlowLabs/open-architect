package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: classes4.dex */
final class k6 extends l8 {
    static final Pair A = new Pair("", 0L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f110158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SharedPreferences f110159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i6 f110160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h6 f110161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h6 f110162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j6 f110163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f110164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f110165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f110166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h6 f110167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f6 f110168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j6 f110169n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g6 f110170o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f6 f110171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h6 f110172q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h6 f110173r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f110174s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f6 f110175t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f6 f110176u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h6 f110177v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j6 f110178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j6 f110179x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h6 f110180y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g6 f110181z;

    k6(h7 h7Var) {
        super(h7Var);
        this.f110167l = new h6(this, "session_timeout", 1800000L);
        this.f110168m = new f6(this, "start_new_session", true);
        this.f110172q = new h6(this, "last_pause_time", 0L);
        this.f110173r = new h6(this, "session_id", 0L);
        this.f110169n = new j6(this, "non_personalized_ads", null);
        this.f110170o = new g6(this, "last_received_uri_timestamps_by_source", null);
        this.f110171p = new f6(this, "allow_remote_dynamite", false);
        this.f110161f = new h6(this, "first_open_time", 0L);
        this.f110162g = new h6(this, "app_install_time", 0L);
        this.f110163h = new j6(this, "app_instance_id", null);
        this.f110175t = new f6(this, "app_backgrounded", false);
        this.f110176u = new f6(this, "deep_link_retrieval_complete", false);
        this.f110177v = new h6(this, "deep_link_retrieval_attempts", 0L);
        this.f110178w = new j6(this, "firebase_feature_rollouts", null);
        this.f110179x = new j6(this, "deferred_attribution_cache", null);
        this.f110180y = new h6(this, "deferred_attribution_cache_timestamp", 0L);
        this.f110181z = new g6(this, "default_event_parameters", null);
    }

    final boolean A(long j10) {
        return j10 - this.f110167l.a() > this.f110172q.a();
    }

    @Override // com.google.android.gms.measurement.internal.l8
    protected final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.l8
    @il.d.a({@il.d({"this.preferences"}), @il.d({"this.monitoringSample"})})
    @androidx.annotation.m1
    protected final void j() {
        h7 h7Var = this.f110184a;
        SharedPreferences sharedPreferences = h7Var.d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f110158c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f110174s = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.f110158c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        h7Var.w();
        this.f110160e = new i6(this, "health_monitor", Math.max(0L, ((Long) z4.f110754d.b(null)).longValue()), null);
    }

    @androidx.annotation.m1
    final Pair o(String str) {
        h();
        if (!w().o(q8.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        h7 h7Var = this.f110184a;
        long jB = h7Var.e().b();
        String str2 = this.f110164i;
        if (str2 != null && jB < this.f110166k) {
            return new Pair(str2, Boolean.valueOf(this.f110165j));
        }
        this.f110166k = jB + h7Var.w().D(str, z4.f110748b);
        AdvertisingIdClient.c(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(h7Var.d());
            this.f110164i = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.f110164i = id2;
            }
            this.f110165j = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e10) {
            this.f110184a.a().v().b("Unable to get advertising id", e10);
            this.f110164i = "";
        }
        AdvertisingIdClient.c(false);
        return new Pair(this.f110164i, Boolean.valueOf(this.f110165j));
    }

    @com.google.common.annotations.e
    @androidx.annotation.m1
    protected final SharedPreferences p() {
        h();
        l();
        com.google.android.gms.common.internal.w.r(this.f110158c);
        return this.f110158c;
    }

    @androidx.annotation.m1
    protected final SharedPreferences q() {
        h();
        l();
        if (this.f110159d == null) {
            h7 h7Var = this.f110184a;
            String strValueOf = String.valueOf(h7Var.d().getPackageName());
            u5 u5VarW = h7Var.a().w();
            String strConcat = strValueOf.concat("_preferences");
            u5VarW.b("Default prefs file", strConcat);
            this.f110159d = h7Var.d().getSharedPreferences(strConcat, 0);
        }
        return this.f110159d;
    }

    final SparseArray r() {
        Bundle bundleA = this.f110170o.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f110184a.a().o().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    @androidx.annotation.m1
    final void s(Boolean bool) {
        h();
        SharedPreferences.Editor editorEdit = p().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    @androidx.annotation.m1
    final Boolean t() {
        h();
        if (p().contains("measurement_enabled")) {
            return Boolean.valueOf(p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @androidx.annotation.m1
    final x u() {
        h();
        return x.g(p().getString("dma_consent_settings", null));
    }

    @androidx.annotation.m1
    final boolean v(int i10) {
        return r8.u(i10, p().getInt("consent_source", 100));
    }

    @androidx.annotation.m1
    final r8 w() {
        h();
        return r8.f(p().getString("consent_settings", "G1"), p().getInt("consent_source", 100));
    }

    @androidx.annotation.m1
    protected final boolean x(qd qdVar) {
        h();
        String string = p().getString("stored_tcf_param", "");
        String strA = qdVar.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    @androidx.annotation.m1
    final void y(boolean z10) {
        h();
        this.f110184a.a().w().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    @androidx.annotation.m1
    final boolean z() {
        SharedPreferences sharedPreferences = this.f110158c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}

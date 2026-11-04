package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zc extends be {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f110826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h6 f110827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h6 f110828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h6 f110829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h6 f110830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h6 f110831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h6 f110832j;

    zc(qe qeVar) {
        super(qeVar);
        this.f110826d = new HashMap();
        k6 k6VarX = this.f110184a.x();
        Objects.requireNonNull(k6VarX);
        this.f110827e = new h6(k6VarX, "last_delete_stale", 0L);
        k6 k6VarX2 = this.f110184a.x();
        Objects.requireNonNull(k6VarX2);
        this.f110828f = new h6(k6VarX2, "last_delete_stale_batch", 0L);
        k6 k6VarX3 = this.f110184a.x();
        Objects.requireNonNull(k6VarX3);
        this.f110829g = new h6(k6VarX3, "backoff", 0L);
        k6 k6VarX4 = this.f110184a.x();
        Objects.requireNonNull(k6VarX4);
        this.f110830h = new h6(k6VarX4, "last_upload", 0L);
        k6 k6VarX5 = this.f110184a.x();
        Objects.requireNonNull(k6VarX5);
        this.f110831i = new h6(k6VarX5, "last_upload_attempt", 0L);
        k6 k6VarX6 = this.f110184a.x();
        Objects.requireNonNull(k6VarX6);
        this.f110832j = new h6(k6VarX6, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.be
    protected final boolean l() {
        return false;
    }

    @androidx.annotation.m1
    final Pair m(String str, r8 r8Var) {
        return r8Var.o(q8.AD_STORAGE) ? n(str) : new Pair("", Boolean.FALSE);
    }

    @androidx.annotation.m1
    @Deprecated
    final Pair n(String str) {
        yc ycVar;
        AdvertisingIdClient.Info advertisingIdInfo;
        h();
        h7 h7Var = this.f110184a;
        long jB = h7Var.e().b();
        yc ycVar2 = (yc) this.f110826d.get(str);
        if (ycVar2 != null && jB < ycVar2.f110738c) {
            return new Pair(ycVar2.f110736a, Boolean.valueOf(ycVar2.f110737b));
        }
        AdvertisingIdClient.c(true);
        long jD = h7Var.w().D(str, z4.f110748b) + jB;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(h7Var.d());
            } catch (PackageManager.NameNotFoundException unused) {
                advertisingIdInfo = null;
                if (ycVar2 != null && jB < ycVar2.f110738c + this.f110184a.w().D(str, z4.f110751c)) {
                    return new Pair(ycVar2.f110736a, Boolean.valueOf(ycVar2.f110737b));
                }
            }
            if (advertisingIdInfo == null) {
                return new Pair(io.sentry.util.h0.f306956b, Boolean.FALSE);
            }
            String id2 = advertisingIdInfo.getId();
            ycVar = id2 != null ? new yc(id2, advertisingIdInfo.isLimitAdTrackingEnabled(), jD) : new yc("", advertisingIdInfo.isLimitAdTrackingEnabled(), jD);
            this.f110826d.put(str, ycVar);
            AdvertisingIdClient.c(false);
            return new Pair(ycVar.f110736a, Boolean.valueOf(ycVar.f110737b));
        } catch (Exception e10) {
            this.f110184a.a().v().b("Unable to get advertising id", e10);
            ycVar = new yc("", false, jD);
        }
    }

    @androidx.annotation.m1
    @Deprecated
    final String o(String str, boolean z10) {
        h();
        String str2 = z10 ? (String) n(str).first : io.sentry.util.h0.f306956b;
        MessageDigest messageDigestC = ze.C();
        if (messageDigestC == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestC.digest(str2.getBytes())));
    }
}

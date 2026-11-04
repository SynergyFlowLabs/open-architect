package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ea implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f109917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Uri f109918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f109919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f109920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ fa f109921e;

    ea(fa faVar, boolean z10, Uri uri, String str, String str2) {
        this.f109917a = z10;
        this.f109918b = uri;
        this.f109919c = str;
        this.f109920d = str2;
        Objects.requireNonNull(faVar);
        this.f109921e = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleS0;
        Bundle bundleS1;
        fa faVar = this.f109921e;
        ta taVar = faVar.f109956a;
        taVar.h();
        String str = this.f109920d;
        Uri uri = this.f109918b;
        try {
            h7 h7Var = taVar.f110184a;
            ze zeVarC = h7Var.C();
            if (TextUtils.isEmpty(str)) {
                bundleS0 = null;
            } else if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                bundleS0 = zeVarC.s0(Uri.parse("https://google.com/search?".concat(str)));
                if (bundleS0 != null) {
                    bundleS0.putString("_cis", "referrer");
                }
            } else {
                zeVarC.f110184a.a().v().a("Activity created with data 'referrer' without required params");
                bundleS0 = null;
            }
            String str2 = this.f109919c;
            if (this.f109917a && (bundleS1 = h7Var.C().s0(uri)) != null) {
                bundleS1.putString("_cis", "intent");
                if (!bundleS1.containsKey("gclid") && bundleS0 != null && bundleS0.containsKey("gclid")) {
                    bundleS1.putString("_cer", String.format("gclid=%s", bundleS0.getString("gclid")));
                }
                taVar.t(str2, com.google.firebase.messaging.e.f.f123542l, bundleS1);
                taVar.f110547r.b(str2, bundleS1);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            h7Var.a().v().b("Activity created with referrer", str);
            if (h7Var.w().H(null, z4.H0)) {
                if (bundleS0 != null) {
                    taVar.t(str2, com.google.firebase.messaging.e.f.f123542l, bundleS0);
                    taVar.f110547r.b(str2, bundleS0);
                } else {
                    h7Var.a().v().b("Referrer does not contain valid parameters", str);
                }
                taVar.y("auto", "_ldl", null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                h7Var.a().v().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                taVar.y("auto", "_ldl", str, true);
            }
        } catch (RuntimeException e10) {
            faVar.f109956a.f110184a.a().o().b("Throwable caught in handleReferrerForOnActivityCreated", e10);
        }
    }
}

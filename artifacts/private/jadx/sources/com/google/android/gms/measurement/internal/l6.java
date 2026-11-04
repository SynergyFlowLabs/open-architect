package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class l6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.s0 f110222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnection f110223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ m6 f110224c;

    l6(m6 m6Var, com.google.android.gms.internal.measurement.s0 s0Var, ServiceConnection serviceConnection) {
        this.f110222a = s0Var;
        this.f110223b = serviceConnection;
        Objects.requireNonNull(m6Var);
        this.f110224c = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleD6;
        m6 m6Var = this.f110224c;
        n6 n6Var = m6Var.f110249b;
        h7 h7Var = n6Var.f110284a;
        h7Var.b().h();
        Bundle bundle = new Bundle();
        String strA = m6Var.a();
        bundle.putString(io.sentry.z7.b.f307198c, strA);
        try {
            bundleD6 = this.f110222a.D6(bundle);
            if (bundleD6 == null) {
                h7Var.a().o().a("Install Referrer Service returned a null response");
                bundleD6 = null;
            }
        } catch (Exception e10) {
            n6Var.f110284a.a().o().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        h7 h7Var2 = n6Var.f110284a;
        h7Var2.b().h();
        h7.q();
        if (bundleD6 != null) {
            long j10 = bundleD6.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                h7Var2.a().r().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleD6.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    h7Var2.a().o().a("No referrer defined in Install Referrer response");
                } else {
                    h7Var2.a().w().b("InstallReferrer API result", string);
                    Bundle bundleS0 = h7Var2.C().s0(Uri.parse(com.planner5d.library.model.payments.a.f222474i.concat(string)));
                    if (bundleS0 == null) {
                        h7Var2.a().o().a("No campaign params defined in Install Referrer result");
                    } else {
                        List listAsList = Arrays.asList(((String) z4.f110768h1.b(null)).split(","));
                        Iterator<String> it = bundleS0.keySet().iterator();
                        while (it.hasNext()) {
                            if (listAsList.contains(it.next())) {
                                long j11 = bundleD6.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j11 <= 0) {
                                    break;
                                }
                                bundleS0.putLong("click_timestamp", j11);
                                break;
                            }
                        }
                        if (j10 == h7Var2.x().f110162g.a()) {
                            h7Var2.a().w().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (h7Var2.g()) {
                            h7Var2.x().f110162g.b(j10);
                            h7Var2.a().w().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleS0.putString("_cis", "referrer API v2");
                            h7Var2.B().w("auto", com.google.firebase.messaging.e.f.f123542l, bundleS0, strA);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.stats.a.b().c(h7Var2.d(), this.f110223b);
    }
}

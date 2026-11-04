package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h7 f110007a;

    public gf(h7 h7Var) {
        this.f110007a = h7Var;
    }

    @androidx.annotation.m1
    final void a() {
        h7 h7Var = this.f110007a;
        h7Var.b().h();
        if (e()) {
            if (d()) {
                h7Var.x().f110179x.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                h7Var.B().t("auto", "_cmpx", bundle);
            } else {
                String strA = h7Var.x().f110179x.a();
                if (TextUtils.isEmpty(strA)) {
                    h7Var.a().p().a("Cache still valid but referrer not found");
                } else {
                    long jA = h7Var.x().f110180y.a() / 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                    Object obj = pair.first;
                    h7Var.B().t(obj == null ? "app" : (String) obj, com.google.firebase.messaging.e.f.f123542l, (Bundle) pair.second);
                }
                h7Var.x().f110179x.b(null);
            }
            h7Var.x().f110180y.b(0L);
        }
    }

    @androidx.annotation.m1
    final void b(String str, Bundle bundle) {
        String string;
        h7 h7Var = this.f110007a;
        h7Var.b().h();
        if (h7Var.g()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        h7Var.x().f110179x.b(string);
        h7Var.x().f110180y.b(h7Var.e().currentTimeMillis());
    }

    final void c() {
        if (e() && d()) {
            this.f110007a.x().f110179x.b(null);
        }
    }

    final boolean d() {
        if (!e()) {
            return false;
        }
        h7 h7Var = this.f110007a;
        return h7Var.e().currentTimeMillis() - h7Var.x().f110180y.a() > h7Var.w().D(null, z4.f110776k0);
    }

    final boolean e() {
        return this.f110007a.x().f110180y.a() > 0;
    }
}

package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b6 extends be {
    public b6(qe qeVar) {
        super(qeVar);
    }

    @Override // com.google.android.gms.measurement.internal.be
    protected final boolean l() {
        return false;
    }

    public final boolean m() {
        j();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f110184a.d().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @androidx.annotation.m1
    public final void n(String str, ce ceVar, com.google.android.gms.internal.measurement.i7 i7Var, y5 y5Var) {
        b6 b6Var;
        String str2;
        h();
        j();
        try {
            URL url = new URI(ceVar.a()).toURL();
            this.f110700b.K0();
            byte[] bArrG = i7Var.g();
            b6Var = this;
            str2 = str;
            try {
                this.f110184a.b().w(new a6(b6Var, str2, url, bArrG, ceVar.b(), y5Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                b6Var.f110184a.a().o().c("Failed to parse URL. Not uploading MeasurementBatch. appId", w5.x(str2), ceVar.a());
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            b6Var = this;
            str2 = str;
        }
    }

    @androidx.annotation.m1
    public final void o(c6 c6Var, Map map, y5 y5Var) {
        b6 b6Var;
        h();
        j();
        com.google.android.gms.common.internal.w.r(c6Var);
        com.google.android.gms.common.internal.w.r(y5Var);
        de deVarC0 = this.f110700b.C0();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) z4.f110760f.b(null)).encodedAuthority((String) z4.f110763g.b(null)).path("config/app/".concat(String.valueOf(c6Var.r0()))).appendQueryParameter("platform", "android");
        deVarC0.f110184a.w().A();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", com.facebook.appevents.p.f99189d0);
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            b6Var = this;
            try {
                this.f110184a.b().w(new a6(b6Var, c6Var.o0(), url, null, map, y5Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                b6Var.f110184a.a().o().c("Failed to parse config URL. Not fetching. appId", w5.x(c6Var.o0()), string);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            b6Var = this;
        }
    }
}

package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.devtodev.core.data.metrics.MetricConsts;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.l1
@androidx.annotation.l0
final class fa implements Application.ActivityLifecycleCallbacks, da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ta f109956a;

    fa(ta taVar) {
        Objects.requireNonNull(taVar);
        this.f109956a = taVar;
    }

    @Override // com.google.android.gms.measurement.internal.da
    public final void a(zzdf zzdfVar, Bundle bundle) {
        this.f109956a.f110184a.I().y(zzdfVar, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.da
    public final void b(zzdf zzdfVar, Bundle bundle) throws Throwable {
        fa faVar;
        h7 h7Var;
        Uri uri;
        try {
            try {
                ta taVar = this.f109956a;
                h7 h7Var2 = taVar.f110184a;
                h7Var2.a().w().a("onActivityCreated");
                Intent intent = zzdfVar.f109037c;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        uri = null;
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        h7Var2.C();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? MetricConsts.GameSession : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        faVar = this;
                        try {
                            h7Var2.b().t(new ea(faVar, bundle == null, uri, str, queryParameter));
                        } catch (RuntimeException e10) {
                            e = e10;
                            faVar.f109956a.f110184a.a().o().b("Throwable caught in onActivityCreated", e);
                        }
                        h7Var = faVar.f109956a.f110184a;
                    }
                    h7Var.I().v(zzdfVar, bundle);
                }
                h7Var = taVar.f110184a;
            } catch (Throwable th2) {
                th = th2;
                faVar.f109956a.f110184a.I().v(zzdfVar, bundle);
                throw th;
            }
        } catch (RuntimeException e11) {
            e = e11;
            faVar = this;
        } catch (Throwable th3) {
            th = th3;
            faVar = this;
            faVar.f109956a.f110184a.I().v(zzdfVar, bundle);
            throw th;
        }
        h7Var.I().v(zzdfVar, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.da
    @androidx.annotation.l0
    public final void c(zzdf zzdfVar) {
        h7 h7Var = this.f109956a.f110184a;
        h7Var.I().x(zzdfVar);
        pd pdVarZ = h7Var.z();
        h7 h7Var2 = pdVarZ.f110184a;
        h7Var2.b().t(new hd(pdVarZ, h7Var2.e().b()));
    }

    @Override // com.google.android.gms.measurement.internal.da
    public final void d(zzdf zzdfVar) {
        this.f109956a.f110184a.I().z(zzdfVar);
    }

    @Override // com.google.android.gms.measurement.internal.da
    @androidx.annotation.l0
    public final void e(zzdf zzdfVar) {
        h7 h7Var = this.f109956a.f110184a;
        pd pdVarZ = h7Var.z();
        h7 h7Var2 = pdVarZ.f110184a;
        h7Var2.b().t(new gd(pdVarZ, h7Var2.e().b()));
        h7Var.I().w(zzdfVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        b(zzdf.O1(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d(zzdf.O1(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @androidx.annotation.l0
    public final void onActivityPaused(Activity activity) {
        c(zzdf.O1(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @androidx.annotation.l0
    public final void onActivityResumed(Activity activity) {
        e(zzdf.O1(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(zzdf.O1(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

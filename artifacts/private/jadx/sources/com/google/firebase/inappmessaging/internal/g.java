package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@x8.a
public class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f122631f = "Fetching campaigns from service.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f122632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.h f122633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Application f122634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.internal.time.a f122635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z2 f122636e;

    public g(ij.c<p0> cVar, com.google.firebase.h hVar, Application application, com.google.firebase.inappmessaging.internal.time.a aVar, z2 z2Var) {
        this.f122632a = cVar;
        this.f122633b = hVar;
        this.f122634c = application;
        this.f122635d = aVar;
        this.f122636e = z2Var;
    }

    private com.google.internal.firebase.inappmessaging.v1.sdkserving.e a(o2 o2Var) {
        return com.google.internal.firebase.inappmessaging.v1.sdkserving.e.nm().Vl(this.f122633b.s().j()).Rl(o2Var.b()).Tl(o2Var.c().b()).build();
    }

    private com.google.developers.mobile.targeting.proto.a.d b() {
        com.google.developers.mobile.targeting.proto.a.d.C1121a c1121aYl = com.google.developers.mobile.targeting.proto.a.d.rm().Wl(String.valueOf(Build.VERSION.SDK_INT)).Ul(Locale.getDefault().toString()).Yl(TimeZone.getDefault().getID());
        String strD = d();
        if (!TextUtils.isEmpty(strD)) {
            c1121aYl.Sl(strD);
        }
        return c1121aYl.build();
    }

    @fj.h
    private String d() {
        try {
            return this.f122634c.getPackageManager().getPackageInfo(this.f122634c.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            p2.b("Error finding versionName : " + e10.getMessage());
            int i10 = 5 >> 0;
            return null;
        }
    }

    private com.google.internal.firebase.inappmessaging.v1.sdkserving.i e(com.google.internal.firebase.inappmessaging.v1.sdkserving.i iVar) {
        if (iVar.ma() >= this.f122635d.a() + TimeUnit.MINUTES.toMillis(1L) && iVar.ma() <= this.f122635d.a() + TimeUnit.DAYS.toMillis(3L)) {
            return iVar;
        }
        return iVar.r1().Wl(this.f122635d.a() + TimeUnit.DAYS.toMillis(1L)).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.internal.firebase.inappmessaging.v1.sdkserving.i c(o2 o2Var, com.google.internal.firebase.inappmessaging.v1.sdkserving.b bVar) {
        p2.c(f122631f);
        this.f122636e.a();
        return e(this.f122632a.get().a(com.google.internal.firebase.inappmessaging.v1.sdkserving.g.Cm().em(this.f122633b.s().m()).Ol(bVar.O7()).dm(b()).hm(a(o2Var)).build()));
    }
}

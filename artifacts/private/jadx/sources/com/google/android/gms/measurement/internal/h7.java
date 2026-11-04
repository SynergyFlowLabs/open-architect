package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.fg;
import com.google.android.gms.internal.measurement.zzdd;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class h7 implements m8 {
    private static volatile h7 E;
    private int A;
    private int B;

    @androidx.annotation.l1
    final long D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f110018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f110019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f110020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f110021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k6 f110022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w5 f110023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d7 f110024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final pd f110025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ze f110026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p5 f110027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.util.g f110028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final mb f110029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ta f110030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final y1 f110031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ya f110032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f110033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private n5 f110034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private xc f110035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private z f110036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private k5 f110037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ab f110038u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Boolean f110040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f110041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile Boolean f110042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile boolean f110043z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f110039v = false;
    private final AtomicInteger C = new AtomicInteger(0);

    h7(y8 y8Var) {
        com.google.android.gms.common.internal.w.r(y8Var);
        Context context = y8Var.f110725a;
        f fVar = new f(context);
        this.f110020c = fVar;
        s4.f110466a = fVar;
        this.f110018a = context;
        this.f110019b = y8Var.f110729e;
        this.f110042y = y8Var.f110726b;
        this.f110033p = y8Var.f110731g;
        this.f110043z = true;
        com.google.android.gms.internal.measurement.v9.b(context);
        com.google.android.gms.common.util.g gVarD = com.google.android.gms.common.util.k.d();
        this.f110028k = gVarD;
        Long l10 = y8Var.f110730f;
        this.D = l10 != null ? l10.longValue() : gVarD.currentTimeMillis();
        this.f110021d = new k(this);
        k6 k6Var = new k6(this);
        k6Var.m();
        this.f110022e = k6Var;
        w5 w5Var = new w5(this);
        w5Var.m();
        this.f110023f = w5Var;
        ze zeVar = new ze(this);
        zeVar.m();
        this.f110026i = zeVar;
        this.f110027j = new p5(new x8(y8Var, this));
        this.f110031n = new y1(this);
        mb mbVar = new mb(this);
        mbVar.k();
        this.f110029l = mbVar;
        ta taVar = new ta(this);
        taVar.k();
        this.f110030m = taVar;
        pd pdVar = new pd(this);
        pdVar.k();
        this.f110025h = pdVar;
        ya yaVar = new ya(this);
        yaVar.m();
        this.f110032o = yaVar;
        d7 d7Var = new d7(this);
        d7Var.m();
        this.f110024g = d7Var;
        zzdd zzddVar = y8Var.f110728d;
        boolean z10 = zzddVar == null || zzddVar.f109031b == 0;
        if (context.getApplicationContext() instanceof Application) {
            t(taVar);
            if (taVar.f110184a.f110018a.getApplicationContext() instanceof Application) {
                Application application = (Application) taVar.f110184a.f110018a.getApplicationContext();
                if (taVar.f110532c == null) {
                    taVar.f110532c = new fa(taVar);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(taVar.f110532c);
                    application.registerActivityLifecycleCallbacks(taVar.f110532c);
                    w5 w5Var2 = taVar.f110184a.f110023f;
                    u(w5Var2);
                    w5Var2.w().a("Registered activity lifecycle callback");
                }
            }
        } else {
            u(w5Var);
            w5Var.r().a("Application context is not an Application");
        }
        d7Var.t(new f7(this, y8Var));
    }

    public static h7 O(Context context, zzdd zzddVar, Long l10) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.f109033d;
            zzddVar = new zzdd(zzddVar.f109030a, zzddVar.f109031b, zzddVar.f109032c, bundle2, null);
        }
        com.google.android.gms.common.internal.w.r(context);
        com.google.android.gms.common.internal.w.r(context.getApplicationContext());
        if (E == null) {
            synchronized (h7.class) {
                try {
                    if (E == null) {
                        E = new h7(new y8(context, zzddVar, l10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.f109033d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.w.r(E);
            E.f110042y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.w.r(E);
        return E;
    }

    static final void q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void r(a4 a4Var) {
        if (a4Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void s(k8 k8Var) {
        if (k8Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void t(b5 b5Var) {
        if (b5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!b5Var.i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(b5Var.getClass())));
        }
    }

    private static final void u(l8 l8Var) {
        if (l8Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!l8Var.k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(l8Var.getClass())));
        }
    }

    @xl.e
    final d7 A() {
        return this.f110024g;
    }

    @xl.d
    public final ta B() {
        ta taVar = this.f110030m;
        t(taVar);
        return taVar;
    }

    @xl.d
    public final ze C() {
        ze zeVar = this.f110026i;
        s(zeVar);
        return zeVar;
    }

    @xl.d
    public final p5 D() {
        return this.f110027j;
    }

    @xl.d
    public final n5 E() {
        t(this.f110034q);
        return this.f110034q;
    }

    @xl.d
    public final ya F() {
        ya yaVar = this.f110032o;
        u(yaVar);
        return yaVar;
    }

    @xl.d
    public final boolean G() {
        return this.f110019b;
    }

    @xl.d
    public final String H() {
        return this.f110033p;
    }

    @xl.d
    public final mb I() {
        mb mbVar = this.f110029l;
        t(mbVar);
        return mbVar;
    }

    @xl.d
    public final xc J() {
        t(this.f110035r);
        return this.f110035r;
    }

    @xl.d
    public final z K() {
        u(this.f110036s);
        return this.f110036s;
    }

    @xl.d
    public final k5 L() {
        t(this.f110037t);
        return this.f110037t;
    }

    @xl.d
    public final y1 M() {
        y1 y1Var = this.f110031n;
        r(y1Var);
        return y1Var;
    }

    @xl.d
    public final ab N() {
        r(this.f110038u);
        return this.f110038u;
    }

    @androidx.annotation.m1
    final void P(boolean z10) {
        this.f110042y = Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.measurement.internal.m8
    @xl.d
    public final w5 a() {
        w5 w5Var = this.f110023f;
        u(w5Var);
        return w5Var;
    }

    @Override // com.google.android.gms.measurement.internal.m8
    @xl.d
    public final d7 b() {
        d7 d7Var = this.f110024g;
        u(d7Var);
        return d7Var;
    }

    @Override // com.google.android.gms.measurement.internal.m8
    @xl.d
    public final f c() {
        return this.f110020c;
    }

    @Override // com.google.android.gms.measurement.internal.m8
    @xl.d
    public final Context d() {
        return this.f110018a;
    }

    @Override // com.google.android.gms.measurement.internal.m8
    @xl.d
    public final com.google.android.gms.common.util.g e() {
        return this.f110028k;
    }

    @androidx.annotation.m1
    public final boolean f() {
        return this.f110042y != null && this.f110042y.booleanValue();
    }

    @androidx.annotation.m1
    public final boolean g() {
        return h() == 0;
    }

    @androidx.annotation.m1
    public final int h() {
        d7 d7Var = this.f110024g;
        u(d7Var);
        d7Var.h();
        k kVar = this.f110021d;
        if (kVar.L()) {
            return 1;
        }
        u(d7Var);
        d7Var.h();
        if (!this.f110043z) {
            return 8;
        }
        k6 k6Var = this.f110022e;
        s(k6Var);
        Boolean boolT = k6Var.t();
        if (boolT != null) {
            return boolT.booleanValue() ? 0 : 3;
        }
        f fVar = kVar.f110184a.f110020c;
        Boolean boolJ = kVar.J("firebase_analytics_collection_enabled");
        if (boolJ != null) {
            return boolJ.booleanValue() ? 0 : 4;
        }
        return (this.f110042y == null || this.f110042y.booleanValue()) ? 0 : 7;
    }

    @androidx.annotation.m1
    public final void i(boolean z10) {
        d7 d7Var = this.f110024g;
        u(d7Var);
        d7Var.h();
        this.f110043z = z10;
    }

    @androidx.annotation.m1
    public final boolean j() {
        d7 d7Var = this.f110024g;
        u(d7Var);
        d7Var.h();
        return this.f110043z;
    }

    final void k() {
        this.A++;
    }

    final void l() {
        this.C.incrementAndGet();
    }

    @androidx.annotation.m1
    protected final boolean m() {
        if (!this.f110039v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        d7 d7Var = this.f110024g;
        u(d7Var);
        d7Var.h();
        Boolean bool = this.f110040w;
        if (bool == null || this.f110041x == 0 || (!bool.booleanValue() && Math.abs(this.f110028k.b() - this.f110041x) > 1000)) {
            this.f110041x = this.f110028k.b();
            ze zeVar = this.f110026i;
            s(zeVar);
            boolean z10 = false;
            if (zeVar.M("android.permission.INTERNET")) {
                s(zeVar);
                if (zeVar.M("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.f110018a;
                    if (com.google.android.gms.common.wrappers.d.a(context).h() || this.f110021d.m() || (ze.j0(context) && ze.E(context, false))) {
                        z10 = true;
                    }
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            this.f110040w = boolValueOf;
            if (boolValueOf.booleanValue()) {
                s(zeVar);
                this.f110040w = Boolean.valueOf(zeVar.o(L().r()));
            }
        }
        return this.f110040w.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0102  */
    /* JADX WARN: Code duplicated, block: B:39:0x013d  */
    @androidx.annotation.m1
    public final boolean n() {
        NetworkInfo activeNetworkInfo;
        Bundle bundle;
        x xVarH;
        int i10;
        String str;
        d7 d7Var = this.f110024g;
        u(d7Var);
        d7Var.h();
        ya yaVar = this.f110032o;
        u(yaVar);
        u(yaVar);
        String strQ = L().q();
        if (!this.f110021d.M()) {
            w5 w5Var = this.f110023f;
            u(w5Var);
            w5Var.w().a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        k6 k6Var = this.f110022e;
        s(k6Var);
        Pair pairO = k6Var.o(strQ);
        if (((Boolean) pairO.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairO.first)) {
            w5 w5Var2 = this.f110023f;
            u(w5Var2);
            w5Var2.w().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        u(yaVar);
        yaVar.l();
        ConnectivityManager connectivityManager = (ConnectivityManager) yaVar.f110184a.f110018a.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
                activeNetworkInfo = null;
            }
        } else {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            w5 w5Var3 = this.f110023f;
            u(w5Var3);
            w5Var3.r().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        xc xcVarJ = J();
        xcVarJ.h();
        xcVarJ.j();
        if (xcVarJ.y()) {
            ze zeVar = xcVarJ.f110184a.f110026i;
            s(zeVar);
            if (zeVar.W() >= 234200) {
                ta taVar = this.f110030m;
                t(taVar);
                h7 h7Var = taVar.f110184a;
                taVar.h();
                zzao zzaoVarM0 = h7Var.J().m0();
                if (zzaoVarM0 != null) {
                }
                if (bundle == null) {
                    i10 = this.B;
                    this.B = i10 + 1;
                    if (i10 < 10) {
                    }
                    w5 w5Var4 = this.f110023f;
                    u(w5Var4);
                    if (i10 < 10) {
                        str = "Retrying.";
                    } else {
                        str = "Skipping.";
                    }
                    u5 u5VarV = w5Var4.v();
                    StringBuilder sb3 = new StringBuilder(str.length() + 60);
                    sb3.append("Failed to retrieve DMA consent from the service, ");
                    sb3.append(str);
                    sb3.append(" retryCount");
                    u5VarV.b(sb3.toString(), Integer.valueOf(this.B));
                    return z;
                }
                r8 r8VarE = r8.e(bundle, 100);
                sb2.append("&gcs=");
                sb2.append(r8VarE.k());
                xVarH = x.h(bundle, 100);
                sb2.append("&dma=");
                sb2.append(!Objects.equals(xVarH.j(), Boolean.FALSE) ? 1 : 0);
                if (!TextUtils.isEmpty(xVarH.k())) {
                    sb2.append("&dma_cps=");
                    sb2.append(xVarH.k());
                }
                int i11 = !Objects.equals(x.i(bundle), Boolean.TRUE) ? 1 : 0;
                sb2.append("&npa=");
                sb2.append(i11);
                w5 w5Var5 = this.f110023f;
                u(w5Var5);
                w5Var5.w().b("Consent query parameters to Bow", sb2);
            }
        } else {
            ta taVar2 = this.f110030m;
            t(taVar2);
            h7 h7Var2 = taVar2.f110184a;
            taVar2.h();
            zzao zzaoVarM1 = h7Var2.J().m0();
            bundle = zzaoVarM1 != null ? zzaoVarM1.f110856a : null;
            if (bundle == null) {
                i10 = this.B;
                this.B = i10 + 1;
                boolean z10 = i10 < 10;
                w5 w5Var6 = this.f110023f;
                u(w5Var6);
                if (i10 < 10) {
                    str = "Retrying.";
                } else {
                    str = "Skipping.";
                }
                u5 u5VarV2 = w5Var6.v();
                StringBuilder sb4 = new StringBuilder(str.length() + 60);
                sb4.append("Failed to retrieve DMA consent from the service, ");
                sb4.append(str);
                sb4.append(" retryCount");
                u5VarV2.b(sb4.toString(), Integer.valueOf(this.B));
                return z10;
            }
            r8 r8VarE2 = r8.e(bundle, 100);
            sb2.append("&gcs=");
            sb2.append(r8VarE2.k());
            xVarH = x.h(bundle, 100);
            sb2.append("&dma=");
            sb2.append(!Objects.equals(xVarH.j(), Boolean.FALSE) ? 1 : 0);
            if (!TextUtils.isEmpty(xVarH.k())) {
                sb2.append("&dma_cps=");
                sb2.append(xVarH.k());
            }
            int i12 = !Objects.equals(x.i(bundle), Boolean.TRUE) ? 1 : 0;
            sb2.append("&npa=");
            sb2.append(i12);
            w5 w5Var7 = this.f110023f;
            u(w5Var7);
            w5Var7.w().b("Consent query parameters to Bow", sb2);
        }
        ze zeVar2 = this.f110026i;
        s(zeVar2);
        L().f110184a.f110021d.A();
        String str2 = (String) pairO.first;
        k6 k6Var2 = this.f110022e;
        s(k6Var2);
        URL urlI0 = zeVar2.i0(133005L, strQ, str2, k6Var2.f110177v.a() - 1, sb2.toString());
        if (urlI0 != null) {
            ya yaVar2 = this.f110032o;
            u(yaVar2);
            va vaVar = new va() { // from class: com.google.android.gms.measurement.internal.g7
                @Override // com.google.android.gms.measurement.internal.va
                public final /* synthetic */ void a(String str3, int i13, Throwable th2, byte[] bArr, Map map) {
                    this.f109980a.o(str3, i13, th2, bArr, map);
                }
            };
            yaVar2.l();
            com.google.android.gms.common.internal.w.r(urlI0);
            com.google.android.gms.common.internal.w.r(vaVar);
            d7 d7Var2 = yaVar2.f110184a.f110024g;
            u(d7Var2);
            d7Var2.w(new xa(yaVar2, strQ, urlI0, null, null, vaVar));
        }
        return false;
    }

    final /* synthetic */ void o(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        int i11;
        if (i10 != 200 && i10 != 204) {
            i11 = 304;
            if (i10 != 304) {
                i11 = i10;
            }
            w5 w5Var = this.f110023f;
            u(w5Var);
            w5Var.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
        }
        i11 = i10;
        if (th2 == null) {
            k6 k6Var = this.f110022e;
            s(k6Var);
            k6Var.f110176u.b(true);
            if (bArr == null || bArr.length == 0) {
                w5 w5Var2 = this.f110023f;
                u(w5Var2);
                w5Var2.v().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    w5 w5Var3 = this.f110023f;
                    u(w5Var3);
                    w5Var3.v().a("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                ze zeVar = this.f110026i;
                s(zeVar);
                h7 h7Var = zeVar.f110184a;
                if (!TextUtils.isEmpty(strOptString)) {
                    Context context = h7Var.f110018a;
                    List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                    if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(strOptString3)) {
                            bundle.putString("gbraid", strOptString3);
                        }
                        if (!TextUtils.isEmpty(strOptString4)) {
                            bundle.putString("gad_source", strOptString4);
                        }
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        this.f110030m.t("auto", com.google.firebase.messaging.e.f.f123542l, bundle);
                        s(zeVar);
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString("deeplink", strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = zeVar.f110184a.f110018a;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                } else {
                                    context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                    return;
                                }
                            }
                            return;
                        } catch (RuntimeException e10) {
                            w5 w5Var4 = zeVar.f110184a.f110023f;
                            u(w5Var4);
                            w5Var4.o().b("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                }
                w5 w5Var5 = this.f110023f;
                u(w5Var5);
                w5Var5.r().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            } catch (JSONException e11) {
                w5 w5Var6 = this.f110023f;
                u(w5Var6);
                w5Var6.o().b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        w5 w5Var7 = this.f110023f;
        u(w5Var7);
        w5Var7.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    final /* synthetic */ void p(y8 y8Var) {
        d7 d7Var = this.f110024g;
        u(d7Var);
        d7Var.h();
        k kVar = this.f110021d;
        kVar.u();
        z zVar = new z(this);
        zVar.m();
        this.f110036s = zVar;
        zzdd zzddVar = y8Var.f110728d;
        k5 k5Var = new k5(this, y8Var.f110727c, zzddVar == null ? 0L : zzddVar.f109030a);
        k5Var.k();
        this.f110037t = k5Var;
        n5 n5Var = new n5(this);
        n5Var.k();
        this.f110034q = n5Var;
        xc xcVar = new xc(this);
        xcVar.k();
        this.f110035r = xcVar;
        ze zeVar = this.f110026i;
        zeVar.n();
        this.f110022e.n();
        this.f110037t.l();
        ab abVar = new ab(this);
        abVar.k();
        this.f110038u = abVar;
        abVar.l();
        w5 w5Var = this.f110023f;
        u(w5Var);
        u5 u5VarU = w5Var.u();
        kVar.A();
        u5VarU.b("App measurement initialized, version", 133005L);
        u(w5Var);
        w5Var.u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strQ = k5Var.q();
        s(zeVar);
        if (zeVar.P(strQ, kVar.R())) {
            u(w5Var);
            w5Var.u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            u(w5Var);
            w5Var.u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strQ)));
        }
        u(w5Var);
        w5Var.v().a("Debug-level message logging enabled");
        int i10 = this.A;
        AtomicInteger atomicInteger = this.C;
        if (i10 != atomicInteger.get()) {
            u(w5Var);
            w5Var.o().c("Not all components initialized", Integer.valueOf(this.A), Integer.valueOf(atomicInteger.get()));
        }
        this.f110039v = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x0074  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[DONT_INVERT] */
    @androidx.annotation.m1
    protected final void v(zzdd zzddVar) {
        r8 r8VarA;
        Bundle bundle;
        d7 d7Var = this.f110024g;
        u(d7Var);
        d7Var.h();
        com.google.android.gms.internal.measurement.u7 u7VarQ = N().q();
        com.google.android.gms.internal.measurement.u7 u7Var = com.google.android.gms.internal.measurement.u7.CLIENT_UPLOAD_ELIGIBLE;
        fg.a();
        y4 y4Var = z4.R0;
        k kVar = this.f110021d;
        boolean zH = kVar.H(null, y4Var);
        boolean z10 = u7VarQ == u7Var;
        if (zH) {
            ze zeVar = this.f110026i;
            s(zeVar);
            if (zeVar.G()) {
                ze zeVar2 = this.f110026i;
                s(zeVar2);
                zeVar2.h();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                ff ffVar = new ff(zeVar2.f110184a);
                h7 h7Var = zeVar2.f110184a;
                androidx.core.content.d.w(h7Var.f110018a, ffVar, intentFilter, 2);
                w5 w5Var = h7Var.f110023f;
                u(w5Var);
                w5Var.v().a("Registered app receiver");
                if (z10) {
                    N().o(((Long) z4.C.b(null)).longValue());
                }
            } else if (z10) {
                z10 = true;
                ze zeVar3 = this.f110026i;
                s(zeVar3);
                zeVar3.h();
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                ff ffVar2 = new ff(zeVar3.f110184a);
                h7 h7Var2 = zeVar3.f110184a;
                androidx.core.content.d.w(h7Var2.f110018a, ffVar2, intentFilter2, 2);
                w5 w5Var2 = h7Var2.f110023f;
                u(w5Var2);
                w5Var2.v().a("Registered app receiver");
                if (z10) {
                    N().o(((Long) z4.C.b(null)).longValue());
                }
            }
        } else if (z10) {
            z10 = true;
            ze zeVar4 = this.f110026i;
            s(zeVar4);
            zeVar4.h();
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            ff ffVar3 = new ff(zeVar4.f110184a);
            h7 h7Var3 = zeVar4.f110184a;
            androidx.core.content.d.w(h7Var3.f110018a, ffVar3, intentFilter3, 2);
            w5 w5Var3 = h7Var3.f110023f;
            u(w5Var3);
            w5Var3.v().a("Registered app receiver");
            if (z10) {
                N().o(((Long) z4.C.b(null)).longValue());
            }
        }
        k6 k6Var = this.f110022e;
        s(k6Var);
        r8 r8VarW = k6Var.w();
        int iB = r8VarW.b();
        o8 o8VarO = kVar.O("google_analytics_default_allow_ad_storage", false);
        o8 o8VarO2 = kVar.O("google_analytics_default_allow_analytics_storage", false);
        o8 o8Var = o8.UNINITIALIZED;
        if (o8VarO == o8Var && o8VarO2 == o8Var) {
            if (!TextUtils.isEmpty(L().r())) {
                ta taVar = this.f110030m;
                t(taVar);
                taVar.r0(new r8(null, null, -10), false);
            }
            r8VarA = null;
        } else {
            s(k6Var);
            if (k6Var.v(-10)) {
                r8VarA = r8.a(o8VarO, o8VarO2, -10);
            } else {
                if (!TextUtils.isEmpty(L().r()) && (iB == 0 || iB == 30 || iB == 10 || iB == 40)) {
                    ta taVar2 = this.f110030m;
                    t(taVar2);
                    taVar2.r0(new r8(null, null, -10), false);
                }
                r8VarA = null;
            }
        }
        if (r8VarA != null) {
            ta taVar3 = this.f110030m;
            t(taVar3);
            taVar3.r0(r8VarA, true);
            r8VarW = r8VarA;
        }
        ta taVar4 = this.f110030m;
        t(taVar4);
        taVar4.o(r8VarW);
        s(k6Var);
        int iB2 = k6Var.u().b();
        o8 o8VarO3 = kVar.O("google_analytics_default_allow_ad_personalization_signals", true);
        if (o8VarO3 != o8Var) {
            w5 w5Var4 = this.f110023f;
            u(w5Var4);
            w5Var4.w().b("Default ad personalization consent from Manifest", o8VarO3);
        }
        o8 o8VarO4 = kVar.O("google_analytics_default_allow_ad_user_data", true);
        if (o8VarO4 != o8Var && r8.u(-10, iB2)) {
            t(taVar4);
            taVar4.q0(x.a(o8VarO4, -10), true);
        } else if (!TextUtils.isEmpty(L().r()) && (iB2 == 0 || iB2 == 30)) {
            t(taVar4);
            taVar4.q0(new x((Boolean) null, -10, (Boolean) null, (String) null), true);
        } else if (TextUtils.isEmpty(L().r()) && zzddVar != null && (bundle = zzddVar.f109033d) != null && r8.u(30, iB2)) {
            x xVarH = x.h(bundle, 30);
            if (xVarH.d()) {
                t(taVar4);
                taVar4.q0(xVarH, true);
            }
        }
        Boolean boolJ = kVar.J("google_analytics_tcf_data_enabled");
        if (boolJ == null || boolJ.booleanValue()) {
            w5 w5Var5 = this.f110023f;
            u(w5Var5);
            w5Var5.v().a("TCF client enabled.");
            t(taVar4);
            taVar4.s();
            t(taVar4);
            taVar4.r();
        }
        s(k6Var);
        h6 h6Var = k6Var.f110161f;
        if (h6Var.a() == 0) {
            w5 w5Var6 = this.f110023f;
            u(w5Var6);
            long j10 = this.D;
            w5Var6.w().b("Persisting first open", Long.valueOf(j10));
            s(k6Var);
            h6Var.b(j10);
        }
        t(taVar4);
        taVar4.f110547r.c();
        if (m()) {
            if (!TextUtils.isEmpty(L().r())) {
                ze zeVar5 = this.f110026i;
                s(zeVar5);
                String strR = L().r();
                s(k6Var);
                k6Var.h();
                if (zeVar5.p(strR, k6Var.p().getString("gmp_app_id", null))) {
                    w5 w5Var7 = this.f110023f;
                    u(w5Var7);
                    w5Var7.u().a("Rechecking which service to use due to a GMP App Id change");
                    s(k6Var);
                    k6Var.h();
                    Boolean boolT = k6Var.t();
                    SharedPreferences.Editor editorEdit = k6Var.p().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolT != null) {
                        k6Var.s(boolT);
                    }
                    E().o();
                    this.f110035r.A();
                    this.f110035r.w();
                    s(k6Var);
                    h6Var.b(this.D);
                    s(k6Var);
                    k6Var.f110163h.b(null);
                }
                s(k6Var);
                String strR2 = L().r();
                k6Var.h();
                SharedPreferences.Editor editorEdit2 = k6Var.p().edit();
                editorEdit2.putString("gmp_app_id", strR2);
                editorEdit2.apply();
            }
            s(k6Var);
            if (!k6Var.w().o(q8.ANALYTICS_STORAGE)) {
                s(k6Var);
                k6Var.f110163h.b(null);
            }
            t(taVar4);
            s(k6Var);
            taVar4.F(k6Var.f110163h.a());
            ze zeVar6 = this.f110026i;
            s(zeVar6);
            try {
                zeVar6.f110184a.f110018a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            } catch (ClassNotFoundException unused) {
                k6 k6Var2 = this.f110022e;
                s(k6Var2);
                j6 j6Var = k6Var2.f110178w;
                if (!TextUtils.isEmpty(j6Var.a())) {
                    w5 w5Var8 = this.f110023f;
                    u(w5Var8);
                    w5Var8.r().a("Remote config removed with active feature rollouts");
                    s(k6Var2);
                    j6Var.b(null);
                }
            }
            if (!TextUtils.isEmpty(L().r())) {
                boolean zG = g();
                k6 k6Var3 = this.f110022e;
                s(k6Var3);
                if (!k6Var3.z() && !this.f110021d.L()) {
                    s(k6Var3);
                    k6Var3.y(!zG);
                }
                if (zG) {
                    ta taVar5 = this.f110030m;
                    t(taVar5);
                    taVar5.I();
                }
                pd pdVar = this.f110025h;
                t(pdVar);
                pdVar.f110366e.a();
                J().q(new AtomicReference());
                xc xcVarJ = J();
                s(k6Var3);
                xcVarJ.v(k6Var3.f110181z.a());
            }
        } else if (g()) {
            ze zeVar7 = this.f110026i;
            s(zeVar7);
            if (!zeVar7.M("android.permission.INTERNET")) {
                w5 w5Var9 = this.f110023f;
                u(w5Var9);
                w5Var9.o().a("App is missing INTERNET permission");
            }
            s(zeVar7);
            if (!zeVar7.M("android.permission.ACCESS_NETWORK_STATE")) {
                w5 w5Var10 = this.f110023f;
                u(w5Var10);
                w5Var10.o().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            Context context = this.f110018a;
            if (!com.google.android.gms.common.wrappers.d.a(context).h() && !this.f110021d.m()) {
                if (!ze.j0(context)) {
                    w5 w5Var11 = this.f110023f;
                    u(w5Var11);
                    w5Var11.o().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!ze.E(context, false)) {
                    w5 w5Var12 = this.f110023f;
                    u(w5Var12);
                    w5Var12.o().a("AppMeasurementService not registered/enabled");
                }
            }
            w5 w5Var13 = this.f110023f;
            u(w5Var13);
            w5Var13.o().a("Uploading is not possible. App measurement disabled");
        }
        fg.a();
        if (this.f110021d.H(null, z4.R0)) {
            ze zeVar8 = this.f110026i;
            s(zeVar8);
            if (zeVar8.G()) {
                long jMax = Math.max(500L, ((((long) ((Integer) z4.f110806y0.b(null)).intValue()) * 1000) + ((long) new Random().nextInt(5000))) - this.f110028k.b());
                if (jMax > 500) {
                    w5 w5Var14 = this.f110023f;
                    u(w5Var14);
                    w5Var14.w().b("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(jMax));
                }
                ta taVar6 = this.f110030m;
                t(taVar6);
                taVar6.t0(jMax);
            }
        }
        k6 k6Var4 = this.f110022e;
        s(k6Var4);
        k6Var4.f110171p.b(true);
    }

    @xl.d
    public final k w() {
        return this.f110021d;
    }

    @xl.d
    public final k6 x() {
        k6 k6Var = this.f110022e;
        s(k6Var);
        return k6Var;
    }

    public final w5 y() {
        w5 w5Var = this.f110023f;
        if (w5Var == null || !w5Var.k()) {
            return null;
        }
        return w5Var;
    }

    @xl.d
    public final pd z() {
        pd pdVar = this.f110025h;
        t(pdVar);
        return pdVar;
    }
}

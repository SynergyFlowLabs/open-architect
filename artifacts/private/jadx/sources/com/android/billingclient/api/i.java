package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.BuildConfig;
import com.google.android.gms.internal.play_billing.aa;
import com.google.android.gms.internal.play_billing.ba;
import com.google.android.gms.internal.play_billing.da;
import com.google.android.gms.internal.play_billing.e5;
import com.google.android.gms.internal.play_billing.f5;
import com.google.android.gms.internal.play_billing.fa;
import com.google.android.gms.internal.play_billing.m4;
import com.google.android.gms.internal.play_billing.pa;
import com.google.android.gms.internal.play_billing.ra;
import com.google.android.gms.internal.play_billing.t4;
import com.google.android.gms.internal.play_billing.t9;
import com.google.android.gms.internal.play_billing.tb;
import com.google.android.gms.internal.play_billing.v9;
import com.google.android.gms.internal.play_billing.va;
import com.google.android.gms.internal.play_billing.vb;
import com.google.android.gms.internal.play_billing.y9;
import com.google.android.gms.internal.play_billing.za;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
class i extends h {
    private boolean A;

    @androidx.annotation.p0
    private y B;
    private boolean C;
    private ExecutorService D;
    private volatile m4 E;
    private final Long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f89106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f89107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f89108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f89109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile z3 f89110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f89111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r2 f89112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.google.android.gms.internal.play_billing.o f89113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile k1 f89114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f89115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f89116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f89117l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f89118m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f89119n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f89120o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f89121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f89122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f89123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f89124s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f89125t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f89126u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f89127v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f89128w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f89129x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f89130y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f89131z;

    private i(Activity activity, y yVar, String str) {
        this(activity.getApplicationContext(), yVar, new zzbm(), str, null, null, null, null);
    }

    private void A(long j10) {
        w(new zzbm(j10));
    }

    private final void A0(t tVar, n nVar, int i10, @androidx.annotation.p0 Exception exc) {
        i1(i10, 24, nVar, q2.a(exc));
        tVar.a(nVar, null);
    }

    private final void B0(q qVar, n nVar, int i10, @androidx.annotation.p0 Exception exc) {
        i1(i10, 23, nVar, q2.a(exc));
        qVar.a(nVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.p0
    public static Future F(Callable callable, long j10, @androidx.annotation.p0 final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.r0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    static /* bridge */ /* synthetic */ boolean S0(i iVar) {
        boolean z10;
        synchronized (iVar.f89106a) {
            try {
                z10 = true;
                if (iVar.f89107b != 1) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler Z0() {
        return Looper.myLooper() == null ? this.f89109d : new Handler(Looper.myLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u1 a1(String str) {
        com.google.android.gms.internal.play_billing.o oVar;
        com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleD = com.google.android.gms.internal.play_billing.p3.d(this.f89120o, this.f89128w, this.B.a(), this.B.b(), this.f89108c, this.F.longValue());
        String string = null;
        while (this.f89118m) {
            try {
                synchronized (this.f89106a) {
                    oVar = this.f89113h;
                }
                if (oVar == null) {
                    return r0(t2.f89254m, 119, "Service reset to null", null);
                }
                Bundle bundleZ5 = oVar.Z5(6, this.f89111f.getPackageName(), str, string, bundleD);
                h3 h3VarA = i3.a(bundleZ5, "BillingClient", "getPurchaseHistory()");
                n nVarA = h3VarA.a();
                if (nVarA != t2.f89253l) {
                    h1(h3VarA.b(), 11, nVarA);
                    return new u1(nVarA, null);
                }
                ArrayList<String> stringArrayList = bundleZ5.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZ5.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZ5.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z10 = false;
                for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                    String str2 = stringArrayList2.get(i10);
                    String str3 = stringArrayList3.get(i10);
                    com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i10))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.e())) {
                            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e10) {
                        return r0(t2.f89252k, 51, "Got an exception trying to decode the purchase!", e10);
                    }
                }
                if (z10) {
                    h1(26, 11, t2.f89252k);
                }
                string = bundleZ5.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new u1(t2.f89253l, arrayList);
                }
            } catch (DeadObjectException e11) {
                return r0(t2.f89254m, 59, "Got exception trying to get purchase history", e11);
            } catch (Exception e12) {
                return r0(t2.f89252k, 59, "Got exception trying to get purchase history", e12);
            }
        }
        com.google.android.gms.internal.play_billing.p3.l("BillingClient", "getPurchaseHistory is not supported on current device");
        return new u1(t2.f89258q, null);
    }

    private final n b1() {
        com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Service connection is valid. No need to re-initialize.");
        y9 y9VarG = aa.G();
        y9VarG.t(6);
        tb tbVarE = vb.E();
        tbVarE.r(true);
        y9VarG.s(tbVarE);
        i0((aa) y9VarG.n());
        return t2.f89253l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n c0() {
        int[] iArr = {0, 3};
        synchronized (this.f89106a) {
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    if (this.f89107b == iArr[i10]) {
                        return t2.f89254m;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return t2.f89252k;
        }
    }

    private final String d0(e0 e0Var) {
        if (TextUtils.isEmpty(null)) {
            return this.f89111f.getPackageName();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1(r rVar, n nVar, int i10, @androidx.annotation.p0 Exception exc) {
        i1(i10, 25, nVar, q2.a(exc));
        rVar.a(nVar);
    }

    @e.a({"PrivateApi"})
    private static String e0() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    private final void e1(l lVar, n nVar, int i10, @androidx.annotation.p0 Exception exc) {
        com.google.android.gms.internal.play_billing.p3.m("BillingClient", "getBillingConfig got an exception.", exc);
        i1(i10, 13, nVar, q2.a(exc));
        lVar.a(nVar, null);
    }

    private final synchronized ExecutorService f0() {
        try {
            if (this.D == null) {
                this.D = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.p3.f109248a, new e1(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f1(e eVar, n nVar, int i10, @androidx.annotation.p0 Exception exc) {
        i1(i10, 16, nVar, q2.a(exc));
        eVar.a(nVar);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00cf */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.android.billingclient.api.i] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.android.billingclient.api.i] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g0(com.android.billingclient.api.o r10, com.android.billingclient.api.p r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.i.g0(com.android.billingclient.api.o, com.android.billingclient.api.p):void");
    }

    private final void g1(int i10, int i11, @androidx.annotation.p0 Exception exc) {
        v9 v9Var;
        com.google.android.gms.internal.play_billing.p3.m("BillingClient", "showInAppMessages error.", exc);
        r2 r2Var = this.f89112g;
        String strA = q2.a(exc);
        try {
            ba baVarH = fa.H();
            baVarH.t(i10);
            baVarH.u(i11);
            if (strA != null) {
                baVarH.r(strA);
            }
            t9 t9VarH = v9.H();
            t9VarH.r(baVarH);
            t9VarH.t(30);
            v9Var = (v9) t9VarH.n();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to create logging payload", th2);
            v9Var = null;
        }
        r2Var.d(v9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(v9 v9Var) {
        try {
            this.f89112g.f(v9Var, this.f89117l);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1(int i10, int i11, n nVar) {
        try {
            h0(q2.b(i10, i11, nVar));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Unable to log.", th2);
        }
    }

    private final void i0(aa aaVar) {
        try {
            this.f89112g.e(aaVar, this.f89117l);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i1(int i10, int i11, n nVar, @androidx.annotation.p0 String str) {
        try {
            h0(q2.c(i10, i11, nVar, str));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Unable to log.", th2);
        }
    }

    private final void j0(String str, final b0 b0Var) {
        if (!k()) {
            n nVar = t2.f89254m;
            h1(2, 11, nVar);
            b0Var.c(nVar, null);
        } else if (F(new g1(this, str, b0Var), 30000L, new Runnable() { // from class: com.android.billingclient.api.x0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89285a.M0(b0Var);
            }
        }, Z0(), f0()) == null) {
            n nVarC0 = c0();
            h1(25, 11, nVarC0);
            b0Var.c(nVarC0, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(int i10) {
        try {
            i0(q2.d(i10));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Unable to log.", th2);
        }
    }

    private final void k0(String str, final c0 c0Var) {
        if (!k()) {
            n nVar = t2.f89254m;
            h1(2, 9, nVar);
            c0Var.onQueryPurchasesResponse(nVar, com.google.android.gms.internal.play_billing.r1.v());
        } else {
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Please provide a valid product type.");
                n nVar2 = t2.f89249h;
                h1(50, 9, nVar2);
                c0Var.onQueryPurchasesResponse(nVar2, com.google.android.gms.internal.play_billing.r1.v());
                return;
            }
            if (F(new f1(this, str, c0Var), 30000L, new Runnable() { // from class: com.android.billingclient.api.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89209a.N0(c0Var);
                }
            }, Z0(), f0()) == null) {
                n nVarC0 = c0();
                h1(25, 9, nVarC0);
                c0Var.onQueryPurchasesResponse(nVarC0, com.google.android.gms.internal.play_billing.r1.v());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(int i10) {
        synchronized (this.f89106a) {
            try {
                if (this.f89107b == 3) {
                    return;
                }
                com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Setting clientState from " + p0(this.f89107b) + " to " + p0(i10));
                this.f89107b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final synchronized void m0() {
        try {
            ExecutorService executorService = this.D;
            if (executorService != null) {
                executorService.shutdownNow();
                this.D = null;
                this.E = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0() {
        synchronized (this.f89106a) {
            if (this.f89114i != null) {
                try {
                    this.f89111f.unbindService(this.f89114i);
                    this.f89113h = null;
                    this.f89114i = null;
                } catch (Throwable th2) {
                    try {
                        com.google.android.gms.internal.play_billing.p3.m("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f89113h = null;
                        this.f89114i = null;
                    } catch (Throwable th3) {
                        this.f89113h = null;
                        this.f89114i = null;
                        throw th3;
                    }
                }
            }
        }
    }

    private final boolean o0() {
        return this.f89128w && this.B.b();
    }

    private static final String p0(int i10) {
        if (i10 == 0) {
            return "DISCONNECTED";
        }
        if (i10 != 1) {
            return i10 != 2 ? "CLOSED" : "CONNECTED";
        }
        return "CONNECTING";
    }

    private final t1 q0(n nVar, int i10, String str, @androidx.annotation.p0 Exception exc) {
        com.google.android.gms.internal.play_billing.p3.m("BillingClient", str, exc);
        i1(i10, 7, nVar, q2.a(exc));
        return new t1(nVar.b(), nVar.a(), new ArrayList());
    }

    private final u1 r0(n nVar, int i10, String str, @androidx.annotation.p0 Exception exc) {
        com.google.android.gms.internal.play_billing.p3.m("BillingClient", str, exc);
        i1(i10, 11, nVar, q2.a(exc));
        return new u1(nVar, null);
    }

    private final f3 s0(int i10, n nVar, int i11, String str, @androidx.annotation.p0 Exception exc) {
        i1(i11, 9, nVar, q2.a(exc));
        com.google.android.gms.internal.play_billing.p3.m("BillingClient", str, exc);
        return new f3(nVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f3 t0(String str, int i10) {
        com.google.android.gms.internal.play_billing.o oVar;
        i iVar = this;
        com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleD = com.google.android.gms.internal.play_billing.p3.d(iVar.f89120o, iVar.f89128w, iVar.B.a(), iVar.B.b(), iVar.f89108c, iVar.F.longValue());
        String string = null;
        do {
            try {
                synchronized (iVar.f89106a) {
                    oVar = iVar.f89113h;
                }
                if (oVar == null) {
                    return iVar.s0(9, t2.f89254m, 119, "Service has been reset to null", null);
                }
                Bundle bundleX4 = iVar.f89120o ? oVar.X4(true != iVar.f89128w ? 9 : 19, iVar.f89111f.getPackageName(), str, string, bundleD) : oVar.e3(3, iVar.f89111f.getPackageName(), str, string);
                h3 h3VarA = i3.a(bundleX4, "BillingClient", "getPurchase()");
                n nVarA = h3VarA.a();
                if (nVarA != t2.f89253l) {
                    return iVar.s0(9, nVarA, h3VarA.b(), "Purchase bundle invalid", null);
                }
                ArrayList<String> stringArrayList = bundleX4.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleX4.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleX4.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z10 = false;
                for (int i11 = 0; i11 < stringArrayList2.size(); i11++) {
                    String str2 = stringArrayList2.get(i11);
                    String str3 = stringArrayList3.get(i11);
                    com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i11))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.j())) {
                            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e10) {
                        return s0(9, t2.f89252k, 51, "Got an exception trying to decode the purchase!", e10);
                    }
                }
                iVar = this;
                if (z10) {
                    iVar.h1(26, 9, t2.f89252k);
                }
                string = bundleX4.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            } catch (DeadObjectException e11) {
                return s0(9, t2.f89254m, 52, "Got exception trying to get purchases try to reconnect", e11);
            } catch (Exception e12) {
                return iVar.s0(9, t2.f89252k, 52, "Got exception trying to get purchases try to reconnect", e12);
            }
        } while (!TextUtils.isEmpty(string));
        return new f3(t2.f89253l, arrayList);
    }

    private final n3 u0(n nVar, int i10, String str, @androidx.annotation.p0 Exception exc) {
        com.google.android.gms.internal.play_billing.p3.m("BillingClient", str, exc);
        i1(i10, 8, nVar, q2.a(exc));
        return new n3(nVar.b(), nVar.a(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void v0(n nVar, int i10, int i11) {
        aa aaVar = null;
        v9 v9Var = null;
        boolean z10 = 0 & 5;
        if (nVar.b() == 0) {
            int i12 = q2.f89223a;
            try {
                y9 y9VarG = aa.G();
                y9VarG.t(5);
                va vaVarE = za.E();
                vaVarE.r(i11);
                y9VarG.r((za) vaVarE.n());
                aaVar = (aa) y9VarG.n();
            } catch (Exception e10) {
                com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to create logging payload", e10);
            }
            i0(aaVar);
            return;
        }
        int i13 = q2.f89223a;
        try {
            t9 t9VarH = v9.H();
            ba baVarH = fa.H();
            baVarH.t(nVar.b());
            baVarH.s(nVar.a());
            baVarH.u(i10);
            t9VarH.r(baVarH);
            t9VarH.t(5);
            va vaVarE2 = za.E();
            vaVarE2.r(i11);
            t9VarH.s((za) vaVarE2.n());
            v9Var = (v9) t9VarH.n();
        } catch (Exception e11) {
            com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to create logging payload", e11);
        }
        h0(v9Var);
    }

    private final void w0(c cVar, n nVar, int i10, @androidx.annotation.p0 Exception exc) {
        com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Error in acknowledge purchase!", exc);
        i1(i10, 3, nVar, q2.a(exc));
        cVar.b(nVar);
    }

    private void x(Context context, d0 d0Var, y yVar, @androidx.annotation.p0 j0 j0Var, String str, @androidx.annotation.p0 r2 r2Var) {
        this.f89111f = context.getApplicationContext();
        pa paVarH = ra.H();
        paVarH.u(str);
        paVarH.t(this.f89111f.getPackageName());
        paVarH.s(this.F.longValue());
        if (r2Var != null) {
            this.f89112g = r2Var;
        } else {
            this.f89112g = new v2(this.f89111f, (ra) paVarH.n());
        }
        if (d0Var == null) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f89110e = new z3(this.f89111f, d0Var, null, null, j0Var, this.f89112g);
        this.B = yVar;
        this.C = j0Var != null;
    }

    private final void x0(d dVar, n nVar, int i10, @androidx.annotation.p0 Exception exc) {
        i1(i10, 14, nVar, q2.a(exc));
        dVar.a(nVar);
    }

    private void y(Context context, d0 d0Var, y yVar, @androidx.annotation.p0 j1 j1Var, String str, @androidx.annotation.p0 r2 r2Var) {
        this.f89111f = context.getApplicationContext();
        pa paVarH = ra.H();
        paVarH.u(str);
        paVarH.t(this.f89111f.getPackageName());
        paVarH.s(this.F.longValue());
        if (r2Var != null) {
            this.f89112g = r2Var;
        } else {
            this.f89112g = new v2(this.f89111f, (ra) paVarH.n());
        }
        if (d0Var == null) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f89110e = new z3(this.f89111f, d0Var, null, j1Var, null, this.f89112g);
        this.B = yVar;
        this.C = j1Var != null;
        this.f89111f.getPackageName();
    }

    private final void y0(p pVar, String str, n nVar, int i10, String str2, @androidx.annotation.p0 Exception exc) {
        com.google.android.gms.internal.play_billing.p3.m("BillingClient", str2, exc);
        i1(i10, 4, nVar, q2.a(exc));
        pVar.d(nVar, str);
    }

    private int z(Activity activity, m mVar) {
        return l(activity, mVar).b();
    }

    private final void z0(g gVar, n nVar, int i10, @androidx.annotation.p0 Exception exc) {
        i1(i10, 15, nVar, q2.a(exc));
        gVar.a(nVar, null);
    }

    final /* synthetic */ Object A1(c cVar, b bVar) throws Exception {
        com.google.android.gms.internal.play_billing.o oVar;
        try {
            synchronized (this.f89106a) {
                try {
                    oVar = this.f89113h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (oVar == null) {
                w0(cVar, t2.f89254m, 119, null);
                return null;
            }
            String packageName = this.f89111f.getPackageName();
            String strA = bVar.a();
            String str = this.f89108c;
            long jLongValue = this.F.longValue();
            Bundle bundle = new Bundle();
            com.google.android.gms.internal.play_billing.p3.c(bundle, str, jLongValue);
            Bundle bundleH8 = oVar.H8(9, packageName, strA, bundle);
            cVar.b(t2.a(com.google.android.gms.internal.play_billing.p3.b(bundleH8, "BillingClient"), com.google.android.gms.internal.play_billing.p3.h(bundleH8, "BillingClient")));
            return null;
        } catch (DeadObjectException e10) {
            w0(cVar, t2.f89254m, 28, e10);
            return null;
        } catch (Exception e11) {
            w0(cVar, t2.f89252k, 28, e11);
            return null;
        }
    }

    final /* synthetic */ Void B(q qVar) throws Exception {
        com.google.android.gms.internal.play_billing.o oVar;
        try {
            synchronized (this.f89106a) {
                oVar = this.f89113h;
            }
            if (oVar == null) {
                B0(qVar, t2.f89254m, 119, null);
            } else {
                oVar.Re(22, this.f89111f.getPackageName(), com.google.android.gms.internal.play_billing.p3.e(this.f89108c, this.F.longValue()), new r1(qVar, this.f89112g, this.f89117l, null));
            }
        } catch (DeadObjectException e10) {
            B0(qVar, t2.f89254m, 91, e10);
        } catch (Exception e11) {
            B0(qVar, t2.f89252k, 91, e11);
        }
        return null;
    }

    final /* synthetic */ Object B1(o oVar, p pVar) throws Exception {
        g0(oVar, pVar);
        return null;
    }

    final /* synthetic */ Void C(e eVar, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.o oVar;
        try {
            synchronized (this.f89106a) {
                try {
                    oVar = this.f89113h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (oVar == null) {
                f1(eVar, t2.f89254m, 119, null);
            } else {
                oVar.g4(21, this.f89111f.getPackageName(), com.google.android.gms.internal.play_billing.p3.e(this.f89108c, this.F.longValue()), new n1(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            f1(eVar, t2.f89254m, 74, e10);
        } catch (Exception e11) {
            f1(eVar, t2.f89252k, 74, e11);
        }
        return null;
    }

    final /* synthetic */ Object C1(l lVar) throws Exception {
        com.google.android.gms.internal.play_billing.o oVar;
        try {
            synchronized (this.f89106a) {
                try {
                    oVar = this.f89113h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (oVar == null) {
                e1(lVar, t2.f89254m, 119, null);
            } else {
                String packageName = this.f89111f.getPackageName();
                String str = this.f89108c;
                long jLongValue = this.F.longValue();
                Bundle bundle = new Bundle();
                com.google.android.gms.internal.play_billing.p3.c(bundle, str, jLongValue);
                oVar.H4(18, packageName, bundle, new o1(lVar, this.f89112g, this.f89117l, null));
            }
        } catch (DeadObjectException e10) {
            e1(lVar, t2.f89254m, 62, e10);
        } catch (Exception e11) {
            e1(lVar, t2.f89252k, 62, e11);
        }
        return null;
    }

    final /* synthetic */ Void D(r rVar, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.o oVar;
        try {
            synchronized (this.f89106a) {
                try {
                    oVar = this.f89113h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (oVar == null) {
                d1(rVar, t2.f89254m, 119, null);
            } else {
                oVar.B1(22, this.f89111f.getPackageName(), com.google.android.gms.internal.play_billing.p3.e(this.f89108c, this.F.longValue()), new p1(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            d1(rVar, t2.f89254m, 98, e10);
        } catch (Exception e11) {
            d1(rVar, t2.f89252k, 98, e11);
        }
        return null;
    }

    final /* synthetic */ void D0(c cVar) {
        n nVar = t2.f89255n;
        h1(24, 3, nVar);
        cVar.b(nVar);
    }

    final /* synthetic */ Object D1(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.o oVar;
        try {
            synchronized (this.f89106a) {
                try {
                    oVar = this.f89113h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (oVar == null) {
                g1(-1, 119, null);
            } else {
                oVar.La(12, this.f89111f.getPackageName(), bundle, new s1(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            g1(-1, 118, e10);
        } catch (Exception e11) {
            g1(6, 118, e11);
        }
        return null;
    }

    final /* synthetic */ void E0(n nVar) {
        if (this.f89110e.d() == null) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "No valid listener is set in BroadcastManager");
        } else {
            int i10 = 7 << 0;
            this.f89110e.d().onPurchasesUpdated(nVar, null);
        }
    }

    final /* synthetic */ void F0(p pVar, o oVar) {
        n nVar = t2.f89255n;
        h1(24, 4, nVar);
        pVar.d(nVar, oVar.a());
    }

    final /* synthetic */ Void F1(g gVar) throws Exception {
        com.google.android.gms.internal.play_billing.o oVar;
        try {
            synchronized (this.f89106a) {
                try {
                    oVar = this.f89113h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (oVar == null) {
                z0(gVar, t2.f89254m, 119, null);
            } else {
                oVar.N6(21, this.f89111f.getPackageName(), com.google.android.gms.internal.play_billing.p3.e(this.f89108c, this.F.longValue()), new l1(gVar, this.f89112g, this.f89117l, null));
            }
        } catch (DeadObjectException e10) {
            z0(gVar, t2.f89254m, 70, e10);
        } catch (Exception e11) {
            z0(gVar, t2.f89252k, 70, e11);
        }
        return null;
    }

    final /* synthetic */ void G0(g gVar) {
        z0(gVar, t2.f89255n, 24, null);
    }

    final /* synthetic */ Void G1(t tVar) throws Exception {
        com.google.android.gms.internal.play_billing.o oVar;
        try {
            synchronized (this.f89106a) {
                try {
                    oVar = this.f89113h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (oVar == null) {
                A0(tVar, t2.f89254m, 119, null);
            } else {
                oVar.s5(22, this.f89111f.getPackageName(), com.google.android.gms.internal.play_billing.p3.e(this.f89108c, this.F.longValue()), new m1(tVar, this.f89112g, this.f89117l, null));
            }
        } catch (DeadObjectException e10) {
            A0(tVar, t2.f89254m, 94, e10);
        } catch (Exception e11) {
            A0(tVar, t2.f89252k, 94, e11);
        }
        return null;
    }

    final /* synthetic */ void H0(t tVar) {
        A0(tVar, t2.f89255n, 24, null);
    }

    final /* synthetic */ Void H1(d dVar) throws Exception {
        com.google.android.gms.internal.play_billing.o oVar;
        try {
            synchronized (this.f89106a) {
                try {
                    oVar = this.f89113h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (oVar == null) {
                x0(dVar, t2.f89254m, 119, null);
            } else {
                oVar.ie(21, this.f89111f.getPackageName(), com.google.android.gms.internal.play_billing.p3.e(this.f89108c, this.F.longValue()), new q1(dVar, this.f89112g, this.f89117l, null));
            }
        } catch (DeadObjectException e10) {
            x0(dVar, t2.f89254m, 69, e10);
        } catch (Exception e11) {
            x0(dVar, t2.f89252k, 69, e11);
        }
        return null;
    }

    final /* synthetic */ void I0(l lVar) {
        n nVar = t2.f89255n;
        h1(24, 13, nVar);
        lVar.a(nVar, null);
    }

    final /* synthetic */ void J0(d dVar) {
        x0(dVar, t2.f89255n, 24, null);
    }

    final /* synthetic */ void K0(q qVar) {
        B0(qVar, t2.f89255n, 24, null);
    }

    final /* synthetic */ void L0(a0 a0Var) {
        n nVar = t2.f89255n;
        h1(24, 7, nVar);
        a0Var.onProductDetailsResponse(nVar, new ArrayList());
    }

    final /* synthetic */ void M0(b0 b0Var) {
        n nVar = t2.f89255n;
        h1(24, 11, nVar);
        b0Var.c(nVar, null);
    }

    final /* synthetic */ void N0(c0 c0Var) {
        n nVar = t2.f89255n;
        h1(24, 9, nVar);
        c0Var.onQueryPurchasesResponse(nVar, com.google.android.gms.internal.play_billing.r1.v());
    }

    final /* synthetic */ void O0(i0 i0Var) {
        n nVar = t2.f89255n;
        h1(24, 8, nVar);
        i0Var.a(nVar, null);
    }

    final /* synthetic */ void P0(e eVar) {
        f1(eVar, t2.f89255n, 24, null);
    }

    final /* synthetic */ void Q0(r rVar) {
        d1(rVar, t2.f89255n, 24, null);
    }

    @Override // com.android.billingclient.api.h
    public void a(final b bVar, final c cVar) {
        if (!k()) {
            n nVar = t2.f89254m;
            h1(2, 3, nVar);
            cVar.b(nVar);
            return;
        }
        if (TextUtils.isEmpty(bVar.a())) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Please provide a valid purchase token.");
            n nVar2 = t2.f89251j;
            h1(26, 3, nVar2);
            cVar.b(nVar2);
            return;
        }
        if (!this.f89120o) {
            n nVar3 = t2.f89243b;
            h1(27, 3, nVar3);
            cVar.b(nVar3);
        } else if (F(new Callable() { // from class: com.android.billingclient.api.f4
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f89050a.A1(cVar, bVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.g4
            @Override // java.lang.Runnable
            public final void run() {
                this.f89059a.D0(cVar);
            }
        }, Z0(), f0()) == null) {
            n nVarC0 = c0();
            h1(25, 3, nVarC0);
            cVar.b(nVarC0);
        }
    }

    @Override // com.android.billingclient.api.h
    public void b(final o oVar, final p pVar) {
        if (!k()) {
            n nVar = t2.f89254m;
            h1(2, 4, nVar);
            pVar.d(nVar, oVar.a());
        } else if (F(new Callable() { // from class: com.android.billingclient.api.s0
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f89231a.B1(oVar, pVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89236a.F0(pVar, oVar);
            }
        }, Z0(), f0()) == null) {
            n nVarC0 = c0();
            h1(25, 4, nVarC0);
            pVar.d(nVarC0, oVar.a());
        }
    }

    @Override // com.android.billingclient.api.h
    @r3
    public void c(final g gVar) {
        if (!k()) {
            z0(gVar, t2.f89254m, 2, null);
            return;
        }
        if (!this.f89130y) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Current client doesn't support alternative billing only.");
            z0(gVar, t2.E, 66, null);
        } else if (F(new Callable() { // from class: com.android.billingclient.api.j4
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f89139a.F1(gVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.k4
            @Override // java.lang.Runnable
            public final void run() {
                this.f89151a.G0(gVar);
            }
        }, Z0(), f0()) == null) {
            z0(gVar, c0(), 25, null);
        }
    }

    @Override // com.android.billingclient.api.h
    @s3
    public void d(final t tVar) {
        if (!k()) {
            A0(tVar, t2.f89254m, 2, null);
            return;
        }
        if (!this.f89131z) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Current client doesn't support external offer.");
            A0(tVar, t2.f89265x, com.planner5d.library.engine.input.f.b.f160733u1, null);
        } else if (F(new Callable() { // from class: com.android.billingclient.api.m0
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f89191a.G1(tVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89276a.H0(tVar);
            }
        }, Z0(), f0()) == null) {
            A0(tVar, c0(), 25, null);
        }
    }

    @Override // com.android.billingclient.api.h
    public void e() {
        j1(12);
        synchronized (this.f89106a) {
            try {
                if (this.f89110e != null) {
                    this.f89110e.f();
                    try {
                        com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Unbinding from service.");
                        n0();
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.play_billing.p3.m("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                    }
                    try {
                        m0();
                    } catch (Throwable th3) {
                        try {
                            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th3);
                        } catch (Throwable th4) {
                            l0(3);
                            throw th4;
                        }
                    }
                    l0(3);
                } else {
                    com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Unbinding from service.");
                    n0();
                    m0();
                    l0(3);
                }
            } catch (Throwable th5) {
                com.google.android.gms.internal.play_billing.p3.m("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th5);
            }
            throw th;
        }
    }

    @Override // com.android.billingclient.api.h
    @t3
    public void f(u uVar, final l lVar) {
        if (!k()) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Service disconnected.");
            n nVar = t2.f89254m;
            h1(2, 13, nVar);
            lVar.a(nVar, null);
            return;
        }
        if (!this.f89127v) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Current client doesn't support get billing config.");
            n nVar2 = t2.A;
            h1(32, 13, nVar2);
            lVar.a(nVar2, null);
            return;
        }
        if (F(new Callable() { // from class: com.android.billingclient.api.h4
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f89104a.C1(lVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.i4
            @Override // java.lang.Runnable
            public final void run() {
                this.f89134a.I0(lVar);
            }
        }, Z0(), f0()) == null) {
            n nVarC0 = c0();
            h1(25, 13, nVarC0);
            lVar.a(nVarC0, null);
        }
    }

    @Override // com.android.billingclient.api.h
    public final int g() {
        int i10;
        synchronized (this.f89106a) {
            try {
                i10 = this.f89107b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // com.android.billingclient.api.h
    @r3
    public void h(final d dVar) {
        if (!k()) {
            x0(dVar, t2.f89254m, 2, null);
            return;
        }
        if (!this.f89130y) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Current client doesn't support alternative billing only.");
            x0(dVar, t2.E, 66, null);
        } else if (F(new Callable() { // from class: com.android.billingclient.api.p0
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f89214a.H1(dVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89218a.J0(dVar);
            }
        }, Z0(), f0()) == null) {
            x0(dVar, c0(), 25, null);
        }
    }

    @Override // com.android.billingclient.api.h
    @s3
    public void i(final q qVar) {
        if (!k()) {
            B0(qVar, t2.f89254m, 2, null);
        } else if (this.f89131z) {
            if (F(new Callable() { // from class: com.android.billingclient.api.b1
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.f89001a.B(qVar);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.c1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89007a.K0(qVar);
                }
            }, Z0(), f0()) == null) {
                B0(qVar, c0(), 25, null);
            }
        } else {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Current client doesn't support external offer.");
            B0(qVar, t2.f89265x, com.planner5d.library.engine.input.f.b.f160733u1, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    @Override // com.android.billingclient.api.h
    public final n j(String str) {
        if (!k()) {
            n nVar = t2.f89254m;
            if (nVar.b() != 0) {
                h1(2, 5, nVar);
                return nVar;
            }
            j1(5);
            return nVar;
        }
        int i10 = t2.H;
        switch (str) {
            case "subscriptions":
                n nVar2 = this.f89115j ? t2.f89253l : t2.f89256o;
                v0(nVar2, 9, 2);
                return nVar2;
            case "subscriptionsUpdate":
                n nVar3 = this.f89116k ? t2.f89253l : t2.f89257p;
                v0(nVar3, 10, 3);
                return nVar3;
            case "priceChangeConfirmation":
                n nVar4 = this.f89119n ? t2.f89253l : t2.f89259r;
                v0(nVar4, 35, 4);
                return nVar4;
            case "bbb":
                n nVar5 = this.f89122q ? t2.f89253l : t2.f89264w;
                v0(nVar5, 30, 5);
                return nVar5;
            case "aaa":
                n nVar6 = this.f89124s ? t2.f89253l : t2.f89260s;
                v0(nVar6, 31, 6);
                return nVar6;
            case "ddd":
                n nVar7 = this.f89123r ? t2.f89253l : t2.f89262u;
                v0(nVar7, 21, 7);
                return nVar7;
            case "ccc":
                n nVar8 = this.f89125t ? t2.f89253l : t2.f89261t;
                v0(nVar8, 19, 8);
                return nVar8;
            case "eee":
                n nVar9 = this.f89125t ? t2.f89253l : t2.f89261t;
                v0(nVar9, 61, 9);
                return nVar9;
            case "fff":
                n nVar10 = this.f89126u ? t2.f89253l : t2.f89263v;
                v0(nVar10, 20, 10);
                return nVar10;
            case "ggg":
                n nVar11 = this.f89127v ? t2.f89253l : t2.A;
                v0(nVar11, 32, 11);
                return nVar11;
            case "hhh":
                n nVar12 = this.f89127v ? t2.f89253l : t2.B;
                v0(nVar12, 33, 12);
                return nVar12;
            case "iii":
                n nVar13 = this.f89129x ? t2.f89253l : t2.D;
                v0(nVar13, 60, 13);
                return nVar13;
            case "jjj":
                n nVar14 = this.f89130y ? t2.f89253l : t2.E;
                v0(nVar14, 66, 14);
                return nVar14;
            case "kkk":
                n nVar15 = this.f89131z ? t2.f89253l : t2.f89265x;
                v0(nVar15, com.planner5d.library.engine.input.f.b.f160733u1, 18);
                return nVar15;
            case "lll":
                n nVar16 = this.A ? t2.f89253l : t2.f89266y;
                v0(nVar16, androidx.media3.extractor.metadata.dvbsi.b.f67479d, 19);
                return nVar16;
            default:
                com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Unsupported feature: ".concat(str));
                n nVar17 = t2.f89267z;
                v0(nVar17, 34, 1);
                return nVar17;
        }
    }

    @Override // com.android.billingclient.api.h
    public final boolean k() {
        boolean z10;
        synchronized (this.f89106a) {
            try {
                z10 = false;
                if (this.f89107b == 2 && this.f89113h != null && this.f89114i != null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0495  */
    /* JADX WARN: Code duplicated, block: B:176:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:177:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:179:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:192:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:194:0x04ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:198:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:199:0x04fb  */
    @Override // com.android.billingclient.api.h
    public n l(Activity activity, final m mVar) {
        String strD;
        String strE;
        String str;
        String str2;
        String str3;
        Future futureF;
        int iA;
        int i10;
        String string;
        String str4;
        boolean z10;
        String str5;
        String str6;
        String str7;
        boolean z11;
        Intent intent;
        String str8;
        int i11;
        final int i12;
        final i iVar = this;
        String str9 = "proxyPackageVersion";
        if (iVar.f89110e == null || iVar.f89110e.d() == null) {
            n nVar = t2.F;
            iVar.h1(12, 2, nVar);
            return nVar;
        }
        if (!iVar.k()) {
            n nVar2 = t2.f89254m;
            iVar.h1(2, 2, nVar2);
            iVar.u1(nVar2);
            return nVar2;
        }
        ArrayList<SkuDetails> arrayListH = mVar.h();
        List listI = mVar.i();
        SkuDetails skuDetails = (SkuDetails) com.google.android.gms.internal.play_billing.a2.a(arrayListH, null);
        m.b bVar = (m.b) com.google.android.gms.internal.play_billing.a2.a(listI, null);
        if (skuDetails != null) {
            strD = skuDetails.n();
            strE = skuDetails.q();
        } else {
            strD = bVar.b().d();
            strE = bVar.b().e();
        }
        String str10 = "BillingClient";
        if (strE.equals("subs") && !iVar.f89115j) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Current client doesn't support subscriptions.");
            n nVar3 = t2.f89256o;
            iVar.h1(9, 2, nVar3);
            iVar.u1(nVar3);
            return nVar3;
        }
        if (mVar.r() && !iVar.f89118m) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Current client doesn't support extra params for buy intent.");
            n nVar4 = t2.f89250i;
            iVar.h1(18, 2, nVar4);
            iVar.u1(nVar4);
            return nVar4;
        }
        if (arrayListH.size() > 1 && !iVar.f89125t) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Current client doesn't support multi-item purchases.");
            n nVar5 = t2.f89261t;
            iVar.h1(19, 2, nVar5);
            iVar.u1(nVar5);
            return nVar5;
        }
        if (!listI.isEmpty() && !iVar.f89126u) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            n nVar6 = t2.f89263v;
            iVar.h1(20, 2, nVar6);
            iVar.u1(nVar6);
            return nVar6;
        }
        n nVarC = mVar.c();
        if (nVarC != t2.f89253l) {
            iVar.h1(120, 2, nVarC);
            iVar.u1(nVarC);
            return nVarC;
        }
        if (iVar.f89118m) {
            boolean z12 = iVar.f89120o;
            boolean z13 = iVar.f89128w;
            boolean zA = iVar.B.a();
            boolean zB = iVar.B.b();
            boolean z14 = iVar.C;
            String str11 = iVar.f89108c;
            final String str12 = strD;
            long jLongValue = iVar.F.longValue();
            final String packageName = iVar.f89111f.getPackageName();
            final Bundle bundle = new Bundle();
            com.google.android.gms.internal.play_billing.p3.c(bundle, str11, jLongValue);
            if (mVar.b() != 0) {
                bundle.putInt("prorationMode", mVar.b());
            }
            if (!TextUtils.isEmpty(mVar.d())) {
                bundle.putString(m.f89160h, mVar.d());
            }
            if (!TextUtils.isEmpty(mVar.e())) {
                bundle.putString("obfuscatedProfileId", mVar.e());
            }
            if (mVar.q()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(mVar.f())) {
                bundle.putString("oldSkuPurchaseToken", mVar.f());
            }
            if (TextUtils.isEmpty(null)) {
                str4 = null;
            } else {
                str4 = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(mVar.g())) {
                bundle.putString("originalExternalTransactionId", mVar.g());
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("paymentsPurchaseParams", str4);
            }
            if (z12 && zA) {
                z10 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z10 = true;
            }
            if (z13 && zB) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z10);
            }
            if (z14) {
                bundle.putBoolean("enableAlternativeBilling", z10);
            }
            if (mVar.i().stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.play_billing.a
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i13 = p3.f109248a;
                    return false;
                }
            })) {
                e5 e5VarC = f5.C();
                e5VarC.r((Iterable) mVar.i().stream().filter(new Predicate() { // from class: com.google.android.gms.internal.play_billing.b0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        int i13 = p3.f109248a;
                        return false;
                    }
                }).map(new Function() { // from class: com.google.android.gms.internal.play_billing.c1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i13 = p3.f109248a;
                        String strD2 = ((com.android.billingclient.api.m.b) obj).b().d();
                        c5 c5VarC = d5.C();
                        h5 h5VarC = i5.C();
                        h5VarC.r("subs:" + packageName + ":" + strD2);
                        c5VarC.r(h5VarC);
                        i5.C();
                        throw null;
                    }
                }).collect(com.google.android.gms.internal.play_billing.r1.B()));
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((f5) e5VarC.n()).i());
            }
            if (arrayListH.isEmpty()) {
                str5 = "proxyPackageVersion";
                str = "BUY_INTENT";
                str6 = strE;
                str7 = "BillingClient";
                ArrayList<String> arrayList = new ArrayList<>(listI.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listI.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                for (int i13 = 0; i13 < listI.size(); i13++) {
                    m.b bVar2 = (m.b) listI.get(i13);
                    z zVarB = bVar2.b();
                    if (!zVarB.i().isEmpty()) {
                        arrayList3.add(zVarB.i());
                    }
                    arrayList4.add(bVar2.c());
                    String strJ = zVarB.j();
                    if (zVarB.k() != null && !zVarB.k().isEmpty()) {
                        for (z.b bVar3 : zVarB.k()) {
                            if (!TextUtils.isEmpty(bVar3.f())) {
                                strJ = bVar3.f();
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strJ)) {
                        arrayList5.add(strJ);
                    }
                    if (i13 > 0) {
                        arrayList.add(((m.b) listI.get(i13)).b().d());
                        arrayList2.add(((m.b) listI.get(i13)).b().e());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList6);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList7 = new ArrayList<>();
                ArrayList<String> arrayList8 = new ArrayList<>();
                str6 = strE;
                ArrayList<String> arrayList9 = new ArrayList<>();
                str = "BUY_INTENT";
                ArrayList<Integer> arrayList10 = new ArrayList<>();
                ArrayList<String> arrayList11 = new ArrayList<>();
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                for (SkuDetails skuDetails2 : arrayListH) {
                    if (!skuDetails2.w().isEmpty()) {
                        arrayList7.add(skuDetails2.w());
                    }
                    String strT = skuDetails2.t();
                    String str13 = str10;
                    String strS = skuDetails2.s();
                    int iR = skuDetails2.r();
                    String strV = skuDetails2.v();
                    arrayList8.add(strT);
                    z15 |= !TextUtils.isEmpty(strT);
                    arrayList9.add(strS);
                    z16 |= !TextUtils.isEmpty(strS);
                    arrayList10.add(Integer.valueOf(iR));
                    z17 |= iR != 0;
                    z18 |= !TextUtils.isEmpty(strV);
                    arrayList11.add(strV);
                    str9 = str9;
                    str10 = str13;
                }
                str5 = str9;
                str7 = str10;
                if (!arrayList7.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (z15) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                }
                if (z16) {
                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList9);
                }
                if (z17) {
                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList10);
                }
                if (z18) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList11);
                }
                if (arrayListH.size() > 1) {
                    ArrayList<String> arrayList12 = new ArrayList<>(arrayListH.size() - 1);
                    ArrayList<String> arrayList13 = new ArrayList<>(arrayListH.size() - 1);
                    for (int i14 = 1; i14 < arrayListH.size(); i14++) {
                        arrayList12.add(((SkuDetails) arrayListH.get(i14)).n());
                        arrayList13.add(((SkuDetails) arrayListH.get(i14)).q());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList12);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList13);
                }
            }
            iVar = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !iVar.f89123r) {
                n nVar7 = t2.f89262u;
                iVar.h1(21, 2, nVar7);
                iVar.u1(nVar7);
                return nVar7;
            }
            if (skuDetails == null || TextUtils.isEmpty(skuDetails.u())) {
                if (bVar == null || TextUtils.isEmpty(bVar.b().h())) {
                    z11 = false;
                } else {
                    bundle.putString("skuPackageName", bVar.b().h());
                }
                str2 = null;
                if (!TextUtils.isEmpty(null)) {
                    bundle.putString("accountName", null);
                }
                intent = activity.getIntent();
                if (intent == null) {
                    str3 = str7;
                    com.google.android.gms.internal.play_billing.p3.l(str3, "Activity's intent is null.");
                } else {
                    str3 = str7;
                    if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                        String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                        bundle.putString("proxyPackage", stringExtra);
                        try {
                            str8 = str5;
                            try {
                                bundle.putString(str8, iVar.f89111f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (PackageManager.NameNotFoundException unused) {
                                bundle.putString(str8, "package not found");
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str8 = str5;
                        }
                    }
                }
                if (!iVar.f89126u && !listI.isEmpty()) {
                    i11 = 17;
                } else if (iVar.f89124s || !z11) {
                    if (iVar.f89120o) {
                        i12 = 9;
                    } else {
                        i11 = 6;
                    }
                    final String str14 = str6;
                    futureF = F(new Callable() { // from class: com.android.billingclient.api.d1
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f89013a.l1(i12, str12, str14, mVar, bundle);
                        }
                    }, 5000L, null, iVar.f89109d, iVar.f0());
                } else {
                    i11 = 15;
                }
                i12 = i11;
                final String str15 = str6;
                futureF = F(new Callable() { // from class: com.android.billingclient.api.d1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f89013a.l1(i12, str12, str15, mVar, bundle);
                    }
                }, 5000L, null, iVar.f89109d, iVar.f0());
            } else {
                bundle.putString("skuPackageName", skuDetails.u());
            }
            z11 = true;
            str2 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            intent = activity.getIntent();
            if (intent == null) {
                str3 = str7;
                com.google.android.gms.internal.play_billing.p3.l(str3, "Activity's intent is null.");
            } else {
                str3 = str7;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra2 = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra2);
                    str8 = str5;
                    bundle.putString(str8, iVar.f89111f.getPackageManager().getPackageInfo(stringExtra2, 0).versionName);
                }
            }
            if (!iVar.f89126u) {
                if (iVar.f89124s) {
                    if (iVar.f89120o) {
                        i12 = 9;
                    } else {
                        i11 = 6;
                        i12 = i11;
                    }
                } else if (iVar.f89120o) {
                    i12 = 9;
                } else {
                    i11 = 6;
                    i12 = i11;
                }
            } else if (iVar.f89124s) {
                if (iVar.f89120o) {
                    i12 = 9;
                } else {
                    i11 = 6;
                    i12 = i11;
                }
            } else if (iVar.f89120o) {
                i12 = 9;
            } else {
                i11 = 6;
                i12 = i11;
            }
            final String str16 = str6;
            futureF = F(new Callable() { // from class: com.android.billingclient.api.d1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f89013a.l1(i12, str12, str16, mVar, bundle);
                }
            }, 5000L, null, iVar.f89109d, iVar.f0());
        } else {
            final String str17 = strD;
            str = "BUY_INTENT";
            str2 = null;
            final String str18 = strE;
            str3 = "BillingClient";
            futureF = F(new Callable() { // from class: com.android.billingclient.api.c4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f89010a.m1(str17, str18);
                }
            }, 5000L, null, iVar.f89109d, iVar.f0());
        }
        try {
            try {
                if (futureF == null) {
                    n nVar8 = t2.f89245d;
                    iVar.h1(25, 2, nVar8);
                    iVar.u1(nVar8);
                    return nVar8;
                }
                Bundle bundle2 = (Bundle) futureF.get(5000L, TimeUnit.MILLISECONDS);
                int iB = com.google.android.gms.internal.play_billing.p3.b(bundle2, str3);
                String strH = com.google.android.gms.internal.play_billing.p3.h(bundle2, str3);
                if (iB == 0) {
                    Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    String str19 = str;
                    intent2.putExtra(str19, (PendingIntent) bundle2.getParcelable(str19));
                    activity.startActivity(intent2);
                    return t2.f89253l;
                }
                com.google.android.gms.internal.play_billing.p3.l(str3, "Unable to buy item, Error response code: " + iB);
                n nVarA = t2.a(iB, strH);
                if (bundle2 == null) {
                    i10 = 1;
                    iA = 1;
                } else {
                    try {
                        Object obj = bundle2.get("LOG_REASON");
                        if (obj != null) {
                            if (obj instanceof Integer) {
                                iA = da.a(((Integer) obj).intValue());
                                i10 = 1;
                            } else {
                                com.google.android.gms.internal.play_billing.p3.l(str3, "Unexpected type for bundle log reason: " + obj.getClass().getName());
                            }
                        }
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.play_billing.p3.l(str3, "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                    }
                    i10 = 1;
                    iA = 1;
                }
                if (iA == i10) {
                    iA = 23;
                }
                if (bundle2 == null) {
                    string = str2;
                } else {
                    try {
                        string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.p3.l(str3, "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                        string = str2;
                    }
                }
                iVar.i1(iA, 2, nVarA, string);
                iVar.u1(nVarA);
                return nVarA;
            } catch (Exception e10) {
                com.google.android.gms.internal.play_billing.p3.m(str3, "Exception while launching billing flow. Try to reconnect", e10);
                n nVar9 = t2.f89254m;
                iVar.i1(5, 2, nVar9, q2.a(e10));
                iVar.u1(nVar9);
                return nVar9;
            }
        } catch (CancellationException | TimeoutException e11) {
            com.google.android.gms.internal.play_billing.p3.m(str3, "Time out while launching billing flow. Try to reconnect", e11);
            n nVar10 = t2.f89255n;
            iVar.i1(4, 2, nVar10, q2.a(e11));
            iVar.u1(nVar10);
            return nVar10;
        }
    }

    final /* synthetic */ Bundle l1(int i10, String str, String str2, m mVar, Bundle bundle) throws Exception {
        com.google.android.gms.internal.play_billing.o oVar;
        try {
            synchronized (this.f89106a) {
                try {
                    oVar = this.f89113h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return oVar == null ? com.google.android.gms.internal.play_billing.p3.n(t2.f89254m, 119) : oVar.eb(i10, this.f89111f.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e10) {
            return com.google.android.gms.internal.play_billing.p3.o(t2.f89254m, 5, q2.a(e10));
        } catch (Exception e11) {
            return com.google.android.gms.internal.play_billing.p3.o(t2.f89252k, 5, q2.a(e11));
        }
    }

    final /* synthetic */ Bundle m1(String str, String str2) throws Exception {
        com.google.android.gms.internal.play_billing.o oVar;
        try {
            synchronized (this.f89106a) {
                try {
                    oVar = this.f89113h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return oVar == null ? com.google.android.gms.internal.play_billing.p3.n(t2.f89254m, 119) : oVar.L6(3, this.f89111f.getPackageName(), str, str2, null);
        } catch (DeadObjectException e10) {
            return com.google.android.gms.internal.play_billing.p3.o(t2.f89254m, 5, q2.a(e10));
        } catch (Exception e11) {
            return com.google.android.gms.internal.play_billing.p3.o(t2.f89252k, 5, q2.a(e11));
        }
    }

    @Override // com.android.billingclient.api.h
    public void n(final e0 e0Var, final a0 a0Var) {
        if (!k()) {
            n nVar = t2.f89254m;
            h1(2, 7, nVar);
            a0Var.onProductDetailsResponse(nVar, new ArrayList());
        } else {
            if (this.f89126u) {
                if (F(new Callable() { // from class: com.android.billingclient.api.y0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        t1 t1VarP1 = this.f89296a.p1(e0Var);
                        a0Var.onProductDetailsResponse(t2.a(t1VarP1.a(), t1VarP1.b()), t1VarP1.c());
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f89337a.L0(a0Var);
                    }
                }, Z0(), f0()) == null) {
                    n nVarC0 = c0();
                    h1(25, 7, nVarC0);
                    a0Var.onProductDetailsResponse(nVarC0, new ArrayList());
                }
                return;
            }
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Querying product details is not supported.");
            n nVar2 = t2.f89263v;
            h1(20, 7, nVar2);
            a0Var.onProductDetailsResponse(nVar2, new ArrayList());
        }
    }

    @Override // com.android.billingclient.api.h
    public final void o(f0 f0Var, b0 b0Var) {
        j0(f0Var.b(), b0Var);
    }

    @Override // com.android.billingclient.api.h
    public final void p(String str, b0 b0Var) {
        j0(str, b0Var);
    }

    @androidx.annotation.l1
    final t1 p1(e0 e0Var) {
        com.google.android.gms.internal.play_billing.o oVar;
        ArrayList arrayList = new ArrayList();
        String strC = e0Var.c();
        com.google.android.gms.internal.play_billing.r1 r1VarB = e0Var.b();
        int size = r1VarB.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 20;
            ArrayList arrayList2 = new ArrayList(r1VarB.subList(i10, i11 > size ? size : i11));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(((e0.b) arrayList2.get(i12)).b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f89108c);
            try {
                synchronized (this.f89106a) {
                    oVar = this.f89113h;
                }
                if (oVar == null) {
                    return q0(t2.f89254m, 119, "Service has been reset to null.", null);
                }
                boolean z10 = true;
                int i13 = true != this.f89129x ? 17 : 20;
                String packageName = this.f89111f.getPackageName();
                boolean zO0 = o0();
                String str = this.f89108c;
                d0(e0Var);
                d0(e0Var);
                d0(e0Var);
                d0(e0Var);
                long jLongValue = this.F.longValue();
                Bundle bundle2 = new Bundle();
                com.google.android.gms.internal.play_billing.p3.c(bundle2, str, jLongValue);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zO0) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                int i14 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (i14 < size3) {
                    e0.b bVar = (e0.b) arrayList2.get(i14);
                    boolean z13 = z10;
                    arrayList4.add(null);
                    z11 |= !TextUtils.isEmpty(null);
                    String strC2 = bVar.c();
                    com.google.android.gms.internal.play_billing.o oVar2 = oVar;
                    if (strC2.equals("first_party")) {
                        com.google.android.gms.internal.play_billing.g0.c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z12 = z13;
                    }
                    i14++;
                    oVar = oVar2;
                    z10 = z13;
                }
                com.google.android.gms.internal.play_billing.o oVar3 = oVar;
                if (z11) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z12 && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                Bundle bundleF5 = oVar3.F5(i13, packageName, strC, bundle, bundle2);
                if (bundleF5 == null) {
                    return q0(t2.C, 44, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleF5.containsKey("DETAILS_LIST")) {
                    int iB = com.google.android.gms.internal.play_billing.p3.b(bundleF5, "BillingClient");
                    String strH = com.google.android.gms.internal.play_billing.p3.h(bundleF5, "BillingClient");
                    if (iB == 0) {
                        return q0(t2.a(6, strH), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return q0(t2.a(iB, strH), 23, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iB, null);
                }
                ArrayList<String> stringArrayList = bundleF5.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return q0(t2.C, 46, "queryProductDetailsAsync got null response list", null);
                }
                for (int i15 = 0; i15 < stringArrayList.size(); i15++) {
                    try {
                        z zVar = new z(stringArrayList.get(i15));
                        com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Got product details: ".concat(zVar.toString()));
                        arrayList.add(zVar);
                    } catch (JSONException e10) {
                        return q0(t2.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                    }
                }
                i10 = i11;
            } catch (DeadObjectException e11) {
                return q0(t2.f89254m, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e11);
            } catch (Exception e12) {
                return q0(t2.f89252k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
            }
        }
        return new t1(0, "", arrayList);
    }

    @Override // com.android.billingclient.api.h
    public final void q(g0 g0Var, c0 c0Var) {
        k0(g0Var.b(), c0Var);
    }

    @Override // com.android.billingclient.api.h
    public final void r(String str, c0 c0Var) {
        k0(str, c0Var);
    }

    @Override // com.android.billingclient.api.h
    public void s(h0 h0Var, final i0 i0Var) {
        if (!k()) {
            n nVar = t2.f89254m;
            h1(2, 8, nVar);
            i0Var.a(nVar, null);
            return;
        }
        final String strA = h0Var.a();
        final List<String> listB = h0Var.b();
        if (TextUtils.isEmpty(strA)) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Please fix the input params. SKU type can't be empty.");
            n nVar2 = t2.f89248g;
            h1(49, 8, nVar2);
            i0Var.a(nVar2, null);
            return;
        }
        if (listB == null) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            n nVar3 = t2.f89247f;
            h1(48, 8, nVar3);
            i0Var.a(nVar3, null);
            return;
        }
        final String str = null;
        if (F(new Callable(strA, listB, str, i0Var) { // from class: com.android.billingclient.api.l4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f89157b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List f89158c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ i0 f89159d;

            {
                this.f89159d = i0Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                n3 n3VarV1 = this.f89156a.v1(this.f89157b, this.f89158c, null);
                this.f89159d.a(t2.a(n3VarV1.a(), n3VarV1.b()), n3VarV1.c());
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89200a.O0(i0Var);
            }
        }, Z0(), f0()) == null) {
            n nVarC0 = c0();
            h1(25, 8, nVarC0);
            i0Var.a(nVarC0, null);
        }
    }

    final r2 s1() {
        return this.f89112g;
    }

    @Override // com.android.billingclient.api.h
    @r3
    public n t(final Activity activity, final e eVar) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!k()) {
            n nVar = t2.f89254m;
            h1(2, 16, nVar);
            return nVar;
        }
        if (!this.f89130y) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            n nVar2 = t2.E;
            h1(66, 16, nVar2);
            return nVar2;
        }
        final zzaw zzawVar = new zzaw(this, this.f89109d, eVar);
        if (F(new Callable() { // from class: com.android.billingclient.api.d4
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f89023a.C(eVar, activity, zzawVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.e4
            @Override // java.lang.Runnable
            public final void run() {
                this.f89037a.P0(eVar);
            }
        }, this.f89109d, f0()) != null) {
            return t2.f89253l;
        }
        n nVarC0 = c0();
        h1(25, 16, nVarC0);
        return nVarC0;
    }

    @Override // com.android.billingclient.api.h
    @s3
    public n u(final Activity activity, final r rVar) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!k()) {
            n nVar = t2.f89254m;
            h1(2, 25, nVar);
            return nVar;
        }
        if (!this.f89131z) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Current Play Store version doesn't support external offer.");
            n nVar2 = t2.f89265x;
            h1(com.planner5d.library.engine.input.f.b.f160733u1, 25, nVar2);
            return nVar2;
        }
        final zzax zzaxVar = new zzax(this, this.f89109d, rVar);
        if (F(new Callable() { // from class: com.android.billingclient.api.u0
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f89268a.D(rVar, activity, zzaxVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.w0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89280a.Q0(rVar);
            }
        }, this.f89109d, f0()) != null) {
            return t2.f89253l;
        }
        n nVarC0 = c0();
        h1(25, 25, nVarC0);
        return nVarC0;
    }

    final n u1(final n nVar) {
        if (Thread.interrupted()) {
            return nVar;
        }
        this.f89109d.post(new Runnable() { // from class: com.android.billingclient.api.b4
            @Override // java.lang.Runnable
            public final void run() {
                this.f89005a.E0(nVar);
            }
        });
        return nVar;
    }

    @Override // com.android.billingclient.api.h
    public final n v(final Activity activity, v vVar, w wVar) {
        if (!k()) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Service disconnected.");
            return t2.f89254m;
        }
        if (!this.f89122q) {
            com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Current client doesn't support showing in-app messages.");
            return t2.f89264w;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        androidx.core.app.l.b(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f89108c);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", vVar.b());
        final zzav zzavVar = new zzav(this, this.f89109d, wVar);
        F(new Callable() { // from class: com.android.billingclient.api.a1
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f88992a.D1(bundle, activity, zzavVar);
                return null;
            }
        }, 5000L, null, this.f89109d, f0());
        return t2.f89253l;
    }

    @androidx.annotation.l1
    final n3 v1(String str, List list, @androidx.annotation.p0 String str2) {
        com.google.android.gms.internal.play_billing.o oVar;
        Bundle bundleIb;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i10, i11 > size ? size : i11));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.f89108c);
            try {
                synchronized (this.f89106a) {
                    oVar = this.f89113h;
                }
                if (oVar == null) {
                    return u0(t2.f89254m, 119, "Service has been reset to null.", null);
                }
                if (this.f89121p) {
                    String packageName = this.f89111f.getPackageName();
                    int i12 = this.f89117l;
                    boolean zA = this.B.a();
                    boolean zO0 = o0();
                    String str3 = this.f89108c;
                    long jLongValue = this.F.longValue();
                    Bundle bundle2 = new Bundle();
                    if (i12 >= 9) {
                        com.google.android.gms.internal.play_billing.p3.c(bundle2, str3, jLongValue);
                    }
                    if (i12 >= 9 && zA) {
                        bundle2.putBoolean("enablePendingPurchases", true);
                    }
                    if (zO0) {
                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                    bundleIb = oVar.F5(10, packageName, str, bundle, bundle2);
                } else {
                    bundleIb = oVar.ib(3, this.f89111f.getPackageName(), str, bundle);
                }
                if (bundleIb == null) {
                    return u0(t2.C, 44, "querySkuDetailsAsync got null sku details list", null);
                }
                if (!bundleIb.containsKey("DETAILS_LIST")) {
                    int iB = com.google.android.gms.internal.play_billing.p3.b(bundleIb, "BillingClient");
                    String strH = com.google.android.gms.internal.play_billing.p3.h(bundleIb, "BillingClient");
                    if (iB == 0) {
                        return u0(t2.a(6, strH), 45, "getSkuDetails() returned a bundle with neither an error nor a detail list.", null);
                    }
                    return u0(t2.a(iB, strH), 23, "getSkuDetails() failed. Response code: " + iB, null);
                }
                ArrayList<String> stringArrayList = bundleIb.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return u0(t2.C, 46, "querySkuDetailsAsync got null response list", null);
                }
                for (int i13 = 0; i13 < stringArrayList.size(); i13++) {
                    try {
                        SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i13));
                        com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                        arrayList.add(skuDetails);
                    } catch (JSONException e10) {
                        return u0(t2.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode SkuDetails.", e10);
                    }
                }
                i10 = i11;
            } catch (DeadObjectException e11) {
                return u0(t2.f89254m, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e11);
            } catch (Exception e12) {
                return u0(t2.f89252k, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e12);
            }
        }
        return new n3(0, "", arrayList);
    }

    @Override // com.android.billingclient.api.h
    public void w(j jVar) {
        n nVarB1;
        n nVar;
        synchronized (this.f89106a) {
            try {
                if (k()) {
                    nVarB1 = b1();
                } else {
                    if (this.f89107b == 1) {
                        com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Client is already in the process of connecting to billing service.");
                        nVar = t2.f89246e;
                        h1(37, 6, nVar);
                    } else if (this.f89107b == 3) {
                        com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        nVar = t2.f89254m;
                        h1(38, 6, nVar);
                    } else {
                        l0(1);
                        n0();
                        com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Starting in-app billing setup.");
                        this.f89114i = new k1(this, jVar, null);
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f89111f.getPackageManager().queryIntentServices(intent, 0);
                        int i10 = 41;
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            l0(0);
                            com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Billing service unavailable on device.");
                            n nVar2 = t2.f89244c;
                            h1(i10, 6, nVar2);
                            nVarB1 = nVar2;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            i10 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    com.google.android.gms.internal.play_billing.p3.l("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f89108c);
                                    synchronized (this.f89106a) {
                                        try {
                                            if (this.f89107b == 2) {
                                                nVarB1 = b1();
                                            } else if (this.f89107b != 1) {
                                                com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                nVar = t2.f89254m;
                                                h1(me.relex.circleindicator.a.f332619e, 6, nVar);
                                            } else {
                                                k1 k1Var = this.f89114i;
                                                if (this.f89111f.bindService(intent2, k1Var, 1)) {
                                                    com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Service was bonded successfully.");
                                                    nVarB1 = null;
                                                } else {
                                                    com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Connection to Billing service is blocked.");
                                                    i10 = 39;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            } else {
                                com.google.android.gms.internal.play_billing.p3.l("BillingClient", "The device doesn't have valid Play Store.");
                            }
                            l0(0);
                            com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Billing service unavailable on device.");
                            n nVar3 = t2.f89244c;
                            h1(i10, 6, nVar3);
                            nVarB1 = nVar3;
                        }
                    }
                    nVarB1 = nVar;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (nVarB1 != null) {
            jVar.onBillingSetupFinished(nVarB1);
        }
    }

    final synchronized m4 x1() {
        try {
            if (this.E == null) {
                this.E = t4.a(f0());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.E;
    }

    @androidx.annotation.d
    private i(Context context, y yVar, d0 d0Var, String str, String str2, @androidx.annotation.p0 j0 j0Var, @androidx.annotation.p0 r2 r2Var, @androidx.annotation.p0 ExecutorService executorService) {
        this.f89106a = new Object();
        this.f89107b = 0;
        this.f89109d = new Handler(Looper.getMainLooper());
        this.f89117l = 0;
        this.F = Long.valueOf(new Random().nextLong());
        this.f89108c = str;
        x(context, d0Var, yVar, j0Var, str, null);
    }

    private i(String str) {
        this.f89106a = new Object();
        this.f89107b = 0;
        this.f89109d = new Handler(Looper.getMainLooper());
        this.f89117l = 0;
        this.F = Long.valueOf(new Random().nextLong());
        this.f89108c = str;
    }

    @androidx.annotation.d
    i(@androidx.annotation.p0 String str, Context context, @androidx.annotation.p0 r2 r2Var, @androidx.annotation.p0 ExecutorService executorService) {
        this.f89106a = new Object();
        this.f89107b = 0;
        this.f89109d = new Handler(Looper.getMainLooper());
        this.f89117l = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.F = lValueOf;
        String strE0 = e0();
        this.f89108c = strE0;
        this.f89111f = context.getApplicationContext();
        pa paVarH = ra.H();
        paVarH.u(strE0);
        paVarH.t(this.f89111f.getPackageName());
        paVarH.s(lValueOf.longValue());
        this.f89112g = new v2(this.f89111f, (ra) paVarH.n());
        this.f89111f.getPackageName();
    }

    @androidx.annotation.d
    i(@androidx.annotation.p0 String str, y yVar, Context context, y2 y2Var, @androidx.annotation.p0 r2 r2Var, @androidx.annotation.p0 ExecutorService executorService) {
        this.f89106a = new Object();
        this.f89107b = 0;
        this.f89109d = new Handler(Looper.getMainLooper());
        this.f89117l = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.F = lValueOf;
        this.f89108c = e0();
        this.f89111f = context.getApplicationContext();
        pa paVarH = ra.H();
        paVarH.u(e0());
        paVarH.t(this.f89111f.getPackageName());
        paVarH.s(lValueOf.longValue());
        this.f89112g = new v2(this.f89111f, (ra) paVarH.n());
        com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f89110e = new z3(this.f89111f, null, null, null, null, this.f89112g);
        this.B = yVar;
        this.f89111f.getPackageName();
    }

    @androidx.annotation.d
    i(@androidx.annotation.p0 String str, y yVar, Context context, d0 d0Var, @androidx.annotation.p0 j1 j1Var, @androidx.annotation.p0 r2 r2Var, @androidx.annotation.p0 ExecutorService executorService) {
        String strE0 = e0();
        this.f89106a = new Object();
        this.f89107b = 0;
        this.f89109d = new Handler(Looper.getMainLooper());
        this.f89117l = 0;
        this.F = Long.valueOf(new Random().nextLong());
        this.f89108c = strE0;
        int i10 = 2 ^ 0;
        y(context, d0Var, yVar, null, strE0, null);
    }

    @androidx.annotation.d
    i(@androidx.annotation.p0 String str, y yVar, Context context, d0 d0Var, @androidx.annotation.p0 j0 j0Var, @androidx.annotation.p0 r2 r2Var, @androidx.annotation.p0 ExecutorService executorService) {
        this(context, yVar, d0Var, e0(), null, j0Var, null, null);
    }
}

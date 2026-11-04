package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class f4 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile f4 f108413j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f108414a = "FA";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.util.g f108415b = com.google.android.gms.common.util.k.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ExecutorService f108416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n6.a f108417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("listenerList")
    private final List f108418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f108419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f108420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f108421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile u1 f108422i;

    protected f4(Context context, Bundle bundle) {
        p1.a();
        int i10 = 2 << 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new g3(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f108416c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f108417d = new n6.a(this);
        this.f108418e = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.db.a(context, "google_app_id", com.google.android.gms.measurement.internal.y6.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, f4.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f108421h = null;
                    this.f108420g = true;
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f108421h = "fa";
        m(new t2(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new e4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void m(t3 t3Var) {
        this.f108416c.execute(t3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void n(Exception exc, boolean z10, boolean z11) {
        this.f108420g |= z10;
        if (!z10 && z11) {
            d(5, "Error with data collection. Data lost.", exc, null, null);
        }
    }

    private final void u(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        m(new s3(this, l10, str, str2, bundle, z10, z11));
    }

    public static f4 v(Context context, Bundle bundle) {
        com.google.android.gms.common.internal.w.r(context);
        if (f108413j == null) {
            synchronized (f4.class) {
                try {
                    if (f108413j == null) {
                        f108413j = new f4(context, bundle);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f108413j;
    }

    public final void A(com.google.android.gms.measurement.internal.w8 w8Var) {
        com.google.android.gms.common.internal.w.r(w8Var);
        List list = this.f108418e;
        synchronized (list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                try {
                    if (w8Var.equals(((Pair) list.get(i10)).first)) {
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            v3 v3Var = new v3(w8Var);
            list.add(new Pair(w8Var, v3Var));
            if (this.f108422i != null) {
                try {
                    this.f108422i.registerOnMeasurementEventListener(v3Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            m(new q3(this, v3Var));
        }
    }

    public final void B(com.google.android.gms.measurement.internal.w8 w8Var) {
        Pair pair;
        com.google.android.gms.common.internal.w.r(w8Var);
        List list = this.f108418e;
        synchronized (list) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= list.size()) {
                        pair = null;
                        break;
                    } else {
                        if (w8Var.equals(((Pair) list.get(i10)).first)) {
                            pair = (Pair) list.get(i10);
                            break;
                        }
                        i10++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pair == null) {
                return;
            }
            list.remove(pair);
            v3 v3Var = (v3) pair.second;
            if (this.f108422i != null) {
                try {
                    this.f108422i.unregisterOnMeasurementEventListener(v3Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            m(new r3(this, v3Var));
        }
    }

    public final void C(@NonNull String str, Bundle bundle) {
        u(null, str, bundle, false, true, null);
    }

    public final void D(String str, String str2, Bundle bundle) {
        u(str, str2, bundle, true, true, null);
    }

    public final void E(String str, String str2, Bundle bundle, long j10) {
        u(str, str2, bundle, true, false, Long.valueOf(j10));
    }

    public final void F(String str, String str2, Object obj, boolean z10) {
        m(new j2(this, str, str2, obj, z10));
    }

    public final void G(Bundle bundle) {
        m(new k2(this, bundle));
    }

    public final void H(String str, String str2, Bundle bundle) {
        m(new l2(this, str, str2, bundle));
    }

    public final List I(String str, String str2) {
        r1 r1Var = new r1();
        m(new m2(this, str, str2, r1Var));
        List list = (List) r1.s(r1Var.p(5000L), List.class);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        return list;
    }

    public final void J(String str) {
        m(new n2(this, str));
    }

    public final void K(zzdf zzdfVar, String str, String str2) {
        m(new o2(this, zzdfVar, str, str2));
    }

    public final void L(Boolean bool) {
        m(new p2(this, bool));
    }

    public final void M(Bundle bundle) {
        m(new q2(this, bundle));
    }

    public final void N() {
        m(new r2(this));
    }

    public final void O(long j10) {
        m(new s2(this, j10));
    }

    public final void P(String str) {
        m(new u2(this, str));
    }

    public final void Q(String str) {
        m(new v2(this, str));
    }

    public final void R(Runnable runnable) {
        m(new x2(this, runnable));
    }

    public final String S() {
        r1 r1Var = new r1();
        m(new y2(this, r1Var));
        return r1Var.k(500L);
    }

    public final String T() {
        r1 r1Var = new r1();
        m(new z2(this, r1Var));
        return r1Var.k(50L);
    }

    public final long U() {
        r1 r1Var = new r1();
        m(new a3(this, r1Var));
        Long lN = r1Var.n(500L);
        if (lN != null) {
            return lN.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f108415b.currentTimeMillis()).nextLong();
        int i10 = this.f108419f + 1;
        this.f108419f = i10;
        return jNextLong + ((long) i10);
    }

    public final String a() {
        r1 r1Var = new r1();
        m(new b3(this, r1Var));
        return r1Var.k(500L);
    }

    public final String b() {
        r1 r1Var = new r1();
        m(new d3(this, r1Var));
        return r1Var.k(500L);
    }

    public final Map c(String str, String str2, boolean z10) {
        r1 r1Var = new r1();
        m(new e3(this, str, str2, z10, r1Var));
        Bundle bundleP = r1Var.p(5000L);
        if (bundleP != null && bundleP.size() != 0) {
            HashMap map = new HashMap(bundleP.size());
            for (String str3 : bundleP.keySet()) {
                Object obj = bundleP.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    map.put(str3, obj);
                }
            }
            return map;
        }
        return Collections.EMPTY_MAP;
    }

    public final void d(int i10, String str, Object obj, Object obj2, Object obj3) {
        m(new f3(this, false, 5, str, obj, null, null));
    }

    public final Bundle e(Bundle bundle, boolean z10) {
        r1 r1Var = new r1();
        m(new h3(this, bundle, r1Var));
        if (z10) {
            return r1Var.p(5000L);
        }
        return null;
    }

    public final int f(String str) {
        r1 r1Var = new r1();
        m(new i3(this, str, r1Var));
        Integer num = (Integer) r1.s(r1Var.p(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @androidx.annotation.m1
    public final String g() {
        r1 r1Var = new r1();
        m(new j3(this, r1Var));
        return r1Var.k(120000L);
    }

    @androidx.annotation.m1
    public final Long h() {
        r1 r1Var = new r1();
        m(new k3(this, r1Var));
        return r1Var.n(120000L);
    }

    public final String i() {
        return this.f108421h;
    }

    public final Object j(int i10) {
        r1 r1Var = new r1();
        m(new l3(this, r1Var, i10));
        return r1.s(r1Var.p(15000L), Object.class);
    }

    public final void k(boolean z10) {
        m(new m3(this, z10));
    }

    public final void l(Bundle bundle) {
        m(new n3(this, bundle));
    }

    final /* synthetic */ String o() {
        return this.f108414a;
    }

    final /* synthetic */ boolean p() {
        return this.f108420g;
    }

    final /* synthetic */ u1 q() {
        return this.f108422i;
    }

    final /* synthetic */ void r(u1 u1Var) {
        this.f108422i = u1Var;
    }

    public final n6.a w() {
        return this.f108417d;
    }

    protected final u1 x(Context context, boolean z10) {
        try {
            return t1.asInterface(DynamiteModule.e(context, z10 ? DynamiteModule.f107047i : DynamiteModule.f107045g, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e10) {
            n(e10, true, false);
            return null;
        }
    }

    public final void y(com.google.android.gms.measurement.internal.v8 v8Var) {
        u3 u3Var = new u3(v8Var);
        if (this.f108422i != null) {
            try {
                this.f108422i.setEventInterceptor(u3Var);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        m(new o3(this, u3Var));
    }

    public final void z(Intent intent) {
        m(new p3(this, intent));
    }
}

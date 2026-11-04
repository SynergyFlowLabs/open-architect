package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @fj.h
    private static volatile x1 f107891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile boolean f107892h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f107896l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v1 f107897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f107898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f107899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f107900d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f107901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f107890f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicReference f107893i = new AtomicReference();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final b2 f107894j = new b2(q1.f107761a);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f107895k = new AtomicInteger();

    /* synthetic */ z1(v1 v1Var, String str, Object obj, boolean z10, y1 y1Var) {
        if (v1Var.f107853a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f107897a = v1Var;
        this.f107898b = str;
        this.f107899c = obj;
    }

    public static void c() {
        f107895k.incrementAndGet();
    }

    public static void d(final Context context) {
        if (f107891g != null || context == null) {
            return;
        }
        Object obj = f107890f;
        synchronized (obj) {
            try {
                if (f107891g == null) {
                    synchronized (obj) {
                        try {
                            x1 x1Var = f107891g;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (x1Var == null || x1Var.a() != context) {
                                c1.d();
                                a2.c();
                                k1.e();
                                f107891g = new z0(context, l2.a(new g2() { // from class: com.google.android.gms.internal.auth.p1
                                    @Override // com.google.android.gms.internal.auth.g2
                                    public final Object a() {
                                        Context context2 = context;
                                        int i10 = z1.f107896l;
                                        return l1.a(context2);
                                    }
                                }));
                                f107895k.incrementAndGet();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    abstract Object a(Object obj);

    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r2
      0x0047: PHI (r2v1 com.google.android.gms.internal.auth.e2) = (r2v0 com.google.android.gms.internal.auth.e2), (r2v5 com.google.android.gms.internal.auth.e2) binds: [B:8:0x0019, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object b() {
        String strA;
        h1 h1VarB;
        Object objA;
        int i10 = f107895k.get();
        if (this.f107900d < i10) {
            synchronized (this) {
                try {
                    if (this.f107900d < i10) {
                        x1 x1Var = f107891g;
                        e2 e2VarC = e2.c();
                        Object objA2 = null;
                        if (x1Var != null) {
                            e2VarC = (e2) x1Var.b().a();
                            if (e2VarC.b()) {
                                e1 e1Var = (e1) e2VarC.a();
                                v1 v1Var = this.f107897a;
                                strA = e1Var.a(v1Var.f107853a, null, v1Var.f107855c, this.f107898b);
                            } else {
                                strA = null;
                            }
                        } else {
                            strA = null;
                        }
                        if (x1Var == null) {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                        Uri uri = this.f107897a.f107853a;
                        if (uri != null) {
                            h1VarB = m1.a(x1Var.a(), uri) ? c1.b(x1Var.a().getContentResolver(), this.f107897a.f107853a, new Runnable() { // from class: com.google.android.gms.internal.auth.o1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    z1.c();
                                }
                            }) : null;
                        } else {
                            h1VarB = a2.b(x1Var.a(), null, new Runnable() { // from class: com.google.android.gms.internal.auth.o1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    z1.c();
                                }
                            });
                        }
                        Object objA3 = (h1VarB == null || (objA = h1VarB.a(this.f107898b)) == null) ? null : a(objA);
                        if (objA3 == null) {
                            if (!this.f107897a.f107856d) {
                                String strC = k1.b(x1Var.a()).a(this.f107897a.f107856d ? null : this.f107898b);
                                if (strC != null) {
                                    objA2 = a(strC);
                                }
                            }
                            objA3 = objA2 == null ? this.f107899c : objA2;
                        }
                        if (e2VarC.b()) {
                            objA3 = strA == null ? this.f107899c : a(strA);
                        }
                        this.f107901e = objA3;
                        this.f107900d = i10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f107901e;
    }
}

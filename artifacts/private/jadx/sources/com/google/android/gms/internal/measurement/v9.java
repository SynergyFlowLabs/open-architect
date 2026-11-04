package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f108918g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @fj.h
    private static volatile q9 f108919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile boolean f108920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f108921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f108922k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p9 f108923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f108924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f108925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f108926d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f108927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f108928f;

    static {
        new AtomicReference();
        com.google.common.base.j0.F(t9.f108876a, "BuildInfo must be non-null");
        f108921j = new AtomicInteger();
    }

    /* synthetic */ v9(p9 p9Var, String str, Object obj, boolean z10, byte[] bArr) {
        int i10 = 2 ^ (-1);
        if (p9Var.f108733a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f108923a = p9Var;
        this.f108924b = str;
        this.f108925c = obj;
        this.f108928f = false;
    }

    public static void b(final Context context) {
        if (f108919h == null && context != null) {
            Object obj = f108918g;
            synchronized (obj) {
                try {
                    if (f108919h == null) {
                        synchronized (obj) {
                            try {
                                q9 q9Var = f108919h;
                                Context applicationContext = context.getApplicationContext();
                                if (applicationContext != null) {
                                    context = applicationContext;
                                }
                                if (q9Var == null || q9Var.a() != context) {
                                    if (q9Var != null) {
                                        z8.f();
                                        x9.d();
                                        g9.e();
                                    }
                                    f108919h = new v8(context, com.google.common.base.t0.b(new com.google.common.base.s0() { // from class: com.google.android.gms.internal.measurement.u9
                                        @Override // com.google.common.base.s0
                                        public final /* synthetic */ Object get() {
                                            int i10 = v9.f108922k;
                                            return h9.a(context);
                                        }
                                    }));
                                    f108921j.incrementAndGet();
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
    }

    public static void c() {
        f108921j.incrementAndGet();
    }

    @fj.h
    abstract Object a(Object obj);

    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[PHI: r2
      0x0058: PHI (r2v1 com.google.common.base.e0) = (r2v0 com.google.common.base.e0), (r2v0 com.google.common.base.e0), (r2v7 com.google.common.base.e0) binds: [B:8:0x0019, B:10:0x0021, B:12:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object d() {
        String strA;
        d9 d9VarC;
        String strA2;
        Object objA;
        int i10 = f108921j.get();
        if (this.f108926d < i10) {
            synchronized (this) {
                try {
                    if (this.f108926d < i10) {
                        q9 q9Var = f108919h;
                        com.google.common.base.e0 e0VarA = com.google.common.base.e0.a();
                        Object objA2 = null;
                        if (q9Var == null || q9Var.b() == null) {
                            strA = null;
                        } else {
                            e0VarA = (com.google.common.base.e0) ((com.google.common.base.s0) com.google.common.base.j0.E(q9Var.b())).get();
                            if (e0VarA.e()) {
                                b9 b9Var = (b9) e0VarA.d();
                                p9 p9Var = this.f108923a;
                                strA = b9Var.a(p9Var.f108733a, null, p9Var.f108735c, this.f108924b);
                            } else {
                                strA = null;
                            }
                        }
                        com.google.common.base.j0.h0(q9Var != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        p9 p9Var2 = this.f108923a;
                        Uri uri = p9Var2.f108733a;
                        if (uri != null) {
                            d9VarC = j9.a(q9Var.a(), uri) ? z8.c(q9Var.a().getContentResolver(), uri, s9.f108799a) : null;
                        } else {
                            d9VarC = x9.c(q9Var.a(), (String) com.google.common.base.j0.E(null), r9.f108770a);
                        }
                        Object objA3 = (d9VarC == null || (objA = d9VarC.a(this.f108924b)) == null) ? null : a(objA);
                        if (objA3 == null) {
                            if (!p9Var2.f108736d && (strA2 = g9.c(q9Var.a()).a(this.f108924b)) != null) {
                                objA2 = a(strA2);
                            }
                            objA3 = objA2 == null ? this.f108925c : objA2;
                        }
                        if (e0VarA.e()) {
                            objA3 = strA == null ? this.f108925c : a(strA);
                        }
                        this.f108927e = objA3;
                        this.f108926d = i10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f108927e;
    }
}

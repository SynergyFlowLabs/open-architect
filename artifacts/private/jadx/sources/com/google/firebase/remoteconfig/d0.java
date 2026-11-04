package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.compose.animation.core.z1;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
@g6.a
public class d0 implements k9.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f124427j = "activate";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f124428k = "fetch";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f124429l = "defaults";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f124430m = 60;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f124431n = "frc";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f124432o = "settings";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @l1
    public static final String f124433p = "firebase";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final com.google.android.gms.common.util.g f124434q = com.google.android.gms.common.util.k.d();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Random f124435r = new Random();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Map<String, r> f124436s = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final Map<String, r> f124437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f124438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f124439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.h f124440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.installations.k f124441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.abt.d f124442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final z8.b<com.google.firebase.analytics.connector.a> f124443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f124444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private Map<String, String> f124445i;

    private static class a implements com.google.android.gms.common.api.internal.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AtomicReference<a> f124446a = new AtomicReference<>();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference = f124446a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (z1.a(atomicReference, null, aVar)) {
                    com.google.android.gms.common.api.internal.d.c(application);
                    com.google.android.gms.common.api.internal.d.b().a(aVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.d.a
        public void a(boolean z10) {
            d0.q(z10);
        }
    }

    d0(Context context, @d8.b ScheduledExecutorService scheduledExecutorService, com.google.firebase.h hVar, com.google.firebase.installations.k kVar, com.google.firebase.abt.d dVar, z8.b<com.google.firebase.analytics.connector.a> bVar) {
        this(context, scheduledExecutorService, hVar, kVar, dVar, bVar, true);
    }

    public static /* synthetic */ com.google.firebase.analytics.connector.a b() {
        return null;
    }

    private com.google.firebase.remoteconfig.internal.g f(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.g.j(this.f124439c, com.google.firebase.remoteconfig.internal.v.d(this.f124438b, String.format("%s_%s_%s_%s.json", "frc", this.f124444h, str, str2)));
    }

    private com.google.firebase.remoteconfig.internal.p j(com.google.firebase.remoteconfig.internal.g gVar, com.google.firebase.remoteconfig.internal.g gVar2) {
        return new com.google.firebase.remoteconfig.internal.p(this.f124439c, gVar, gVar2);
    }

    @p0
    private static com.google.firebase.remoteconfig.internal.z k(com.google.firebase.h hVar, String str, z8.b<com.google.firebase.analytics.connector.a> bVar) {
        if (p(hVar) && str.equals(f124433p)) {
            return new com.google.firebase.remoteconfig.internal.z(bVar);
        }
        return null;
    }

    private com.google.firebase.remoteconfig.internal.rollouts.e m(com.google.firebase.remoteconfig.internal.g gVar, com.google.firebase.remoteconfig.internal.g gVar2) {
        return new com.google.firebase.remoteconfig.internal.rollouts.e(gVar, com.google.firebase.remoteconfig.internal.rollouts.a.a(gVar, gVar2), this.f124439c);
    }

    @l1
    static com.google.firebase.remoteconfig.internal.u n(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.u(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, f124432o), 0));
    }

    private static boolean o(com.google.firebase.h hVar, String str) {
        return str.equals(f124433p) && p(hVar);
    }

    private static boolean p(com.google.firebase.h hVar) {
        return hVar.r().equals(com.google.firebase.h.f122060l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void q(boolean z10) {
        try {
            Iterator<r> it = f124436s.values().iterator();
            while (it.hasNext()) {
                it.next().G(z10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // k9.a
    public void a(@NonNull String str, @NonNull com.google.firebase.remoteconfig.interop.rollouts.f fVar) {
        e(str).y().e(fVar);
    }

    @l1
    synchronized r d(com.google.firebase.h hVar, String str, com.google.firebase.installations.k kVar, com.google.firebase.abt.d dVar, Executor executor, com.google.firebase.remoteconfig.internal.g gVar, com.google.firebase.remoteconfig.internal.g gVar2, com.google.firebase.remoteconfig.internal.g gVar3, com.google.firebase.remoteconfig.internal.n nVar, com.google.firebase.remoteconfig.internal.p pVar, com.google.firebase.remoteconfig.internal.u uVar, com.google.firebase.remoteconfig.internal.rollouts.e eVar) throws Throwable {
        d0 d0Var;
        String str2;
        try {
            try {
                if (this.f124437a.containsKey(str)) {
                    d0Var = this;
                    str2 = str;
                } else {
                    d0Var = this;
                    str2 = str;
                    r rVar = new r(this.f124438b, hVar, kVar, o(hVar, str) ? dVar : null, executor, gVar, gVar2, gVar3, nVar, pVar, uVar, l(hVar, kVar, nVar, gVar2, this.f124438b, str, uVar), eVar);
                    rVar.L();
                    d0Var.f124437a.put(str2, rVar);
                    f124436s.put(str2, rVar);
                }
                return d0Var.f124437a.get(str2);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @l1
    @g6.a
    public synchronized r e(String str) throws Throwable {
        Throwable th2;
        try {
            try {
                com.google.firebase.remoteconfig.internal.g gVarF = f(str, f124428k);
                com.google.firebase.remoteconfig.internal.g gVarF2 = f(str, f124427j);
                com.google.firebase.remoteconfig.internal.g gVarF3 = f(str, f124429l);
                com.google.firebase.remoteconfig.internal.u uVarN = n(this.f124438b, this.f124444h, str);
                com.google.firebase.remoteconfig.internal.p pVarJ = j(gVarF2, gVarF3);
                final com.google.firebase.remoteconfig.internal.z zVarK = k(this.f124440d, str, this.f124443g);
                if (zVarK != null) {
                    try {
                        pVarJ.b(new com.google.android.gms.common.util.d() { // from class: com.google.firebase.remoteconfig.a0
                            @Override // com.google.android.gms.common.util.d
                            public final void accept(Object obj, Object obj2) {
                                zVarK.a((String) obj, (com.google.firebase.remoteconfig.internal.h) obj2);
                            }
                        });
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                return d(this.f124440d, str, this.f124441e, this.f124442f, this.f124439c, gVarF, gVarF2, gVarF3, h(str, gVarF, uVarN), pVarJ, uVarN, m(gVarF2, gVarF3));
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    r g() {
        return e(f124433p);
    }

    @l1
    synchronized com.google.firebase.remoteconfig.internal.n h(String str, com.google.firebase.remoteconfig.internal.g gVar, com.google.firebase.remoteconfig.internal.u uVar) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new com.google.firebase.remoteconfig.internal.n(this.f124441e, p(this.f124440d) ? this.f124443g : new z8.b() { // from class: com.google.firebase.remoteconfig.c0
            @Override // z8.b
            public final Object get() {
                return d0.b();
            }
        }, this.f124439c, f124434q, f124435r, gVar, i(this.f124440d.s().i(), str, uVar), uVar, this.f124445i);
    }

    @l1
    ConfigFetchHttpClient i(String str, String str2, com.google.firebase.remoteconfig.internal.u uVar) {
        return new ConfigFetchHttpClient(this.f124438b, this.f124440d.s().j(), str, str2, uVar.d(), uVar.d());
    }

    synchronized com.google.firebase.remoteconfig.internal.q l(com.google.firebase.h hVar, com.google.firebase.installations.k kVar, com.google.firebase.remoteconfig.internal.n nVar, com.google.firebase.remoteconfig.internal.g gVar, Context context, String str, com.google.firebase.remoteconfig.internal.u uVar) {
        return new com.google.firebase.remoteconfig.internal.q(hVar, kVar, nVar, gVar, context, str, uVar, this.f124439c);
    }

    @l1
    public synchronized void r(Map<String, String> map) {
        try {
            this.f124445i = map;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    protected d0(Context context, ScheduledExecutorService scheduledExecutorService, com.google.firebase.h hVar, com.google.firebase.installations.k kVar, com.google.firebase.abt.d dVar, z8.b<com.google.firebase.analytics.connector.a> bVar, boolean z10) {
        this.f124437a = new HashMap();
        this.f124445i = new HashMap();
        this.f124438b = context;
        this.f124439c = scheduledExecutorService;
        this.f124440d = hVar;
        this.f124441e = kVar;
        this.f124442f = dVar;
        this.f124443g = bVar;
        this.f124444h = hVar.s().j();
        a.c(context);
        if (z10) {
            com.google.android.gms.tasks.n.d(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.b0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f124426a.g();
                }
            });
        }
    }
}

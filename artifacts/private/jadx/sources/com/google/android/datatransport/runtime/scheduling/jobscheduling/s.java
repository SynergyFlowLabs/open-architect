package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.b1;
import androidx.annotation.l1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f103677j = "Uploader";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f103678k = "GDT_CLIENT_METRICS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f103679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.e f103680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f103681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f103682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f103683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b6.b f103684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.c f103687i;

    @ij.a
    public s(Context context, com.google.android.datatransport.runtime.backends.e eVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, y yVar, Executor executor, b6.b bVar, @com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.persistence.c cVar) {
        this.f103679a = context;
        this.f103680b = eVar;
        this.f103681c = dVar;
        this.f103682d = yVar;
        this.f103683e = executor;
        this.f103684f = bVar;
        this.f103685g = aVar;
        this.f103686h = aVar2;
        this.f103687i = cVar;
    }

    public static /* synthetic */ Object b(s sVar, Iterable iterable, com.google.android.datatransport.runtime.r rVar, long j10) {
        sVar.f103681c.Rb(iterable);
        sVar.f103681c.v2(rVar, sVar.f103685g.V() + j10);
        int i10 = 3 << 0;
        return null;
    }

    public static /* synthetic */ Object c(s sVar) {
        sVar.f103687i.a();
        return null;
    }

    public static /* synthetic */ Object e(s sVar, Iterable iterable) {
        sVar.f103681c.Q8(iterable);
        return null;
    }

    public static /* synthetic */ Object f(s sVar, com.google.android.datatransport.runtime.r rVar, int i10) {
        sVar.f103682d.b(rVar, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(s sVar, com.google.android.datatransport.runtime.r rVar, long j10) {
        sVar.f103681c.v2(rVar, sVar.f103685g.V() + j10);
        return null;
    }

    public static /* synthetic */ Object h(s sVar, Map map) {
        sVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            sVar.f103687i.d(((Integer) entry.getValue()).intValue(), com.google.android.datatransport.runtime.firebase.transport.c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final s sVar, final com.google.android.datatransport.runtime.r rVar, final int i10, Runnable runnable) {
        sVar.getClass();
        try {
            b6.b bVar = sVar.f103684f;
            final com.google.android.datatransport.runtime.scheduling.persistence.d dVar = sVar.f103681c;
            Objects.requireNonNull(dVar);
            bVar.b(new b6.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
                @Override // b6.b.a
                public final Object execute() {
                    return Integer.valueOf(dVar.p0());
                }
            });
            if (sVar.k()) {
                sVar.l(rVar, i10);
            } else {
                sVar.f103684f.b(new b6.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.j
                    @Override // b6.b.a
                    public final Object execute() {
                        return s.f(this.f103656a, rVar, i10);
                    }
                });
            }
        } catch (b6.a unused) {
            sVar.f103682d.b(rVar, i10 + 1);
        } finally {
            runnable.run();
        }
    }

    @l1
    public com.google.android.datatransport.runtime.j j(com.google.android.datatransport.runtime.backends.n nVar) {
        b6.b bVar = this.f103684f;
        final com.google.android.datatransport.runtime.scheduling.persistence.c cVar = this.f103687i;
        Objects.requireNonNull(cVar);
        return nVar.a(com.google.android.datatransport.runtime.j.a().i(this.f103685g.V()).o(this.f103686h.V()).n(f103678k).h(new com.google.android.datatransport.runtime.i(com.google.android.datatransport.e.b("proto"), ((com.google.android.datatransport.runtime.firebase.transport.a) bVar.b(new b6.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.l
            @Override // b6.b.a
            public final Object execute() {
                return cVar.c();
            }
        })).i())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f103679a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @z7.a
    @b1({b1.a.LIBRARY_GROUP})
    public com.google.android.datatransport.runtime.backends.h l(final com.google.android.datatransport.runtime.r rVar, int i10) {
        com.google.android.datatransport.runtime.backends.h hVarB;
        com.google.android.datatransport.runtime.backends.n nVar = this.f103680b.get(rVar.b());
        com.google.android.datatransport.runtime.backends.h hVarE = com.google.android.datatransport.runtime.backends.h.e(0L);
        final long j10 = 0;
        while (((Boolean) this.f103684f.b(new b6.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.m
            @Override // b6.b.a
            public final Object execute() {
                return Boolean.valueOf(this.f103664a.f103681c.Lb(rVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f103684f.b(new b6.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.n
                @Override // b6.b.a
                public final Object execute() {
                    return this.f103666a.f103681c.wc(rVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return hVarE;
            }
            if (nVar == null) {
                z5.a.c(f103677j, "Unknown backend for %s, deleting event batch for it...", rVar);
                hVarB = com.google.android.datatransport.runtime.backends.h.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.google.android.datatransport.runtime.scheduling.persistence.k) it.next()).b());
                }
                if (rVar.e()) {
                    arrayList.add(this.j(nVar));
                }
                hVarB = nVar.b(com.google.android.datatransport.runtime.backends.g.a().b(arrayList).c(rVar.c()).a());
            }
            hVarE = hVarB;
            if (hVarE.c() == com.google.android.datatransport.runtime.backends.h.a.TRANSIENT_ERROR) {
                final s sVar = this;
                final com.google.android.datatransport.runtime.r rVar2 = rVar;
                this.f103684f.b(new b6.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.o
                    @Override // b6.b.a
                    public final Object execute() {
                        return s.b(this.f103668a, iterable, rVar2, j10);
                    }
                });
                sVar.f103682d.a(rVar2, i10 + 1, true);
                return hVarE;
            }
            final s sVar2 = this;
            com.google.android.datatransport.runtime.r rVar3 = rVar;
            sVar2.f103684f.b(new b6.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.p
                @Override // b6.b.a
                public final Object execute() {
                    return s.e(this.f103672a, iterable);
                }
            });
            if (hVarE.c() == com.google.android.datatransport.runtime.backends.h.a.OK) {
                long jMax = Math.max(j10, hVarE.b());
                if (rVar3.e()) {
                    sVar2.f103684f.b(new b6.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.q
                        @Override // b6.b.a
                        public final Object execute() {
                            return s.c(this.f103674a);
                        }
                    });
                }
                j10 = jMax;
            } else if (hVarE.c() == com.google.android.datatransport.runtime.backends.h.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strP = ((com.google.android.datatransport.runtime.scheduling.persistence.k) it2.next()).b().p();
                    if (map.containsKey(strP)) {
                        map.put(strP, Integer.valueOf(((Integer) map.get(strP)).intValue() + 1));
                    } else {
                        map.put(strP, 1);
                    }
                }
                sVar2.f103684f.b(new b6.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.r
                    @Override // b6.b.a
                    public final Object execute() {
                        return s.h(this.f103675a, map);
                    }
                });
            }
            this = sVar2;
            rVar = rVar3;
        }
        final s sVar3 = this;
        final com.google.android.datatransport.runtime.r rVar4 = rVar;
        sVar3.f103684f.b(new b6.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
            @Override // b6.b.a
            public final Object execute() {
                return s.g(this.f103653a, rVar4, j10);
            }
        });
        return hVarE;
    }

    public void m(final com.google.android.datatransport.runtime.r rVar, final int i10, final Runnable runnable) {
        this.f103683e.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.k
            @Override // java.lang.Runnable
            public final void run() {
                s.i(this.f103659a, rVar, i10, runnable);
            }
        });
    }
}

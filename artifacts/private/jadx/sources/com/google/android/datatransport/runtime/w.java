package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.l1;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
@ij.f
public class w implements v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile x f103815e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.e f103818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.s f103819d;

    @ij.a
    w(@com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.s sVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.w wVar) {
        this.f103816a = aVar;
        this.f103817b = aVar2;
        this.f103818c = eVar;
        this.f103819d = sVar;
        wVar.c();
    }

    private j b(q qVar) {
        j.a aVarG = j.a().i(this.f103816a.V()).o(this.f103817b.V()).n(qVar.g()).h(new i(qVar.b(), qVar.d())).g(qVar.c().a());
        if (qVar.c().e() != null && qVar.c().e().a() != null) {
            aVarG.l(qVar.c().e().a());
        }
        if (qVar.c().b() != null) {
            com.google.android.datatransport.g gVarB = qVar.c().b();
            if (gVarB.d() != null) {
                aVarG.m(gVarB.d());
            }
            if (gVarB.b() != null) {
                aVarG.j(gVarB.b());
            }
            if (gVarB.c() != null) {
                aVarG.k(gVarB.c());
            }
        }
        return aVarG.d();
    }

    public static w c() {
        x xVar = f103815e;
        if (xVar != null) {
            return xVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<com.google.android.datatransport.e> d(g gVar) {
        return gVar instanceof h ? Collections.unmodifiableSet(((h) gVar).a()) : Collections.singleton(com.google.android.datatransport.e.b("proto"));
    }

    public static void f(Context context) {
        if (f103815e == null) {
            synchronized (w.class) {
                try {
                    if (f103815e == null) {
                        f103815e = f.a().a(context).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @l1
    @b1({b1.a.TESTS})
    static void i(x xVar, Callable<Void> callable) throws Throwable {
        x xVar2;
        synchronized (w.class) {
            xVar2 = f103815e;
            f103815e = xVar;
        }
        try {
            callable.call();
            synchronized (w.class) {
                try {
                    f103815e = xVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            synchronized (w.class) {
                try {
                    f103815e = xVar2;
                    throw th3;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.v
    public void a(q qVar, com.google.android.datatransport.n nVar) {
        this.f103818c.a(qVar.f().f(qVar.c().d()), b(qVar), nVar);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.s e() {
        return this.f103819d;
    }

    public com.google.android.datatransport.m g(g gVar) {
        return new s(d(gVar), r.a().b(gVar.getName()).c(gVar.getExtras()).a(), this);
    }

    @Deprecated
    public com.google.android.datatransport.m h(String str) {
        return new s(d(null), r.a().b(str).a(), this);
    }
}

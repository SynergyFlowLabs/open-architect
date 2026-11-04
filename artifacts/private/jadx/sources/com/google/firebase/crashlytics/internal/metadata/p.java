package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.compose.animation.core.z1;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f121326h = "user-data";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f121327i = "keys";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f121328j = "internal-keys";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f121329k = "rollouts-state";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l1
    public static final int f121330l = 64;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l1
    public static final int f121331m = 1024;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @l1
    public static final int f121332n = 8192;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @l1
    public static final int f121333o = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f121334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.concurrency.n f121335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f121336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f121337d = new a(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f121338e = new a(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f121339f = new k(128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference<String> f121340g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference<e> f121341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference<Runnable> f121342b = new AtomicReference<>(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f121343c;

        public a(boolean z10) {
            this.f121343c = z10;
            this.f121341a = new AtomicMarkableReference<>(new e(64, z10 ? 8192 : 1024), false);
        }

        public static /* synthetic */ void a(a aVar) throws Throwable {
            aVar.f121342b.set(null);
            aVar.d();
        }

        private void c() {
            Runnable runnable = new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.o
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    p.a.a(this.f121325a);
                }
            };
            if (z1.a(this.f121342b, null, runnable)) {
                p.this.f121335b.f121234b.j(runnable);
            }
        }

        private void d() throws Throwable {
            Map<String, String> mapA;
            synchronized (this) {
                try {
                    if (this.f121341a.isMarked()) {
                        mapA = this.f121341a.getReference().a();
                        AtomicMarkableReference<e> atomicMarkableReference = this.f121341a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (mapA != null) {
                p.this.f121334a.s(p.this.f121336c, mapA, this.f121343c);
            }
        }

        public Map<String, String> b() {
            return this.f121341a.getReference().a();
        }

        public boolean e(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.f121341a.getReference().d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<e> atomicMarkableReference = this.f121341a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    c();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void f(Map<String, String> map) {
            synchronized (this) {
                try {
                    this.f121341a.getReference().e(map);
                    AtomicMarkableReference<e> atomicMarkableReference = this.f121341a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c();
        }
    }

    public p(String str, com.google.firebase.crashlytics.internal.persistence.g gVar, com.google.firebase.crashlytics.internal.concurrency.n nVar) {
        this.f121336c = str;
        this.f121334a = new g(gVar);
        this.f121335b = nVar;
    }

    public static /* synthetic */ void c(p pVar, String str, Map map, List list) throws Throwable {
        if (pVar.k() != null) {
            pVar.f121334a.u(str, pVar.k());
        }
        if (!map.isEmpty()) {
            pVar.f121334a.r(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        pVar.f121334a.t(str, list);
    }

    public static p l(String str, com.google.firebase.crashlytics.internal.persistence.g gVar, com.google.firebase.crashlytics.internal.concurrency.n nVar) {
        g gVar2 = new g(gVar);
        p pVar = new p(str, gVar, nVar);
        pVar.f121337d.f121341a.getReference().e(gVar2.j(str, false));
        pVar.f121338e.f121341a.getReference().e(gVar2.j(str, true));
        pVar.f121340g.set(gVar2.l(str), false);
        pVar.f121339f.c(gVar2.k(str));
        return pVar;
    }

    @p0
    public static String m(String str, com.google.firebase.crashlytics.internal.persistence.g gVar) {
        return new g(gVar).l(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() throws Throwable {
        boolean z10;
        String strK;
        synchronized (this.f121340g) {
            try {
                z10 = false;
                if (this.f121340g.isMarked()) {
                    strK = k();
                    this.f121340g.set(strK, false);
                    z10 = true;
                } else {
                    strK = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f121334a.u(this.f121336c, strK);
        }
    }

    public Map<String, String> g() {
        return this.f121337d.b();
    }

    public Map<String, String> h(Map<String, String> map) {
        if (map.isEmpty()) {
            return this.f121337d.b();
        }
        HashMap map2 = new HashMap(this.f121337d.b());
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strC = e.c(entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strC)) {
                map2.put(strC, e.c(entry.getValue(), 1024));
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            com.google.firebase.crashlytics.internal.g.f().m("Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map<String, String> i() {
        return this.f121338e.b();
    }

    public List<f0.f.d.e> j() {
        return this.f121339f.a();
    }

    @p0
    public String k() {
        return this.f121340g.getReference();
    }

    public boolean o(String str, String str2) {
        return this.f121337d.e(str, str2);
    }

    public void p(Map<String, String> map) {
        this.f121337d.f(map);
    }

    public boolean q(String str, String str2) {
        return this.f121338e.e(str, str2);
    }

    public void r(final String str) {
        synchronized (this.f121336c) {
            try {
                this.f121336c = str;
                final Map<String, String> mapB = this.f121337d.b();
                final List<j> listB = this.f121339f.b();
                this.f121335b.f121234b.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.m
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        p.c(this.f121320a, str, mapB, listB);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s(String str) {
        String strC = e.c(str, 1024);
        synchronized (this.f121340g) {
            try {
                if (com.google.firebase.crashlytics.internal.common.i.B(strC, this.f121340g.getReference())) {
                    return;
                }
                this.f121340g.set(strC, true);
                this.f121335b.f121234b.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.n
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f121324a.n();
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @z7.a
    public boolean t(List<j> list) {
        synchronized (this.f121339f) {
            try {
                if (!this.f121339f.c(list)) {
                    return false;
                }
                final List<j> listB = this.f121339f.b();
                this.f121335b.f121234b.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.l
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        p pVar = this.f121318a;
                        pVar.f121334a.t(pVar.f121336c, listB);
                    }
                });
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

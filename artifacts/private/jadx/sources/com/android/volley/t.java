package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f89493l = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f89494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<s<?>> f89495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<s<?>> f89496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<s<?>> f89497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f89498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f89499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f89500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m[] f89501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f89502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<e> f89503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<c> f89504k;

    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f89505a;

        a(Object obj) {
            this.f89505a = obj;
        }

        @Override // com.android.volley.t.d
        public boolean a(s<?> sVar) {
            return sVar.getTag() == this.f89505a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final int K0 = 0;
        public static final int L0 = 1;
        public static final int M0 = 2;
        public static final int N0 = 3;
        public static final int O0 = 4;
        public static final int P0 = 5;
    }

    public interface c {
        void a(s<?> sVar, int i10);
    }

    public interface d {
        boolean a(s<?> sVar);
    }

    @Deprecated
    public interface e<T> {
        void a(s<T> sVar);
    }

    public t(f fVar, l lVar, int i10, w wVar) {
        this.f89494a = new AtomicInteger();
        this.f89495b = new HashSet();
        this.f89496c = new PriorityBlockingQueue<>();
        this.f89497d = new PriorityBlockingQueue<>();
        this.f89503j = new ArrayList();
        this.f89504k = new ArrayList();
        this.f89498e = fVar;
        this.f89499f = lVar;
        this.f89501h = new m[i10];
        this.f89500g = wVar;
    }

    public <T> s<T> a(s<T> sVar) {
        sVar.setRequestQueue(this);
        synchronized (this.f89495b) {
            try {
                this.f89495b.add(sVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        sVar.setSequence(j());
        sVar.addMarker("add-to-queue");
        m(sVar, 0);
        d(sVar);
        return sVar;
    }

    public void b(c cVar) {
        synchronized (this.f89504k) {
            this.f89504k.add(cVar);
        }
    }

    @Deprecated
    public <T> void c(e<T> eVar) {
        synchronized (this.f89503j) {
            this.f89503j.add(eVar);
        }
    }

    <T> void d(s<T> sVar) {
        if (sVar.shouldCache()) {
            this.f89496c.add(sVar);
        } else {
            n(sVar);
        }
    }

    public void e(d dVar) {
        synchronized (this.f89495b) {
            try {
                for (s<?> sVar : this.f89495b) {
                    if (dVar.a(sVar)) {
                        sVar.cancel();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        e(new a(obj));
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1104)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1058)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    <T> void g(s<T> sVar) {
        synchronized (this.f89495b) {
            this.f89495b.remove(sVar);
        }
        synchronized (this.f89503j) {
            try {
                Iterator<e> it = this.f89503j.iterator();
                while (it.hasNext()) {
                    it.next().a(sVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m(sVar, 5);
    }

    public f h() {
        return this.f89498e;
    }

    public w i() {
        return this.f89500g;
    }

    public int j() {
        return this.f89494a.incrementAndGet();
    }

    public void k(c cVar) {
        synchronized (this.f89504k) {
            try {
                this.f89504k.remove(cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public <T> void l(e<T> eVar) {
        synchronized (this.f89503j) {
            this.f89503j.remove(eVar);
        }
    }

    void m(s<?> sVar, int i10) {
        synchronized (this.f89504k) {
            try {
                Iterator<c> it = this.f89504k.iterator();
                while (it.hasNext()) {
                    it.next().a(sVar, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    <T> void n(s<T> sVar) {
        this.f89497d.add(sVar);
    }

    public void o() {
        p();
        g gVar = new g(this.f89496c, this.f89497d, this.f89498e, this.f89500g);
        this.f89502i = gVar;
        gVar.start();
        for (int i10 = 0; i10 < this.f89501h.length; i10++) {
            m mVar = new m(this.f89497d, this.f89499f, this.f89498e, this.f89500g);
            this.f89501h[i10] = mVar;
            mVar.start();
        }
    }

    public void p() {
        g gVar = this.f89502i;
        if (gVar != null) {
            gVar.d();
        }
        for (m mVar : this.f89501h) {
            if (mVar != null) {
                mVar.e();
            }
        }
    }

    public t(f fVar, l lVar, int i10) {
        this(fVar, lVar, i10, new j(new Handler(Looper.getMainLooper())));
    }

    public t(f fVar, l lVar) {
        this(fVar, lVar, 4);
    }
}

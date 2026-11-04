package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.m;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class j<R> implements d, o, i {
    private static final String D = "Request";
    private static final String E = "Glide";
    private static final boolean F = Log.isLoggable("Request", 2);

    @b0("requestLock")
    private int A;

    @b0("requestLock")
    private boolean B;

    @p0
    private RuntimeException C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final String f97325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f97326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f97327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final g<R> f97328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f97329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f97330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.d f97331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private final Object f97332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class<R> f97333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.request.a<?> f97334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f97335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f97336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.bumptech.glide.h f97337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p<R> f97338n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private final List<g<R>> f97339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.bumptech.glide.request.transition.g<? super R> f97340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Executor f97341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @b0("requestLock")
    private v<R> f97342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @b0("requestLock")
    private com.bumptech.glide.load.engine.k.d f97343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @b0("requestLock")
    private long f97344t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.k f97345u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @b0("requestLock")
    private a f97346v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @b0("requestLock")
    @p0
    private Drawable f97347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @b0("requestLock")
    @p0
    private Drawable f97348x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @b0("requestLock")
    @p0
    private Drawable f97349y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @b0("requestLock")
    private int f97350z;

    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private j(Context context, com.bumptech.glide.d dVar, @NonNull Object obj, @p0 Object obj2, Class<R> cls, com.bumptech.glide.request.a<?> aVar, int i10, int i11, com.bumptech.glide.h hVar, p<R> pVar, @p0 g<R> gVar, @p0 List<g<R>> list, e eVar, com.bumptech.glide.load.engine.k kVar, com.bumptech.glide.request.transition.g<? super R> gVar2, Executor executor) {
        this.f97325a = F ? String.valueOf(super.hashCode()) : null;
        this.f97326b = com.bumptech.glide.util.pool.c.a();
        this.f97327c = obj;
        this.f97330f = context;
        this.f97331g = dVar;
        this.f97332h = obj2;
        this.f97333i = cls;
        this.f97334j = aVar;
        this.f97335k = i10;
        this.f97336l = i11;
        this.f97337m = hVar;
        this.f97338n = pVar;
        this.f97328d = gVar;
        this.f97339o = list;
        this.f97329e = eVar;
        this.f97345u = kVar;
        this.f97340p = gVar2;
        this.f97341q = executor;
        this.f97346v = a.PENDING;
        if (this.C == null && dVar.i()) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    @b0("requestLock")
    private void h() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @b0("requestLock")
    private boolean i() {
        e eVar = this.f97329e;
        if (eVar != null && !eVar.h(this)) {
            return false;
        }
        return true;
    }

    @b0("requestLock")
    private boolean j() {
        e eVar = this.f97329e;
        return eVar == null || eVar.c(this);
    }

    @b0("requestLock")
    private boolean k() {
        e eVar = this.f97329e;
        return eVar == null || eVar.d(this);
    }

    @b0("requestLock")
    private void l() {
        h();
        this.f97326b.c();
        this.f97338n.d(this);
        com.bumptech.glide.load.engine.k.d dVar = this.f97343s;
        if (dVar != null) {
            dVar.a();
            this.f97343s = null;
        }
    }

    @b0("requestLock")
    private Drawable m() {
        if (this.f97347w == null) {
            Drawable drawableI = this.f97334j.I();
            this.f97347w = drawableI;
            if (drawableI == null && this.f97334j.H() > 0) {
                this.f97347w = q(this.f97334j.H());
            }
        }
        return this.f97347w;
    }

    @b0("requestLock")
    private Drawable n() {
        if (this.f97349y == null) {
            Drawable drawableJ = this.f97334j.J();
            this.f97349y = drawableJ;
            if (drawableJ == null && this.f97334j.K() > 0) {
                this.f97349y = q(this.f97334j.K());
            }
        }
        return this.f97349y;
    }

    @b0("requestLock")
    private Drawable o() {
        if (this.f97348x == null) {
            Drawable drawableP = this.f97334j.P();
            this.f97348x = drawableP;
            if (drawableP == null && this.f97334j.Q() > 0) {
                this.f97348x = q(this.f97334j.Q());
            }
        }
        return this.f97348x;
    }

    @b0("requestLock")
    private boolean p() {
        e eVar = this.f97329e;
        return eVar == null || !eVar.getRoot().a();
    }

    @b0("requestLock")
    private Drawable q(@androidx.annotation.v int i10) {
        return com.bumptech.glide.load.resource.drawable.a.a(this.f97331g, i10, this.f97334j.W() != null ? this.f97334j.W() : this.f97330f.getTheme());
    }

    private void r(String str) {
    }

    private static int t(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    @b0("requestLock")
    private void u() {
        e eVar = this.f97329e;
        if (eVar != null) {
            eVar.e(this);
        }
    }

    @b0("requestLock")
    private void v() {
        e eVar = this.f97329e;
        if (eVar != null) {
            eVar.b(this);
        }
    }

    public static <R> j<R> w(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, com.bumptech.glide.request.a<?> aVar, int i10, int i11, com.bumptech.glide.h hVar, p<R> pVar, g<R> gVar, @p0 List<g<R>> list, e eVar, com.bumptech.glide.load.engine.k kVar, com.bumptech.glide.request.transition.g<? super R> gVar2, Executor executor) {
        return new j<>(context, dVar, obj, obj2, cls, aVar, i10, i11, hVar, pVar, gVar, list, eVar, kVar, gVar2, executor);
    }

    private void x(q qVar, int i10) {
        boolean zC;
        this.f97326b.c();
        synchronized (this.f97327c) {
            try {
                qVar.l(this.C);
                int iG = this.f97331g.g();
                if (iG <= i10) {
                    Objects.toString(this.f97332h);
                    if (iG <= 4) {
                        qVar.h(E);
                    }
                }
                this.f97343s = null;
                this.f97346v = a.FAILED;
                boolean z10 = true;
                this.B = true;
                try {
                    List<g<R>> list = this.f97339o;
                    if (list != null) {
                        Iterator<g<R>> it = list.iterator();
                        zC = false;
                        while (it.hasNext()) {
                            zC |= it.next().c(qVar, this.f97332h, this.f97338n, p());
                        }
                    } else {
                        zC = false;
                    }
                    g<R> gVar = this.f97328d;
                    if (gVar == null || !gVar.c(qVar, this.f97332h, this.f97338n, p())) {
                        z10 = false;
                    }
                    if (!(zC | z10)) {
                        z();
                    }
                    this.B = false;
                    u();
                } catch (Throwable th2) {
                    this.B = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @b0("requestLock")
    private void y(v<R> vVar, R r10, com.bumptech.glide.load.a aVar) {
        boolean zE;
        boolean zP = p();
        this.f97346v = a.COMPLETE;
        this.f97342r = vVar;
        if (this.f97331g.g() <= 3) {
            r10.getClass();
            Objects.toString(aVar);
            Objects.toString(this.f97332h);
            com.bumptech.glide.util.g.a(this.f97344t);
        }
        boolean z10 = true;
        this.B = true;
        try {
            List<g<R>> list = this.f97339o;
            if (list != null) {
                Iterator<g<R>> it = list.iterator();
                zE = false;
                while (it.hasNext()) {
                    R r11 = r10;
                    com.bumptech.glide.load.a aVar2 = aVar;
                    zE |= it.next().e(r11, this.f97332h, this.f97338n, aVar2, zP);
                    r10 = r11;
                    aVar = aVar2;
                }
            } else {
                zE = false;
            }
            R r12 = r10;
            com.bumptech.glide.load.a aVar3 = aVar;
            g<R> gVar = this.f97328d;
            if (gVar == null || !gVar.e(r12, this.f97332h, this.f97338n, aVar3, zP)) {
                z10 = false;
            }
            if (!(z10 | zE)) {
                this.f97338n.i(r12, this.f97340p.a(aVar3, zP));
            }
            this.B = false;
            v();
        } catch (Throwable th2) {
            this.B = false;
            throw th2;
        }
    }

    @b0("requestLock")
    private void z() {
        if (j()) {
            Drawable drawableN = this.f97332h == null ? n() : null;
            if (drawableN == null) {
                drawableN = m();
            }
            if (drawableN == null) {
                drawableN = o();
            }
            this.f97338n.q(drawableN);
        }
    }

    @Override // com.bumptech.glide.request.d
    public boolean a() {
        boolean z10;
        synchronized (this.f97327c) {
            try {
                z10 = this.f97346v == a.COMPLETE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.i
    public void b(q qVar) {
        x(qVar, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.i
    public void c(v<?> vVar, com.bumptech.glide.load.a aVar) {
        this.f97326b.c();
        v<?> vVar2 = null;
        try {
            synchronized (this.f97327c) {
                try {
                    this.f97343s = null;
                    if (vVar == null) {
                        b(new q("Expected to receive a Resource<R> with an object of " + this.f97333i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj == null || !this.f97333i.isAssignableFrom(obj.getClass())) {
                            this.f97342r = null;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Expected to receive an object of ");
                            sb2.append(this.f97333i);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(vVar);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            b(new q(sb2.toString()));
                        } else if (k()) {
                            y(vVar, obj, aVar);
                            return;
                        } else {
                            this.f97342r = null;
                            this.f97346v = a.COMPLETE;
                        }
                        this.f97345u.l(vVar);
                    } catch (Throwable th2) {
                        vVar2 = vVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (vVar2 != null) {
                this.f97345u.l(vVar2);
            }
            throw th4;
        }
    }

    @Override // com.bumptech.glide.request.d
    public void clear() {
        synchronized (this.f97327c) {
            try {
                h();
                this.f97326b.c();
                a aVar = this.f97346v;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                l();
                v<R> vVar = this.f97342r;
                if (vVar != null) {
                    this.f97342r = null;
                } else {
                    vVar = null;
                }
                if (i()) {
                    this.f97338n.h(o());
                }
                this.f97346v = aVar2;
                if (vVar != null) {
                    this.f97345u.l(vVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.target.o
    public void d(int i10, int i11) {
        this.f97326b.c();
        synchronized (this.f97327c) {
            try {
                boolean z10 = F;
                if (z10) {
                    r("Got onSizeReady in " + com.bumptech.glide.util.g.a(this.f97344t));
                }
                if (this.f97346v != a.WAITING_FOR_SIZE) {
                    return;
                }
                a aVar = a.RUNNING;
                this.f97346v = aVar;
                float fV = this.f97334j.V();
                this.f97350z = t(i10, fV);
                this.A = t(i11, fV);
                if (z10) {
                    r("finished setup for calling load in " + com.bumptech.glide.util.g.a(this.f97344t));
                }
                this.f97343s = this.f97345u.g(this.f97331g, this.f97332h, this.f97334j.U(), this.f97350z, this.A, this.f97334j.T(), this.f97333i, this.f97337m, this.f97334j.G(), this.f97334j.X(), this.f97334j.k0(), this.f97334j.f0(), this.f97334j.M(), this.f97334j.d0(), this.f97334j.Z(), this.f97334j.Y(), this.f97334j.L(), this, this.f97341q);
                if (this.f97346v != aVar) {
                    this.f97343s = null;
                }
                if (z10) {
                    r("finished onSizeReady in " + com.bumptech.glide.util.g.a(this.f97344t));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.i
    public Object e() {
        this.f97326b.c();
        return this.f97327c;
    }

    @Override // com.bumptech.glide.request.d
    public boolean f() {
        boolean z10;
        synchronized (this.f97327c) {
            z10 = this.f97346v == a.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean g(d dVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        com.bumptech.glide.request.a<?> aVar;
        com.bumptech.glide.h hVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        com.bumptech.glide.request.a<?> aVar2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (!(dVar instanceof j)) {
            return false;
        }
        synchronized (this.f97327c) {
            try {
                i10 = this.f97335k;
                i11 = this.f97336l;
                obj = this.f97332h;
                cls = this.f97333i;
                aVar = this.f97334j;
                hVar = this.f97337m;
                List<g<R>> list = this.f97339o;
                size = list != null ? list.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j jVar = (j) dVar;
        synchronized (jVar.f97327c) {
            try {
                i12 = jVar.f97335k;
                i13 = jVar.f97336l;
                obj2 = jVar.f97332h;
                cls2 = jVar.f97333i;
                aVar2 = jVar.f97334j;
                hVar2 = jVar.f97337m;
                List<g<R>> list2 = jVar.f97339o;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return i10 == i12 && i11 == i13 && m.c(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && hVar == hVar2 && size == size2;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f97327c) {
            try {
                z10 = this.f97346v == a.COMPLETE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f97327c) {
            try {
                a aVar = this.f97346v;
                z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public void pause() {
        synchronized (this.f97327c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public void s() {
        synchronized (this.f97327c) {
            try {
                h();
                this.f97326b.c();
                this.f97344t = com.bumptech.glide.util.g.b();
                if (this.f97332h == null) {
                    if (m.v(this.f97335k, this.f97336l)) {
                        this.f97350z = this.f97335k;
                        this.A = this.f97336l;
                    }
                    x(new q("Received null model"), n() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f97346v;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    c(this.f97342r, com.bumptech.glide.load.a.MEMORY_CACHE);
                    return;
                }
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f97346v = aVar3;
                if (m.v(this.f97335k, this.f97336l)) {
                    d(this.f97335k, this.f97336l);
                } else {
                    this.f97338n.s(this);
                }
                a aVar4 = this.f97346v;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && j()) {
                    this.f97338n.n(o());
                }
                if (F) {
                    r("finished run method in " + com.bumptech.glide.util.g.a(this.f97344t));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

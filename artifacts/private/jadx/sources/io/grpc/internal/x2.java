package io.grpc.internal;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class x2 extends io.grpc.j2<x2> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Logger f290109u = Logger.getLogger(x2.class.getName());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final z1<? extends Executor> f290110v = g3.c(v0.K);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final io.grpc.o0 f290111w = new c();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final io.grpc.a0 f290112x = io.grpc.a0.c();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final io.grpc.t f290113y = io.grpc.t.a();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f290114z = TimeUnit.SECONDS.toMillis(120);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f290119e;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @fj.h
    io.grpc.b f290131q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @fj.h
    io.grpc.l2 f290134t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c1.b f290115a = new c1.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List<io.grpc.v2> f290116b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<io.grpc.o2> f290117c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<io.grpc.u2.a> f290118d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    io.grpc.o0 f290120f = f290111w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    z1<? extends Executor> f290121g = f290110v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    io.grpc.a0 f290122h = f290112x;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    io.grpc.t f290123i = f290113y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f290124j = f290114z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    io.grpc.y.c f290125k = io.grpc.y.k();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f290126l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f290127m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f290128n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f290129o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f290130p = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    io.grpc.v0 f290132r = io.grpc.v0.w();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    o.b f290133s = o.a();

    public interface b {
        d1 a(List<? extends io.grpc.u2.a> list);
    }

    private static final class c extends io.grpc.o0 {
        private c() {
        }

        @Override // io.grpc.o0
        public List<io.grpc.t2> a() {
            return Collections.EMPTY_LIST;
        }

        @Override // io.grpc.o0
        @fj.h
        public io.grpc.q2<?, ?> c(String str, @fj.h String str2) {
            return null;
        }
    }

    public x2(b bVar) {
        this.f290119e = (b) com.google.common.base.j0.F(bVar, "clientTransportServersBuilder");
    }

    @z7.e("ClientTransportServersBuilder is required, use a constructor")
    public static io.grpc.j2<?> m(int i10) {
        throw new UnsupportedOperationException("ClientTransportServersBuilder is required, use a constructor");
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public x2 a(io.grpc.c cVar) {
        return b(((io.grpc.c) com.google.common.base.j0.F(cVar, "bindableService")).a());
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public x2 b(io.grpc.t2 t2Var) {
        this.f290115a.a((io.grpc.t2) com.google.common.base.j0.F(t2Var, androidx.core.app.w.Q0));
        return this;
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public x2 d(io.grpc.u2.a aVar) {
        this.f290118d.add((io.grpc.u2.a) com.google.common.base.j0.F(aVar, "factory"));
        return this;
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public x2 e(io.grpc.v2 v2Var) {
        this.f290116b.add((io.grpc.v2) com.google.common.base.j0.F(v2Var, "filter"));
        return this;
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public x2 g(io.grpc.l2 l2Var) {
        this.f290134t = (io.grpc.l2) com.google.common.base.j0.E(l2Var);
        return this;
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public x2 h(@fj.h io.grpc.t tVar) {
        if (tVar == null) {
            tVar = f290113y;
        }
        this.f290123i = tVar;
        return this;
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public x2 i(@fj.h io.grpc.a0 a0Var) {
        if (a0Var == null) {
            a0Var = f290112x;
        }
        this.f290122h = a0Var;
        return this;
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public x2 j() {
        return k(com.google.common.util.concurrent.a2.c());
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public x2 k(@fj.h Executor executor) {
        this.f290121g = executor != null ? new k0<>(executor) : f290110v;
        return this;
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public x2 l(@fj.h io.grpc.o0 o0Var) {
        if (o0Var == null) {
            o0Var = f290111w;
        }
        this.f290120f = o0Var;
        return this;
    }

    public io.grpc.v0 M() {
        return this.f290132r;
    }

    public z1<? extends Executor> N() {
        return this.f290121g;
    }

    @com.google.common.annotations.e
    List<? extends io.grpc.u2.a> O() {
        boolean z10;
        io.grpc.u2.a aVar;
        ArrayList arrayList = new ArrayList();
        List<io.grpc.o2> listB = io.grpc.z0.b();
        List<io.grpc.u2.a> listC = io.grpc.z0.c();
        if (listB != null) {
            arrayList.addAll(listC);
            this.f290117c.addAll(listB);
            z10 = true;
        } else {
            z10 = false;
        }
        io.grpc.u2.a aVar2 = null;
        if (!z10 && this.f290126l) {
            try {
                Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
                Class cls2 = Boolean.TYPE;
                aVar = (io.grpc.u2.a) cls.getDeclaredMethod("getServerStreamTracerFactory", cls2, cls2, cls2).invoke(null, Boolean.valueOf(this.f290127m), Boolean.valueOf(this.f290128n), Boolean.valueOf(this.f290129o));
            } catch (ClassNotFoundException e10) {
                f290109u.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
                aVar = null;
            } catch (IllegalAccessException e11) {
                f290109u.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
                aVar = null;
            } catch (NoSuchMethodException e12) {
                f290109u.log(Level.FINE, "Unable to apply census stats", (Throwable) e12);
                aVar = null;
            } catch (InvocationTargetException e13) {
                f290109u.log(Level.FINE, "Unable to apply census stats", (Throwable) e13);
                aVar = null;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        if (!z10 && this.f290130p) {
            try {
                aVar2 = (io.grpc.u2.a) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getServerStreamTracerFactory", null).invoke(null, null);
            } catch (ClassNotFoundException e14) {
                f290109u.log(Level.FINE, "Unable to apply census stats", (Throwable) e14);
            } catch (IllegalAccessException e15) {
                f290109u.log(Level.FINE, "Unable to apply census stats", (Throwable) e15);
            } catch (NoSuchMethodException e16) {
                f290109u.log(Level.FINE, "Unable to apply census stats", (Throwable) e16);
            } catch (InvocationTargetException e17) {
                f290109u.log(Level.FINE, "Unable to apply census stats", (Throwable) e17);
            }
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        arrayList.addAll(this.f290118d);
        arrayList.trimToSize();
        return Collections.unmodifiableList(arrayList);
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public x2 n(long j10, TimeUnit timeUnit) {
        com.google.common.base.j0.p(j10 > 0, "handshake timeout is %s, but must be positive", j10);
        this.f290124j = ((TimeUnit) com.google.common.base.j0.F(timeUnit, "unit")).toMillis(j10);
        return this;
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public x2 o(io.grpc.o2 o2Var) {
        this.f290117c.add((io.grpc.o2) com.google.common.base.j0.F(o2Var, "interceptor"));
        return this;
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public x2 y(@fj.h io.grpc.b bVar) {
        this.f290131q = bVar;
        return this;
    }

    public void S(io.grpc.y.c cVar) {
        this.f290125k = (io.grpc.y.c) com.google.common.base.j0.F(cVar, "ticker");
    }

    public void T(boolean z10) {
        this.f290126l = z10;
    }

    public void U(boolean z10) {
        this.f290128n = z10;
    }

    public void V(boolean z10) {
        this.f290129o = z10;
    }

    public void W(boolean z10) {
        this.f290127m = z10;
    }

    public void X(boolean z10) {
        this.f290130p = z10;
    }

    @Override // io.grpc.j2
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public x2 A(File file, File file2) {
        throw new UnsupportedOperationException("TLS not supported in ServerImplBuilder");
    }

    @Override // io.grpc.j2
    public io.grpc.i2 f() {
        return new w2(this, this.f290119e.a(O()), io.grpc.w.f291348f);
    }
}

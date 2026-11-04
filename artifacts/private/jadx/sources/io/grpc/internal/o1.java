package io.grpc.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class o1 extends io.grpc.s1<o1> {
    private static final String K = "directaddress";
    private static final Logger L = Logger.getLogger(o1.class.getName());

    @com.google.common.annotations.e
    static final long M = 30;

    @com.google.common.annotations.e
    static final long N = TimeUnit.MINUTES.toMillis(M);
    static final long O = TimeUnit.SECONDS.toMillis(1);
    private static final z1<? extends Executor> P = g3.c(v0.K);
    private static final io.grpc.a0 Q = io.grpc.a0.c();
    private static final io.grpc.t R = io.grpc.t.a();
    private static final long S = 16777216;
    private static final long T = 1048576;
    private static final Method U;

    @fj.h
    io.grpc.g2 A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private final c I;
    private final b J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    z1<? extends Executor> f289640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    z1<? extends Executor> f289641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<io.grpc.l> f289642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    io.grpc.z1 f289643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<io.grpc.o> f289644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f289645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @fj.h
    final io.grpc.g f289646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @fj.h
    final io.grpc.d f289647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @fj.h
    private final SocketAddress f289648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @fj.h
    String f289649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @fj.h
    String f289650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f289651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f289652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    io.grpc.a0 f289653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    io.grpc.t f289654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    long f289655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f289656q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f289657r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    long f289658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f289659t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f289660u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    io.grpc.v0 f289661v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f289662w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @fj.h
    Map<String, ?> f289663x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f289664y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @fj.h
    io.grpc.b f289665z;

    public interface b {
        int a();
    }

    public interface c {
        v a();
    }

    private static class d extends io.grpc.y1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SocketAddress f289666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f289667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Collection<Class<? extends SocketAddress>> f289668c;

        class a extends io.grpc.x1 {
            a() {
            }

            @Override // io.grpc.x1
            public String a() {
                return d.this.f289667b;
            }

            @Override // io.grpc.x1
            public void c() {
            }

            @Override // io.grpc.x1
            public void d(io.grpc.x1.e eVar) {
                eVar.c(io.grpc.x1.g.d().b(Collections.singletonList(new io.grpc.d0(d.this.f289666a))).c(io.grpc.a.f288673c).a());
            }
        }

        d(SocketAddress socketAddress, String str) {
            this.f289666a = socketAddress;
            this.f289667b = str;
            this.f289668c = Collections.singleton(socketAddress.getClass());
        }

        @Override // io.grpc.x1.d
        public String a() {
            return o1.K;
        }

        @Override // io.grpc.x1.d
        public io.grpc.x1 b(URI uri, io.grpc.x1.b bVar) {
            return new a();
        }

        @Override // io.grpc.y1
        public Collection<Class<? extends SocketAddress>> c() {
            return this.f289668c;
        }

        @Override // io.grpc.y1
        protected boolean e() {
            return true;
        }

        @Override // io.grpc.y1
        protected int f() {
            return 5;
        }
    }

    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f289670a;

        public e(int i10) {
            this.f289670a = i10;
        }

        @Override // io.grpc.internal.o1.b
        public int a() {
            return this.f289670a;
        }
    }

    private static final class f implements b {
        private f() {
        }

        @Override // io.grpc.internal.o1.b
        public int a() {
            return 443;
        }
    }

    public static class g implements c {
        @Override // io.grpc.internal.o1.c
        public v a() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e10) {
            L.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
            declaredMethod = null;
        } catch (NoSuchMethodException e11) {
            L.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
            declaredMethod = null;
        }
        U = declaredMethod;
    }

    public o1(String str, c cVar, @fj.h b bVar) {
        this(str, null, null, cVar, bVar);
    }

    private static List<?> L(List<?> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj == null) {
                arrayList.add(null);
            } else if (obj instanceof Map) {
                arrayList.add(M((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(L((List) obj));
            } else if (obj instanceof String) {
                arrayList.add(obj);
            } else if (obj instanceof Double) {
                arrayList.add(obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("The entry '" + obj + "' is of type '" + obj.getClass() + "', which is not supported");
                }
                arrayList.add(obj);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @fj.h
    private static Map<String, ?> M(@fj.h Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            com.google.common.base.j0.u(entry.getKey() instanceof String, "The key of the entry '%s' is not of String type", entry);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                linkedHashMap.put(str, null);
            } else if (value instanceof Map) {
                linkedHashMap.put(str, M((Map) value));
            } else if (value instanceof List) {
                linkedHashMap.put(str, L((List) value));
            } else if (value instanceof String) {
                linkedHashMap.put(str, value);
            } else if (value instanceof Double) {
                linkedHashMap.put(str, value);
            } else {
                if (!(value instanceof Boolean)) {
                    throw new IllegalArgumentException("The value of the map entry '" + entry + "' is of type '" + value.getClass() + "', which is not supported");
                }
                linkedHashMap.put(str, value);
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    @com.google.common.annotations.e
    static String e0(SocketAddress socketAddress) {
        try {
            return new URI(K, "", "/" + socketAddress, null).toString();
        } catch (URISyntaxException e10) {
            throw new RuntimeException(e10);
        }
    }

    @z7.e("ClientTransportFactoryBuilder is required, use a constructor")
    public static io.grpc.s1<?> l(String str, int i10) {
        throw new UnsupportedOperationException("ClientTransportFactoryBuilder is required, use a constructor");
    }

    @z7.e("ClientTransportFactoryBuilder is required, use a constructor")
    public static io.grpc.s1<?> m(String str) {
        throw new UnsupportedOperationException("ClientTransportFactoryBuilder is required, use a constructor");
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public o1 a(io.grpc.o oVar) {
        this.f289644e.add((io.grpc.o) com.google.common.base.j0.F(oVar, "transport filter"));
        return this;
    }

    @com.google.common.annotations.e
    String K(String str) {
        return this.B ? str : v0.d(str);
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public o1 c(io.grpc.t tVar) {
        if (tVar != null) {
            this.f289654o = tVar;
            return this;
        }
        this.f289654o = R;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public o1 d(io.grpc.a0 a0Var) {
        if (a0Var != null) {
            this.f289653n = a0Var;
            return this;
        }
        this.f289653n = Q;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public o1 e(String str) {
        SocketAddress socketAddress = this.f289648i;
        com.google.common.base.j0.x0(socketAddress == null, "directServerAddress is set (%s), which forbids the use of load-balancing policy", socketAddress);
        com.google.common.base.j0.e(str != null, "policy cannot be null");
        this.f289651l = str;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public o1 f(@fj.h Map<String, ?> map) {
        this.f289663x = M(map);
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public o1 g() {
        return k(com.google.common.util.concurrent.a2.c());
    }

    public o1 S() {
        this.B = true;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public o1 h() {
        this.f289660u = false;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public o1 i() {
        this.f289664y = false;
        return this;
    }

    public o1 V() {
        this.B = false;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public o1 j() {
        this.f289660u = true;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public o1 k(Executor executor) {
        if (executor != null) {
            this.f289640a = new k0(executor);
            return this;
        }
        this.f289640a = P;
        return this;
    }

    int Y() {
        return this.J.a();
    }

    @com.google.common.annotations.e
    List<io.grpc.l> Z() {
        boolean z10;
        io.grpc.l lVar;
        ArrayList arrayList = new ArrayList(this.f289642c);
        List<io.grpc.l> listA = io.grpc.z0.a();
        if (listA != null) {
            arrayList.addAll(listA);
            z10 = true;
        } else {
            z10 = false;
        }
        io.grpc.l lVar2 = null;
        if (!z10 && this.C) {
            Method method = U;
            if (method != null) {
                try {
                    lVar = (io.grpc.l) method.invoke(null, Boolean.valueOf(this.D), Boolean.valueOf(this.E), Boolean.valueOf(this.F), Boolean.valueOf(this.G));
                } catch (IllegalAccessException e10) {
                    L.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
                    lVar = null;
                } catch (InvocationTargetException e11) {
                    L.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
                    lVar = null;
                }
            } else {
                lVar = null;
            }
            if (lVar != null) {
                arrayList.add(0, lVar);
            }
        }
        if (!z10 && this.H) {
            try {
                lVar2 = (io.grpc.l) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
            } catch (ClassNotFoundException e12) {
                L.log(Level.FINE, "Unable to apply census stats", (Throwable) e12);
            } catch (IllegalAccessException e13) {
                L.log(Level.FINE, "Unable to apply census stats", (Throwable) e13);
            } catch (NoSuchMethodException e14) {
                L.log(Level.FINE, "Unable to apply census stats", (Throwable) e14);
            } catch (InvocationTargetException e15) {
                L.log(Level.FINE, "Unable to apply census stats", (Throwable) e15);
            }
            if (lVar2 != null) {
                arrayList.add(0, lVar2);
            }
        }
        return arrayList;
    }

    public z1<? extends Executor> a0() {
        return this.f289641b;
    }

    @Override // io.grpc.s1
    public io.grpc.r1 b() {
        return new p1(new n1(this, this.I.a(), new h0.a(), g3.c(v0.K), v0.M, Z(), n3.f289633a));
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public o1 n(long j10, TimeUnit timeUnit) {
        com.google.common.base.j0.p(j10 > 0, "idle timeout is %s, but must be positive", j10);
        if (timeUnit.toDays(j10) >= M) {
            this.f289655p = -1L;
            return this;
        }
        this.f289655p = Math.max(timeUnit.toMillis(j10), O);
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public o1 o(List<io.grpc.l> list) {
        this.f289642c.addAll(list);
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public o1 p(io.grpc.l... lVarArr) {
        return o(Arrays.asList(lVarArr));
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public o1 t(int i10) {
        this.f289657r = i10;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public o1 w(int i10) {
        this.f289656q = i10;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public o1 x(int i10) {
        com.google.common.base.j0.e(i10 >= 0, "maxTraceEvents must be non-negative");
        this.f289662w = i10;
        return this;
    }

    @Override // io.grpc.s1
    @Deprecated
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public o1 y(io.grpc.x1.d dVar) {
        SocketAddress socketAddress = this.f289648i;
        com.google.common.base.j0.x0(socketAddress == null, "directServerAddress is set (%s), which forbids the use of NameResolverFactory", socketAddress);
        if (dVar == null) {
            this.f289643d = io.grpc.z1.d();
            return this;
        }
        io.grpc.z1 z1Var = new io.grpc.z1();
        if (dVar instanceof io.grpc.y1) {
            z1Var.j((io.grpc.y1) dVar);
        } else {
            z1Var.j(new x1(dVar));
        }
        this.f289643d = z1Var;
        return this;
    }

    o1 j0(io.grpc.z1 z1Var) {
        this.f289643d = z1Var;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public o1 z(Executor executor) {
        if (executor != null) {
            this.f289641b = new k0(executor);
            return this;
        }
        this.f289641b = P;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public o1 A(String str) {
        this.f289650k = K(str);
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public o1 B(long j10) {
        com.google.common.base.j0.e(j10 > 0, "per RPC buffer limit must be positive");
        this.f289659t = j10;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public o1 C(@fj.h io.grpc.g2 g2Var) {
        this.A = g2Var;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public o1 D(long j10) {
        com.google.common.base.j0.e(j10 > 0, "retry buffer size must be positive");
        this.f289658s = j10;
        return this;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public o1 E(io.grpc.b bVar) {
        this.f289665z = bVar;
        return this;
    }

    public void q0(boolean z10) {
        this.C = z10;
    }

    public void r0(boolean z10) {
        this.E = z10;
    }

    public void s0(boolean z10) {
        this.F = z10;
    }

    public void t0(boolean z10) {
        this.G = z10;
    }

    public void u0(boolean z10) {
        this.D = z10;
    }

    public void v0(boolean z10) {
        this.H = z10;
    }

    @Override // io.grpc.s1
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public o1 I(@fj.h String str) {
        this.f289649j = str;
        return this;
    }

    public o1(String str, @fj.h io.grpc.g gVar, @fj.h io.grpc.d dVar, c cVar, @fj.h b bVar) {
        z1<? extends Executor> z1Var = P;
        this.f289640a = z1Var;
        this.f289641b = z1Var;
        this.f289642c = new ArrayList();
        this.f289643d = io.grpc.z1.d();
        this.f289644e = new ArrayList();
        this.f289651l = v0.H;
        this.f289653n = Q;
        this.f289654o = R;
        this.f289655p = N;
        this.f289656q = 5;
        this.f289657r = 5;
        this.f289658s = S;
        this.f289659t = 1048576L;
        this.f289660u = true;
        this.f289661v = io.grpc.v0.w();
        this.f289664y = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.F = false;
        this.G = true;
        this.H = true;
        this.f289645f = (String) com.google.common.base.j0.F(str, androidx.constraintlayout.core.motion.utils.v.a.M);
        this.f289646g = gVar;
        this.f289647h = dVar;
        this.I = (c) com.google.common.base.j0.F(cVar, "clientTransportFactoryBuilder");
        this.f289648i = null;
        if (bVar != null) {
            this.J = bVar;
        } else {
            this.J = new f();
        }
    }

    public o1(SocketAddress socketAddress, String str, c cVar, @fj.h b bVar) {
        this(socketAddress, str, null, null, cVar, bVar);
    }

    public o1(SocketAddress socketAddress, String str, @fj.h io.grpc.g gVar, @fj.h io.grpc.d dVar, c cVar, @fj.h b bVar) {
        z1<? extends Executor> z1Var = P;
        this.f289640a = z1Var;
        this.f289641b = z1Var;
        this.f289642c = new ArrayList();
        this.f289643d = io.grpc.z1.d();
        this.f289644e = new ArrayList();
        this.f289651l = v0.H;
        this.f289653n = Q;
        this.f289654o = R;
        this.f289655p = N;
        this.f289656q = 5;
        this.f289657r = 5;
        this.f289658s = S;
        this.f289659t = 1048576L;
        this.f289660u = true;
        this.f289661v = io.grpc.v0.w();
        this.f289664y = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.F = false;
        this.G = true;
        this.H = true;
        this.f289645f = e0(socketAddress);
        this.f289646g = gVar;
        this.f289647h = dVar;
        this.I = (c) com.google.common.base.j0.F(cVar, "clientTransportFactoryBuilder");
        this.f289648i = socketAddress;
        io.grpc.z1 z1Var2 = new io.grpc.z1();
        z1Var2.j(new d(socketAddress, str));
        this.f289643d = z1Var2;
        if (bVar != null) {
            this.J = bVar;
        } else {
            this.J = new f();
        }
    }
}

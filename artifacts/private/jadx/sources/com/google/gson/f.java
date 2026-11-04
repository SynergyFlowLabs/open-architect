package com.google.gson;

import com.google.gson.internal.h0;
import com.google.gson.internal.j0;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes5.dex */
public final class f {
    static final y A = null;
    static final boolean C = true;
    static final boolean D = false;
    static final boolean E = false;
    static final boolean F = false;
    static final boolean G = true;
    private static final String L = ")]}'\n";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final boolean f125265z = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Map<com.google.gson.reflect.a<?>, b0<?>>> f125266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<com.google.gson.reflect.a<?>, b0<?>> f125267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.gson.internal.v f125268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.gson.internal.bind.e f125269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<c0> f125270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.google.gson.internal.w f125271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.google.gson.d f125272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<Type, h<?>> f125273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f125274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f125275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f125276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f125277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final com.google.gson.e f125278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final y f125279n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f125280o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f125281p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final String f125282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f125283r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int f125284s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final w f125285t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final List<c0> f125286u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final List<c0> f125287v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final a0 f125288w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final a0 f125289x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final List<x> f125290y;
    static final com.google.gson.e B = com.google.gson.e.f125260d;
    static final String H = null;
    static final com.google.gson.d I = com.google.gson.c.f125252a;
    static final a0 J = z.f125653a;
    static final a0 K = z.f125654b;

    class a extends b0<Number> {
        a() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() != com.google.gson.stream.c.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.a7();
            return null;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.y();
                return;
            }
            double dDoubleValue = number.doubleValue();
            f.d(dDoubleValue);
            dVar.g0(dDoubleValue);
        }
    }

    class b extends b0<Number> {
        b() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() != com.google.gson.stream.c.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.a7();
            return null;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.y();
                return;
            }
            float fFloatValue = number.floatValue();
            f.d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            dVar.r0(number);
        }
    }

    class c extends b0<Number> {
        c() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() != com.google.gson.stream.c.NULL) {
                return Long.valueOf(aVar.nextLong());
            }
            aVar.a7();
            return null;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.y();
            } else {
                dVar.w0(number.toString());
            }
        }
    }

    class d extends b0<AtomicLong> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0 f125293a;

        d(b0 b0Var) {
            this.f125293a = b0Var;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicLong read(com.google.gson.stream.a aVar) throws IOException {
            return new AtomicLong(((Number) this.f125293a.read(aVar)).longValue());
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, AtomicLong atomicLong) throws IOException {
            this.f125293a.write(dVar, Long.valueOf(atomicLong.get()));
        }
    }

    class e extends b0<AtomicLongArray> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0 f125294a;

        e(b0 b0Var) {
            this.f125294a = b0Var;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray read(com.google.gson.stream.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.J0();
            while (aVar.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f125294a.read(aVar)).longValue()));
            }
            aVar.F0();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, AtomicLongArray atomicLongArray) throws IOException {
            dVar.d();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f125294a.write(dVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            dVar.g();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.f$f, reason: collision with other inner class name */
    static class C1196f<T> extends com.google.gson.internal.bind.m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b0<T> f125295a = null;

        C1196f() {
        }

        private b0<T> b() {
            b0<T> b0Var = this.f125295a;
            if (b0Var != null) {
                return b0Var;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.internal.bind.m
        public b0<T> a() {
            return b();
        }

        public void c(b0<T> b0Var) {
            if (this.f125295a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f125295a = b0Var;
        }

        @Override // com.google.gson.b0
        public T read(com.google.gson.stream.a aVar) throws IOException {
            return b().read(aVar);
        }

        @Override // com.google.gson.b0
        public void write(com.google.gson.stream.d dVar, T t10) throws IOException {
            b().write(dVar, t10);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f() {
        com.google.gson.internal.w wVar = com.google.gson.internal.w.f125528h;
        com.google.gson.d dVar = I;
        Map map = Collections.EMPTY_MAP;
        com.google.gson.e eVar = B;
        y yVar = A;
        w wVar2 = w.f125637a;
        String str = H;
        List list = Collections.EMPTY_LIST;
        this(wVar, dVar, map, false, false, false, true, eVar, yVar, false, true, wVar2, str, 2, 2, list, list, list, J, K, list);
    }

    private static void a(Object obj, com.google.gson.stream.a aVar) {
        if (obj != null) {
            try {
                if (aVar.x() == com.google.gson.stream.c.END_DOCUMENT) {
                } else {
                    throw new v("JSON document was not fully consumed.");
                }
            } catch (com.google.gson.stream.e e10) {
                throw new v(e10);
            } catch (IOException e11) {
                throw new m(e11);
            }
        }
    }

    private static b0<AtomicLong> b(b0<Number> b0Var) {
        return new d(b0Var).nullSafe();
    }

    private static b0<AtomicLongArray> c(b0<Number> b0Var) {
        return new e(b0Var).nullSafe();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private b0<Number> e(boolean z10) {
        return z10 ? com.google.gson.internal.bind.p.f125429v : new a();
    }

    private b0<Number> h(boolean z10) {
        return z10 ? com.google.gson.internal.bind.p.f125428u : new b();
    }

    private static b0<Number> x(w wVar) {
        return wVar == w.f125637a ? com.google.gson.internal.bind.p.f125427t : new c();
    }

    public com.google.gson.stream.d A(Writer writer) throws IOException {
        if (this.f125276k) {
            writer.write(L);
        }
        com.google.gson.stream.d dVar = new com.google.gson.stream.d(writer);
        dVar.R(this.f125278m);
        dVar.T(this.f125277l);
        y yVar = this.f125279n;
        if (yVar == null) {
            yVar = y.LEGACY_STRICT;
        }
        dVar.d0(yVar);
        dVar.Y(this.f125274i);
        return dVar;
    }

    public boolean B() {
        return this.f125274i;
    }

    public String C(l lVar) {
        StringBuilder sb2 = new StringBuilder();
        G(lVar, sb2);
        return sb2.toString();
    }

    public String D(Object obj) {
        return obj == null ? C(n.f125555a) : E(obj, obj.getClass());
    }

    public String E(Object obj, Type type) {
        StringBuilder sb2 = new StringBuilder();
        J(obj, type, sb2);
        return sb2.toString();
    }

    public void F(l lVar, com.google.gson.stream.d dVar) throws m {
        y yVarM = dVar.m();
        boolean zO = dVar.o();
        boolean zL = dVar.l();
        dVar.T(this.f125277l);
        dVar.Y(this.f125274i);
        y yVar = this.f125279n;
        if (yVar != null) {
            dVar.d0(yVar);
        } else if (dVar.m() == y.LEGACY_STRICT) {
            dVar.d0(y.LENIENT);
        }
        try {
            try {
                j0.b(lVar, dVar);
                dVar.d0(yVarM);
                dVar.T(zO);
                dVar.Y(zL);
            } catch (IOException e10) {
                throw new m(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            dVar.d0(yVarM);
            dVar.T(zO);
            dVar.Y(zL);
            throw th2;
        }
    }

    public void G(l lVar, Appendable appendable) throws m {
        try {
            F(lVar, A(j0.c(appendable)));
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public void H(Object obj, Appendable appendable) throws m {
        if (obj != null) {
            J(obj, obj.getClass(), appendable);
        } else {
            G(n.f125555a, appendable);
        }
    }

    public void I(Object obj, Type type, com.google.gson.stream.d dVar) throws m {
        b0 b0VarT = t(com.google.gson.reflect.a.get(type));
        y yVarM = dVar.m();
        y yVar = this.f125279n;
        if (yVar != null) {
            dVar.d0(yVar);
        } else if (dVar.m() == y.LEGACY_STRICT) {
            dVar.d0(y.LENIENT);
        }
        boolean zO = dVar.o();
        boolean zL = dVar.l();
        dVar.T(this.f125277l);
        dVar.Y(this.f125274i);
        try {
            try {
                b0VarT.write(dVar, obj);
                dVar.d0(yVarM);
                dVar.T(zO);
                dVar.Y(zL);
            } catch (IOException e10) {
                throw new m(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            dVar.d0(yVarM);
            dVar.T(zO);
            dVar.Y(zL);
            throw th2;
        }
    }

    public void J(Object obj, Type type, Appendable appendable) throws m {
        try {
            I(obj, type, A(j0.c(appendable)));
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public l K(Object obj) {
        return obj == null ? n.f125555a : L(obj, obj.getClass());
    }

    public l L(Object obj, Type type) {
        com.google.gson.internal.bind.h hVar = new com.google.gson.internal.bind.h();
        I(obj, type, hVar);
        return hVar.B0();
    }

    @Deprecated
    public com.google.gson.internal.w f() {
        return this.f125271f;
    }

    public com.google.gson.d g() {
        return this.f125272g;
    }

    public <T> T i(l lVar, com.google.gson.reflect.a<T> aVar) throws v {
        if (lVar == null) {
            return null;
        }
        return (T) l(new com.google.gson.internal.bind.g(lVar), aVar);
    }

    public <T> T j(l lVar, Class<T> cls) throws v {
        return (T) i(lVar, com.google.gson.reflect.a.get((Class) cls));
    }

    public <T> T k(l lVar, Type type) throws v {
        return (T) i(lVar, com.google.gson.reflect.a.get(type));
    }

    public <T> T l(com.google.gson.stream.a aVar, com.google.gson.reflect.a<T> aVar2) throws v, m {
        boolean z10;
        y yVarJ = aVar.j();
        y yVar = this.f125279n;
        if (yVar != null) {
            aVar.R(yVar);
        } else if (aVar.j() == y.LEGACY_STRICT) {
            aVar.R(y.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        try {
                            aVar.x();
                            z10 = false;
                            try {
                                b0<T> b0VarT = t(aVar2);
                                T t10 = b0VarT.read(aVar);
                                Class clsD = h0.d(aVar2.getRawType());
                                if (t10 != null && !clsD.isInstance(t10)) {
                                    throw new ClassCastException("Type adapter '" + b0VarT + "' returned wrong type; requested " + aVar2.getRawType() + " but got instance of " + t10.getClass() + "\nVerify that the adapter was registered for the correct type.");
                                }
                                aVar.R(yVarJ);
                                return t10;
                            } catch (EOFException e10) {
                                e = e10;
                                if (!z10) {
                                    throw new v(e);
                                }
                                aVar.R(yVarJ);
                                return null;
                            }
                        } catch (Throwable th2) {
                            aVar.R(yVarJ);
                            throw th2;
                        }
                    } catch (EOFException e11) {
                        e = e11;
                        z10 = true;
                    }
                } catch (IOException e12) {
                    throw new v(e12);
                }
            } catch (IllegalStateException e13) {
                throw new v(e13);
            }
        } catch (AssertionError e14) {
            throw new AssertionError("AssertionError (GSON 2.13.2): " + e14.getMessage(), e14);
        }
    }

    public <T> T m(com.google.gson.stream.a aVar, Type type) throws v, m {
        return (T) l(aVar, com.google.gson.reflect.a.get(type));
    }

    public <T> T n(Reader reader, com.google.gson.reflect.a<T> aVar) throws v, m {
        com.google.gson.stream.a aVarZ = z(reader);
        T t10 = (T) l(aVarZ, aVar);
        a(t10, aVarZ);
        return t10;
    }

    public <T> T o(Reader reader, Class<T> cls) throws v, m {
        return (T) n(reader, com.google.gson.reflect.a.get((Class) cls));
    }

    public <T> T p(Reader reader, Type type) throws v, m {
        return (T) n(reader, com.google.gson.reflect.a.get(type));
    }

    public <T> T q(String str, com.google.gson.reflect.a<T> aVar) throws v {
        if (str != null) {
            return (T) n(new StringReader(str), aVar);
        }
        boolean z10 = true | false;
        return null;
    }

    public <T> T r(String str, Class<T> cls) throws v {
        return (T) q(str, com.google.gson.reflect.a.get((Class) cls));
    }

    public <T> T s(String str, Type type) throws v {
        return (T) q(str, com.google.gson.reflect.a.get(type));
    }

    public <T> b0<T> t(com.google.gson.reflect.a<T> aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        b0<T> b0Var = (b0) this.f125267b.get(aVar);
        if (b0Var != null) {
            return b0Var;
        }
        Map<? extends com.google.gson.reflect.a<?>, ? extends b0<?>> map = this.f125266a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f125266a.set((Map<com.google.gson.reflect.a<?>, b0<?>>) map);
            z10 = true;
        } else {
            b0<T> b0Var2 = (b0) map.get(aVar);
            if (b0Var2 != null) {
                return b0Var2;
            }
            z10 = false;
        }
        try {
            C1196f c1196f = new C1196f();
            map.put(aVar, c1196f);
            Iterator<c0> it = this.f125270e.iterator();
            b0<T> b0VarCreate = null;
            while (it.hasNext()) {
                b0VarCreate = it.next().create(this, aVar);
                if (b0VarCreate != null) {
                    c1196f.c(b0VarCreate);
                    map.put(aVar, b0VarCreate);
                    break;
                }
            }
            if (z10) {
                this.f125266a.remove();
            }
            if (b0VarCreate != null) {
                if (z10) {
                    this.f125267b.putAll(map);
                }
                return b0VarCreate;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + aVar);
        } catch (Throwable th2) {
            if (z10) {
                this.f125266a.remove();
            }
            throw th2;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f125274i + ",factories:" + this.f125270e + ",instanceCreators:" + this.f125268c + "}";
    }

    public <T> b0<T> u(Class<T> cls) {
        return t(com.google.gson.reflect.a.get((Class) cls));
    }

    public <T> b0<T> v(c0 c0Var, com.google.gson.reflect.a<T> aVar) {
        Objects.requireNonNull(c0Var, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        if (this.f125269d.d(aVar, c0Var)) {
            c0Var = this.f125269d;
        }
        boolean z10 = false;
        for (c0 c0Var2 : this.f125270e) {
            if (z10) {
                b0<T> b0VarCreate = c0Var2.create(this, aVar);
                if (b0VarCreate != null) {
                    return b0VarCreate;
                }
            } else if (c0Var2 == c0Var) {
                z10 = true;
            }
        }
        if (!z10) {
            return t(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public boolean w() {
        return this.f125277l;
    }

    public g y() {
        return new g(this);
    }

    public com.google.gson.stream.a z(Reader reader) {
        com.google.gson.stream.a aVar = new com.google.gson.stream.a(reader);
        y yVar = this.f125279n;
        if (yVar == null) {
            yVar = y.LEGACY_STRICT;
        }
        aVar.R(yVar);
        return aVar;
    }

    f(com.google.gson.internal.w wVar, com.google.gson.d dVar, Map<Type, h<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, com.google.gson.e eVar, y yVar, boolean z14, boolean z15, w wVar2, String str, int i10, int i11, List<c0> list, List<c0> list2, List<c0> list3, a0 a0Var, a0 a0Var2, List<x> list4) {
        this.f125266a = new ThreadLocal<>();
        this.f125267b = new ConcurrentHashMap();
        this.f125271f = wVar;
        this.f125272g = dVar;
        this.f125273h = map;
        com.google.gson.internal.v vVar = new com.google.gson.internal.v(map, z15, list4);
        this.f125268c = vVar;
        this.f125274i = z10;
        this.f125275j = z11;
        this.f125276k = z12;
        this.f125277l = z13;
        this.f125278m = eVar;
        this.f125279n = yVar;
        this.f125280o = z14;
        this.f125281p = z15;
        this.f125285t = wVar2;
        this.f125282q = str;
        this.f125283r = i10;
        this.f125284s = i11;
        this.f125286u = list;
        this.f125287v = list2;
        this.f125288w = a0Var;
        this.f125289x = a0Var2;
        this.f125290y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.p.W);
        arrayList.add(com.google.gson.internal.bind.k.a(a0Var));
        arrayList.add(wVar);
        arrayList.addAll(list3);
        arrayList.add(com.google.gson.internal.bind.p.C);
        arrayList.add(com.google.gson.internal.bind.p.f125420m);
        arrayList.add(com.google.gson.internal.bind.p.f125414g);
        arrayList.add(com.google.gson.internal.bind.p.f125416i);
        arrayList.add(com.google.gson.internal.bind.p.f125418k);
        b0<Number> b0VarX = x(wVar2);
        arrayList.add(com.google.gson.internal.bind.p.c(Long.TYPE, Long.class, b0VarX));
        arrayList.add(com.google.gson.internal.bind.p.c(Double.TYPE, Double.class, e(z14)));
        arrayList.add(com.google.gson.internal.bind.p.c(Float.TYPE, Float.class, h(z14)));
        arrayList.add(com.google.gson.internal.bind.j.a(a0Var2));
        arrayList.add(com.google.gson.internal.bind.p.f125422o);
        arrayList.add(com.google.gson.internal.bind.p.f125424q);
        arrayList.add(com.google.gson.internal.bind.p.b(AtomicLong.class, b(b0VarX)));
        arrayList.add(com.google.gson.internal.bind.p.b(AtomicLongArray.class, c(b0VarX)));
        arrayList.add(com.google.gson.internal.bind.p.f125426s);
        arrayList.add(com.google.gson.internal.bind.p.f125431x);
        arrayList.add(com.google.gson.internal.bind.p.E);
        arrayList.add(com.google.gson.internal.bind.p.G);
        arrayList.add(com.google.gson.internal.bind.p.b(BigDecimal.class, com.google.gson.internal.bind.p.f125433z));
        arrayList.add(com.google.gson.internal.bind.p.b(BigInteger.class, com.google.gson.internal.bind.p.A));
        arrayList.add(com.google.gson.internal.bind.p.b(com.google.gson.internal.b0.class, com.google.gson.internal.bind.p.B));
        arrayList.add(com.google.gson.internal.bind.p.I);
        arrayList.add(com.google.gson.internal.bind.p.K);
        arrayList.add(com.google.gson.internal.bind.p.O);
        arrayList.add(com.google.gson.internal.bind.p.Q);
        arrayList.add(com.google.gson.internal.bind.p.U);
        arrayList.add(com.google.gson.internal.bind.p.M);
        arrayList.add(com.google.gson.internal.bind.p.f125411d);
        arrayList.add(com.google.gson.internal.bind.c.f125329d);
        arrayList.add(com.google.gson.internal.bind.p.S);
        if (com.google.gson.internal.sql.d.f125517a) {
            arrayList.add(com.google.gson.internal.sql.d.f125521e);
            arrayList.add(com.google.gson.internal.sql.d.f125520d);
            arrayList.add(com.google.gson.internal.sql.d.f125522f);
        }
        arrayList.add(com.google.gson.internal.bind.a.f125322c);
        arrayList.add(com.google.gson.internal.bind.p.f125409b);
        arrayList.add(new com.google.gson.internal.bind.b(vVar));
        arrayList.add(new com.google.gson.internal.bind.i(vVar, z11));
        com.google.gson.internal.bind.e eVar2 = new com.google.gson.internal.bind.e(vVar);
        this.f125269d = eVar2;
        arrayList.add(eVar2);
        arrayList.add(com.google.gson.internal.bind.p.X);
        arrayList.add(new com.google.gson.internal.bind.l(vVar, dVar, wVar, eVar2, list4));
        this.f125270e = Collections.unmodifiableList(arrayList);
    }
}

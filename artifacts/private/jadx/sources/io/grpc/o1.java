package io.grpc;

import io.sentry.a8;
import io.sentry.k9;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes13.dex */
@gj.c
@e0("https://github.com/grpc/grpc-java/issues/1771")
public abstract class o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @t0
    public static final io.grpc.a.c<Map<String, ?>> f290191b = io.grpc.a.c.a("internal:health-checking-config");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @t0
    public static final b.C1979b<l> f290192c = b.C1979b.b("internal:health-check-consumer-listener");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @t0
    public static final io.grpc.a.c<Boolean> f290193d = io.grpc.a.c.a("internal:has-health-check-producer-listener");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.grpc.a.c<Boolean> f290194e = io.grpc.a.c.a("io.grpc.IS_PETIOLE_POLICY");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final k f290195f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f290196a;

    class a extends k {
        a() {
        }

        @Override // io.grpc.o1.k
        public g a(h hVar) {
            return g.g();
        }

        public String toString() {
            return "EMPTY_PICKER";
        }
    }

    @e0("https://github.com/grpc/grpc-java/issues/1771")
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d0> f290197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.a f290198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[][] f290199c;

        @e0("https://github.com/grpc/grpc-java/issues/1771")
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private List<d0> f290200a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private io.grpc.a f290201b = io.grpc.a.f288673c;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object[][] f290202c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public a d(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                this.f290202c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public <T> a b(C1979b<T> c1979b, T t10) {
                com.google.common.base.j0.F(c1979b, "key");
                com.google.common.base.j0.F(t10, "value");
                int length = 0;
                while (true) {
                    Object[][] objArr = this.f290202c;
                    if (length >= objArr.length) {
                        length = -1;
                        break;
                    }
                    if (c1979b.equals(objArr[length][0])) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f290202c.length + 1, 2);
                    Object[][] objArr3 = this.f290202c;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    this.f290202c = objArr2;
                    length = objArr2.length - 1;
                }
                this.f290202c[length] = new Object[]{c1979b, t10};
                return this;
            }

            public b c() {
                return new b(this.f290200a, this.f290201b, this.f290202c, null);
            }

            public a e(d0 d0Var) {
                this.f290200a = Collections.singletonList(d0Var);
                return this;
            }

            public a f(List<d0> list) {
                com.google.common.base.j0.e(!list.isEmpty(), "addrs is empty");
                this.f290200a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public a g(io.grpc.a aVar) {
                this.f290201b = (io.grpc.a) com.google.common.base.j0.F(aVar, k9.b.f305803j);
                return this;
            }
        }

        /* JADX INFO: renamed from: io.grpc.o1$b$b, reason: collision with other inner class name */
        @e0("https://github.com/grpc/grpc-java/issues/1771")
        public static final class C1979b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f290203a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final T f290204b;

            private C1979b(String str, T t10) {
                this.f290203a = str;
                this.f290204b = t10;
            }

            public static <T> C1979b<T> b(String str) {
                com.google.common.base.j0.F(str, "debugString");
                return new C1979b<>(str, null);
            }

            public static <T> C1979b<T> c(String str, T t10) {
                com.google.common.base.j0.F(str, "debugString");
                return new C1979b<>(str, t10);
            }

            public T d() {
                return this.f290204b;
            }

            public String toString() {
                return this.f290203a;
            }
        }

        /* synthetic */ b(List list, io.grpc.a aVar, Object[][] objArr, a aVar2) {
            this(list, aVar, objArr);
        }

        public static a d() {
            return new a();
        }

        public List<d0> a() {
            return this.f290197a;
        }

        public io.grpc.a b() {
            return this.f290198b;
        }

        public <T> T c(C1979b<T> c1979b) {
            com.google.common.base.j0.F(c1979b, "key");
            int i10 = 0;
            while (true) {
                Object[][] objArr = this.f290199c;
                if (i10 >= objArr.length) {
                    return (T) ((C1979b) c1979b).f290204b;
                }
                if (c1979b.equals(objArr[i10][0])) {
                    return (T) this.f290199c[i10][1];
                }
                i10++;
            }
        }

        public a e() {
            return d().f(this.f290197a).g(this.f290198b).d(this.f290199c);
        }

        public String toString() {
            return com.google.common.base.b0.c(this).f("addrs", this.f290197a).f(k9.b.f305803j, this.f290198b).f("customOptions", Arrays.deepToString(this.f290199c)).toString();
        }

        private b(List<d0> list, io.grpc.a aVar, Object[][] objArr) {
            this.f290197a = (List) com.google.common.base.j0.F(list, "addresses are not set");
            this.f290198b = (io.grpc.a) com.google.common.base.j0.F(aVar, k9.b.f305803j);
            this.f290199c = (Object[][]) com.google.common.base.j0.F(objArr, "customOptions");
        }
    }

    @Deprecated
    public static final class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y2 f290205a;

        public c(y2 y2Var) {
            this.f290205a = (y2) com.google.common.base.j0.F(y2Var, "error");
        }

        @Override // io.grpc.o1.k
        public g a(h hVar) {
            return g.f(this.f290205a);
        }

        public String toString() {
            return com.google.common.base.b0.c(this).f("error", this.f290205a).toString();
        }
    }

    @gj.d
    @e0("https://github.com/grpc/grpc-java/issues/1771")
    public static abstract class d {
        public abstract o1 a(f fVar);
    }

    public static final class e extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f290206a;

        public e(g gVar) {
            this.f290206a = (g) com.google.common.base.j0.F(gVar, "result");
        }

        @Override // io.grpc.o1.k
        public g a(h hVar) {
            return this.f290206a;
        }

        public String toString() {
            return "FixedResultPicker(" + this.f290206a + ")";
        }
    }

    @gj.d
    @e0("https://github.com/grpc/grpc-java/issues/1771")
    public static abstract class f {
        public abstract r1 a(d0 d0Var, String str);

        public r1 b(List<d0> list, String str) {
            throw new UnsupportedOperationException();
        }

        public r1 c(String str) {
            return d(str).b();
        }

        @Deprecated
        public s1<?> d(String str) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public s1<?> e(String str, io.grpc.g gVar) {
            throw new UnsupportedOperationException();
        }

        public j f(b bVar) {
            throw new UnsupportedOperationException();
        }

        public abstract String g();

        public io.grpc.g h() {
            return n().a();
        }

        public io.grpc.h i() {
            throw new UnsupportedOperationException();
        }

        public x1.b j() {
            throw new UnsupportedOperationException();
        }

        public z1 k() {
            throw new UnsupportedOperationException();
        }

        public ScheduledExecutorService l() {
            throw new UnsupportedOperationException();
        }

        public c3 m() {
            throw new UnsupportedOperationException();
        }

        public io.grpc.g n() {
            throw new UnsupportedOperationException();
        }

        @e0("https://github.com/grpc/grpc-java/issues/8088")
        @Deprecated
        public void o() {
        }

        public void p() {
            throw new UnsupportedOperationException();
        }

        public abstract void q(@fj.g u uVar, @fj.g k kVar);

        public void r(r1 r1Var, d0 d0Var) {
            throw new UnsupportedOperationException();
        }

        public void s(r1 r1Var, List<d0> list) {
            throw new UnsupportedOperationException();
        }
    }

    @gj.b
    @e0("https://github.com/grpc/grpc-java/issues/1771")
    public static final class g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final g f290207e = new g(null, null, y2.f291450e, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.h
        private final j f290208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        private final n.a f290209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y2 f290210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f290211d;

        private g(@fj.h j jVar, @fj.h n.a aVar, y2 y2Var, boolean z10) {
            this.f290208a = jVar;
            this.f290209b = aVar;
            this.f290210c = (y2) com.google.common.base.j0.F(y2Var, "status");
            this.f290211d = z10;
        }

        public static g e(y2 y2Var) {
            com.google.common.base.j0.e(!y2Var.r(), "drop status shouldn't be OK");
            return new g(null, null, y2Var, true);
        }

        public static g f(y2 y2Var) {
            com.google.common.base.j0.e(!y2Var.r(), "error status shouldn't be OK");
            return new g(null, null, y2Var, false);
        }

        public static g g() {
            return f290207e;
        }

        public static g h(j jVar) {
            return i(jVar, null);
        }

        public static g i(j jVar, @fj.h n.a aVar) {
            return new g((j) com.google.common.base.j0.F(jVar, "subchannel"), aVar, y2.f291450e, false);
        }

        public y2 a() {
            return this.f290210c;
        }

        @fj.h
        public n.a b() {
            return this.f290209b;
        }

        @fj.h
        public j c() {
            return this.f290208a;
        }

        public boolean d() {
            return this.f290211d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return com.google.common.base.d0.a(this.f290208a, gVar.f290208a) && com.google.common.base.d0.a(this.f290210c, gVar.f290210c) && com.google.common.base.d0.a(this.f290209b, gVar.f290209b) && this.f290211d == gVar.f290211d;
        }

        public int hashCode() {
            return com.google.common.base.d0.b(this.f290208a, this.f290210c, this.f290209b, Boolean.valueOf(this.f290211d));
        }

        public String toString() {
            return com.google.common.base.b0.c(this).f("subchannel", this.f290208a).f("streamTracerFactory", this.f290209b).f("status", this.f290210c).g("drop", this.f290211d).toString();
        }
    }

    @e0("https://github.com/grpc/grpc-java/issues/1771")
    public static abstract class h {
        public abstract io.grpc.e a();

        public abstract v1 b();

        public abstract w1<?, ?> c();
    }

    @e0("https://github.com/grpc/grpc-java/issues/1771")
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d0> f290212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.a f290213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.h
        private final Object f290214c;

        @e0("https://github.com/grpc/grpc-java/issues/1771")
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private List<d0> f290215a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private io.grpc.a f290216b = io.grpc.a.f288673c;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @fj.h
            private Object f290217c;

            a() {
            }

            public i a() {
                return new i(this.f290215a, this.f290216b, this.f290217c, null);
            }

            public a b(List<d0> list) {
                this.f290215a = list;
                return this;
            }

            public a c(io.grpc.a aVar) {
                this.f290216b = aVar;
                return this;
            }

            public a d(@fj.h Object obj) {
                this.f290217c = obj;
                return this;
            }
        }

        /* synthetic */ i(List list, io.grpc.a aVar, Object obj, a aVar2) {
            this(list, aVar, obj);
        }

        public static a d() {
            return new a();
        }

        public List<d0> a() {
            return this.f290212a;
        }

        public io.grpc.a b() {
            return this.f290213b;
        }

        @fj.h
        public Object c() {
            return this.f290214c;
        }

        public a e() {
            return d().b(this.f290212a).c(this.f290213b).d(this.f290214c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return com.google.common.base.d0.a(this.f290212a, iVar.f290212a) && com.google.common.base.d0.a(this.f290213b, iVar.f290213b) && com.google.common.base.d0.a(this.f290214c, iVar.f290214c);
        }

        public int hashCode() {
            return com.google.common.base.d0.b(this.f290212a, this.f290213b, this.f290214c);
        }

        public String toString() {
            return com.google.common.base.b0.c(this).f("addresses", this.f290212a).f(a8.b.f303905f, this.f290213b).f("loadBalancingPolicyConfig", this.f290214c).toString();
        }

        private i(List<d0> list, io.grpc.a aVar, Object obj) {
            this.f290212a = Collections.unmodifiableList(new ArrayList((Collection) com.google.common.base.j0.F(list, "addresses")));
            this.f290213b = (io.grpc.a) com.google.common.base.j0.F(aVar, a8.b.f303905f);
            this.f290214c = obj;
        }
    }

    @e0("https://github.com/grpc/grpc-java/issues/1771")
    public static abstract class j {
        @t0
        public io.grpc.f a() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0011  */
        public final d0 b() {
            boolean z10;
            List<d0> listC = c();
            if (listC != null) {
                z10 = true;
                if (listC.size() != 1) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            com.google.common.base.j0.x0(z10, "%s does not have exactly one group", listC);
            return listC.get(0);
        }

        public List<d0> c() {
            throw new UnsupportedOperationException();
        }

        public abstract io.grpc.a d();

        public io.grpc.h e() {
            throw new UnsupportedOperationException();
        }

        @t0
        public Object f() {
            throw new UnsupportedOperationException();
        }

        public abstract void g();

        public abstract void h();

        public void i(l lVar) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void j(List<d0> list) {
            throw new UnsupportedOperationException();
        }
    }

    @gj.d
    @e0("https://github.com/grpc/grpc-java/issues/1771")
    public static abstract class k {
        public abstract g a(h hVar);

        @Deprecated
        public void b() {
        }
    }

    public interface l {
        void a(v vVar);
    }

    public y2 a(i iVar) {
        if (!iVar.a().isEmpty() || b()) {
            int i10 = this.f290196a;
            this.f290196a = i10 + 1;
            if (i10 == 0) {
                d(iVar);
            }
            this.f290196a = 0;
            return y2.f291450e;
        }
        y2 y2VarU = y2.f291465t.u("NameResolver returned no usable address. addrs=" + iVar.a() + ", attrs=" + iVar.b());
        c(y2VarU);
        return y2VarU;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(y2 y2Var);

    public void d(i iVar) {
        int i10 = this.f290196a;
        this.f290196a = i10 + 1;
        if (i10 == 0) {
            a(iVar);
        }
        this.f290196a = 0;
    }

    @Deprecated
    public void e(j jVar, v vVar) {
    }

    public void f() {
    }

    public abstract void g();
}
